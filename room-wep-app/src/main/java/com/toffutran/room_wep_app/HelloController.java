package com.toffutran.room_wep_app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/")
    public String home() {
        return "Xin chào, web app đã chạy!";
    }
}
