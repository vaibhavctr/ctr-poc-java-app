package com.example.myapi;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class MyApiController {

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello, World!";
    }
}