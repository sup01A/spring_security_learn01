package org.example.spring_security_learn01;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootTest
class SpringSecurityLearn01ApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    void test01() {
        BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
        String encode = bCryptPasswordEncoder.encode("password");
        System.out.println(encode);
    }
}
