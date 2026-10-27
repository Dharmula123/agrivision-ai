package com.farmer;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.http.ResponseEntity;

@RestController
@RequestMapping("/api/market")
public class MarketController {

    private final RestTemplate restTemplate = new RestTemplate();

    @GetMapping("/test")
    public ResponseEntity<String> test() {
        return ResponseEntity.ok(
            "Market Prices API is ready. Government data connection is pending."
        );
    }
}
