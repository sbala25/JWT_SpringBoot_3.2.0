package com.example.JWTAuthenticationSpringboot.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/unauthorized")
public class UnauthorizedController {
	
	@GetMapping("/hello")
    public String testApi(){
        return "Login not needed";
    }

}
