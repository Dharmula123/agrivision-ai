package com.farmer;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
public class CropController {

    @GetMapping("/api/crop")
    public String recommendCrop(
            @RequestParam(defaultValue = "loamy") String soil,
            @RequestParam(defaultValue = "kharif") String season,
            @RequestParam(defaultValue = "medium") String rainfall) {

        soil = soil.toLowerCase().trim();
        season = season.toLowerCase().trim();
        rainfall = rainfall.toLowerCase().trim();

        if (soil.equals("black") && season.equals("kharif")) {
            return "Suggested crops: Cotton, Soybean. Check local rainfall and soil-test conditions before planting.";
        }

        if (soil.equals("clay") && rainfall.equals("high")) {
            return "Suggested crop: Rice, where suitable irrigation and local conditions are available.";
        }

        if (season.equals("rabi") && rainfall.equals("low")) {
            return "Possible crops: Chickpea or mustard, subject to local climate and soil suitability.";
        }

        return "Possible crops: Maize, pulses, or region-suitable cereals. Please verify suitability with local agricultural guidance.";
    }
}
