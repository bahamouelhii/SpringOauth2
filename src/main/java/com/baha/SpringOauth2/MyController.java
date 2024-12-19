package com.baha.SpringOauth2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {


    @GetMapping("/")
    public String test() {
        return "Welcome";
    }
}
