package com.jwang945.api.resume.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
    @GetMapping(value = "/name")
    public ResponseEntity<String> getName() {
        return new ResponseEntity<>("here", HttpStatus.OK);
    }
}
