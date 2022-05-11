package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoHello {
    @GetMapping("/hello")
    public String hello_word(){
        return "Helloe from Google Cloud";
    }
}
