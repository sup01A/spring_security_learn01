package org.example.spring_security_learn01.service.impl;

import org.example.spring_security_learn01.domain.po.Authority;
import org.example.spring_security_learn01.mapper.AuthorityMapper;
import org.example.spring_security_learn01.service.IAuthorityService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author oushubo
 * @since 2024-12-10
 */
@Service
public class AuthorityServiceImpl extends ServiceImpl<AuthorityMapper, Authority> implements IAuthorityService {
    public List<Authority> getByUsername(String username){
        return lambdaQuery()
                .eq(Authority::getUsername, username)
                .list();
    }
}
