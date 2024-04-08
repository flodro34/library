package com.studi.library.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class TestWs {

    @GetMapping
    public String Hello(){
        return "BIJOUR M.Vincent";
    }
}
