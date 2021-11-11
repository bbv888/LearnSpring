package com.bbv.boot.conference.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Map;

@Controller
public class GreetingController {

    @GetMapping("greeting")
    public String generateGreeting(Map<String, Object> model){
        model.put("message", DateTimeFormatter.ofPattern("dd-MM-yyyy hh:mm:ss").format(LocalDateTime.now()));
        return "greeting";
    }
}
