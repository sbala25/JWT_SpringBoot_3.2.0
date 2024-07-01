package com.example.JWTAuthenticationSpringboot.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api")
public class FunController {

    @GetMapping("/test")
    public String testApi(){
        return "Api works";
    }
}
