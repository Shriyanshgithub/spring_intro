package com.capgemini.spring_intro.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @GetMapping("/hello")
    public ResponseEntity<String> hello(){
        return new ResponseEntity<>("Hello from bridgelabz", HttpStatus.OK);
    }

    @GetMapping("/hello2")
    public ResponseEntity<String> hello2(@RequestParam("value") String name){
        return new ResponseEntity<>("Hello " + name + " from Bridgelabz", HttpStatus.OK);
    }
}
