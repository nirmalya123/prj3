package com.example.springbootawsdeploy;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class TestController {
    @GetMapping("/data")
    public String getData() {
        return "Project-3 data ok.";
    }

    @GetMapping("/message")
    public String getMessage() {
        return "Project-3 message - Hi.";
    }
    
    @GetMapping("/heath")
    public String getMessage() {
        return "ok";
    }
}
