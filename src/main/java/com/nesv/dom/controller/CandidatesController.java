package com.nesv.dom.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Vladislav Domaniewski
 */

@RestController
@RequestMapping("/api/candidates")
public class CandidatesController {

    @GetMapping("/hello")
    public String getHello() {
        return "Hello";
    }
}
