package com.example.git_practice;

import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GitController {
    @PostMapping("/git")
    public String post() {
        return "git";
    }

    @PatchMapping("/git")
    public String patch() {
        return "patch";
    }
}
