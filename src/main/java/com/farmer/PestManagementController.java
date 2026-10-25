package com.farmer;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
public class PestManagementController {

    @GetMapping("/api/pest-management")
    public String pestManagement() {
        return "Pest Management: Monitor crops regularly and use suitable pest control methods when pests are detected.";
    }
}
