package com.jfcodiaz.curso.springboot.project.springboott_web.controllers;

import java.util.Map;
import java.util.HashMap;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserRestController {

    @GetMapping("/details2")
    public Map<String, Object> details() {
        Map<String, Object> body = new HashMap<>();
        body.put("title", "Hola Mundo Spring Boot");
        body.put("name", "José Francisco");
        body.put("lastname", "Díaz");

        return body;
    }
}