package com.farmer;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
public class PesticideController {

    @GetMapping("/api/pesticide")
    public String recommendPesticide() {
        return "Recommended Pesticide: Neem-based pesticide";
    }
}
