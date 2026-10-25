package com.farmer;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
public class CropController {

    @GetMapping("/api/crop")
    public String recommendCrop() {
        return "Recommended Crop: Rice";
    }
}
