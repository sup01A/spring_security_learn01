package org.example.spring_security_learn01.service.impl;

import org.example.spring_security_learn01.domain.po.User;
import org.example.spring_security_learn01.mapper.UserMapper;
import org.example.spring_security_learn01.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author oushubo
 * @since 2024-12-10
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {
    public User getByUsername(String username){
        return lambdaQuery()
                .eq(User::getUsername, username)
                .one();
    }
}
