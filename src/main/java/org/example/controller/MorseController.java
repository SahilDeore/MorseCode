package org.example.controller;

import org.example.service.ConvertService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MorseController {

    @GetMapping("/convert")
    public String convertString(@RequestParam String str) {
        return ConvertService.convertString(str);
    }

    @GetMapping("/")
    public String home() {
        return "HELLO WORLD";
    }
}
