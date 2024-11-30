package com.jfcodiaz.curso.springboot.project.springboott_web.controllers;

import java.util.Map;
import java.util.HashMap;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jfcodiaz.curso.springboot.project.springboott_web.models.User;

@RestController
@RequestMapping("/api")
public class UserRestController {
    @GetMapping("/details")
    public Map<String, Object> details() {
        User user = new User("José Francisco", "Díaz");
        Map<String, Object> body = new HashMap<>();
        body.put("title", "Hola Mundo Spring Boot");
        body.put("user", user);

        return body;
    }
}
