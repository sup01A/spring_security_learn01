package org.example.spring_security_learn01.service.impl;

import org.example.spring_security_learn01.domain.po.Authority;
import org.example.spring_security_learn01.domain.po.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserDetailsServiceImpl implements UserDetailsService {
    @Autowired
    private UserServiceImpl userService;
    @Autowired
    private AuthorityServiceImpl authorityService;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userService.getByUsername(username);
        if (user == null){
            throw new UsernameNotFoundException(username);
        }
        List<Authority> userAuthority = authorityService.getByUsername(username);
        // 对用户权限进行封装
        List<SimpleGrantedAuthority> authorityList = userAuthority.stream()
                .map(authority -> new SimpleGrantedAuthority(authority.getAuthority()))
                .toList();
        org.springframework.security.core.userdetails.User userDetail = new org.springframework.security.core.userdetails.User(user.getUsername(), user.getPassword(), authorityList);
        return  userDetail;
    }
}
