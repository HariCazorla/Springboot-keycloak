package com.shreeharibi.springkeycloak.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
public class Controller {

    @GetMapping
    @PreAuthorize("hasAuthority('user')")
    public ResponseEntity<Integer> getRandomNumber() {
        Random random = new Random();
        return ResponseEntity.ok(random.nextInt());
    }
}
