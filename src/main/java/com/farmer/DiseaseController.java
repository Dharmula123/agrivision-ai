package com.farmer;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
public class DiseaseController {

    @GetMapping("/api/disease")
    public String detectDisease() {
        return "Disease Detection: Please upload a crop image for analysis.";
    }
}
