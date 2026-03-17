package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class GeneratorController {
    @GetMapping ("/generator")
    String index() {
        Date d = new Date();
        int hours  = d.getHours();

        return MessageGenerator2.messageGenerator2(hours);
    }
}
