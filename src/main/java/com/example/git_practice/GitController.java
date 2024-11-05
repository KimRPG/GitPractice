package com.example.git_practice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GitController {
    @PostMapping("/git")
    public String post() {
        return "git";
    }

    @GetMapping("/git")
    public String get() {
        return "get";
    }
}
