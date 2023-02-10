package com.example.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/")
public class Redirect {

    @GetMapping("/test/**")
    public String home(@RequestParam(value = "utm",required = false) String utm) {
        System.out.println(utm);
        System.out.println("Helloooooo");
        return "index1";
    }

    @GetMapping("/error1")
    public String error() {
        System.out.println("Errorrrrrrr");
        return "error";
    }
}
