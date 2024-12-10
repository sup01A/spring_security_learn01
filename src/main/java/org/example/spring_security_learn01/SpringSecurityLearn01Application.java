package org.example.spring_security_learn01;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("org.example.spring_security_learn01.mapper")
public class SpringSecurityLearn01Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringSecurityLearn01Application.class, args);
    }

}
