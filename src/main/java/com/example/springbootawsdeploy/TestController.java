package com.example.springbootawsdeploy;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/") // Root mapping, so endpoints will be directly accessible
public class TestController {

    @GetMapping("demo/data")
    public String getData() {
        return "Project-3 data ok.";
    }

    @GetMapping("demo/message")
    public String getMessage() {
        return "Project-3 message - Hi.";
    }

    @GetMapping("health")
    public ResponseEntity<String> healthCheck() {
        return ResponseEntity.ok("ok");
    }
}
