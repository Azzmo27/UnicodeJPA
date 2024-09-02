package com.example.unicode.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UnicodeRestController {

    @GetMapping("/generate")
    public String generateCharacters(@RequestParam char letter, @RequestParam int count) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < count; i++) {
            result.append((char) (letter + i));
        }

        return result.toString();
    }
}



