package com.spring.acc.skyapp.skyapp.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sky")
public class MainController {

    @GetMapping("/info")
    public ResponseEntity<String> getInfo() {
        return new ResponseEntity<>(String.format("Sending data"), HttpStatus.OK);
    }

}
