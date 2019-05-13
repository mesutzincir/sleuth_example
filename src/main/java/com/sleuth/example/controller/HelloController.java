package com.sleuth.example.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    private static Logger log = LoggerFactory.getLogger(HelloController.class);

    @RequestMapping("/")
    public String home() {
        log.info("Handling home");
        return "Hello World";
    }
}
