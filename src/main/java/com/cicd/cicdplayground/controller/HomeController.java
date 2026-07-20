package com.cicd.cicdplayground.controller;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api")
public class HomeController {

    @GetMapping("/home")
    public ResponseEntity<String> home() {
        return ResponseEntity.ok("Welcome to the Home Page!");
    }

    @GetMapping("/workflow")
    ResponseEntity<String> workflow() {
        return ResponseEntity.ok("Welcome to the Workflow Page!");
    }

    @GetMapping("/user")
    ResponseEntity<Map<String,Object>> getUserInfo() {
        Map<String, Object> userInfo = Map.of(
                "name", "John Doe",
                "email", "jone123@gmail.com");
        return ResponseEntity.ok(userInfo);
    }
}
