package com.farmer;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WeatherController {
    private final HttpClient httpClient = HttpClient.newHttpClient();

    @GetMapping(value = "/api/weather", produces = MediaType.APPLICATION_JSON_VALUE)
    public String getWeather(@RequestParam double latitude,
                             @RequestParam double longitude) throws Exception {
        if (latitude < -90 || latitude > 90 ||
            longitude < -180 || longitude > 180) {
            throw new IllegalArgumentException("Invalid location coordinates");
        }

        String url = "https://api.open-meteo.com/v1/forecast"
                + "?latitude=" + latitude
                + "&longitude=" + longitude
                + "&current=temperature_2m,relative_humidity_2m,apparent_temperature,precipitation,weather_code,wind_speed_10m"
                + "&daily=temperature_2m_max,temperature_2m_min,precipitation_probability_max"
                + "&timezone=auto";

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .header("Accept", "application/json")
                .GET()
                .build();

        HttpResponse<String> response = httpClient.send(
                request, HttpResponse.BodyHandlers.ofString());

        if (response.statusCode() != 200) {
            throw new RuntimeException("Weather service returned HTTP "
                    + response.statusCode());
        }

        return response.body();
    }
}
