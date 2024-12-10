package org.example.spring_security_learn01.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
    @GetMapping("/secure")
    public String secureMethod(){
        return "this is secure page";
    }
}
