package com.prreviewtask.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ChristmasFilmController {

    @GetMapping("/api/christmasFilms")
    public ResponseEntity<String> getChristmasFilms() {
        return ResponseEntity.status(HttpStatus.OK)
                .body("Die Hard (Yes this counts), Elf, The Grinch Who Stole Christmas, Muppet's Christmas Carol, Home Alone, Love Actually");
    }
}