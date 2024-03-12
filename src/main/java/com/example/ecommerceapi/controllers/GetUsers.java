package com.example.ecommerceapi.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class GetUsers {
    @GetMapping
    public ResponseEntity<String> AllUsers(){
        return ResponseEntity.ok("deu ok");
    }
}
