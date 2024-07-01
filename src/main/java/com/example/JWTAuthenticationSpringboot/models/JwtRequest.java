package com.example.JWTAuthenticationSpringboot.models;

import lombok.*;

@Getter(value = AccessLevel.PUBLIC)
@Setter(value =AccessLevel.PUBLIC )
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class JwtRequest {
    private String email;
    private String password;
}
