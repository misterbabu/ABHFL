package com.jocata.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;

@SpringBootApplication
@RestController
public class DemoSpringJenkins {
    public static Logger logger = LoggerFactory.getLogger(DemoSpringJenkins.class);

    @PostConstruct
    public void inti() {
        logger.info("Application started....");
    }

    @GetMapping("/message")
    public String getMessage() {
        return "Welcome to Jocata........";
    }

    public static void main(String[] args) {
        logger.info("Application executed....");
        logger.info("Hello world!");
        SpringApplication.run(DemoSpringJenkins.class, args);
    }
}
