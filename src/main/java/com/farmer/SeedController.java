package com.farmer;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
public class SeedController {

    @GetMapping("/api/seed")
    public String recommendSeed() {
        return "Recommended Seed: High-quality Rice Seed";
    }
}