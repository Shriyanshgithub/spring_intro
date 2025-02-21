package com.capgemini.spring_intro.controller;

import com.capgemini.spring_intro.dto.DtoUser;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/hello3/{name}")
    public ResponseEntity<String> hello3(@PathVariable("name") String name){
        return new ResponseEntity<>("Hello  " + name + " from BridgeLabz", HttpStatus.OK );
    }

    @PostMapping("/dto")
    public ResponseEntity<DtoUser> dtoPost(@RequestBody DtoUser dtoUser){
        return new ResponseEntity<>(new DtoUser(dtoUser.firstName(), dtoUser.lastName()), HttpStatus.CREATED);
    }

    @PutMapping("/put/{firstName}")
    public String sayHello(
            @PathVariable String firstName,
            @RequestParam String lastName) {
        return "Hello " + firstName + " " + lastName + " from BridgeLabz!";
    }

}
