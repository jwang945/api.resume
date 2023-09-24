package com.jwang945.api.resume.controller;

import com.jwang945.api.resume.dto.Name;
import com.jwang945.api.resume.dto.Resume;
import com.jwang945.api.resume.util.ResumeUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.io.IOException;
@Slf4j
@Controller
public class MainController {
    @GetMapping(value = "/name")
    public ResponseEntity<Name> getName() throws IOException {
        log.info("Controller: Entering getName");
        Resume resume = ResumeUtil.getResume();
        return new ResponseEntity<>(resume.getName(), HttpStatus.OK);
    }
}
