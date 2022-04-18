package com.conga.parrot.web;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * The main Parrot Web Controller.
 */
@RestController
@RequestMapping(path = "/", produces = MediaType.APPLICATION_JSON_VALUE)
public class ParrotWebController {
    @GetMapping(value = "/")
    public ResponseEntity<String> echo(@RequestParam("value") String input) {
        return ResponseEntity.ok(input);
    }
}
