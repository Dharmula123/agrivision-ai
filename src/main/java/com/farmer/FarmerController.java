package com.farmer;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FarmerController {

    @GetMapping("/api/farmer")
    public String farmer() {
        return "Farmer Backend is Working!";
    }
}
