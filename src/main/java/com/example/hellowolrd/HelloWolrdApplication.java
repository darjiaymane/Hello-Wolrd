package com.example.hellowolrd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HelloWolrdApplication {

    public static void main(String[] args) {

        SpringApplication.run(HelloWolrdApplication.class, args);
    }

    @GetMapping("/hello")
    public String hello(@RequestParam(value = "name",defaultValue = "World") String name){
        return "Hello"+name;
    }
}
