package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
public class RandomNumberController {

    private final Random random = new Random();

    // Endpoint to generate a random number
    @GetMapping("/random")
    public int getRandomNumber() {
        return random.nextInt(100);  // Generates a random number between 0 and 99
    }

    // Endpoint to return "Hello, World!"
    @GetMapping("/hello")
    public String greet() {
        return "Hello, World! new app on github v1 ";
    }
}
