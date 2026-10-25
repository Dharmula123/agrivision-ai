package com.farmer;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
public class IrrigationController {

    @GetMapping("/api/irrigation")
    public String irrigationGuidance() {
        return "Irrigation Guidance: Water crops according to soil moisture, crop type and weather conditions.";
    }
}