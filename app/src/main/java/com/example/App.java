package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

@SpringBootApplication
@RestController
public class App {

    @Autowired
    private UserRepository repo;

    @GetMapping("/users")
    public List<User> getUsers() {
        return repo.findAll();
    }

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}
