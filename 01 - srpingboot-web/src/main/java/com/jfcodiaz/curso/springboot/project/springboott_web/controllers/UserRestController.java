package com.jfcodiaz.curso.springboot.project.springboott_web.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jfcodiaz.curso.springboot.project.springboott_web.models.User;
import com.jfcodiaz.curso.springboot.project.springboott_web.models.dto.UserDto;

@RestController
@RequestMapping("/api")
public class UserRestController {
    @GetMapping("/details")
    public UserDto details() {
        User user = new User("José Francisco", "Díaz");
        UserDto userDto = new UserDto();
        userDto.setTitle("Hola Mundo Spring Boot");
        userDto.setUser(user);

        return userDto;
    }
}
