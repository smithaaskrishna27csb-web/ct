package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;



@RestController
@RequestMapping("/api")
public class GreetController {

    @GetMapping("/greet/{name}")
    public String getMethodName(@RequestParam String name) {
        return "Greetings "+ name + "!";
    }
    
    
}
