package com.tejaswini.delivery.api;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.Instant;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class DeliveryController {

    private final String appVersion;

    public DeliveryController(@Value("${app.version:dev}") String appVersion) {
        this.appVersion = appVersion;
    }

    @GetMapping("/status")
    public ResponseEntity<Map<String, Object>> status() {
        return ResponseEntity.ok(Map.of(
                "status", "UP",
                "version", appVersion,
                "timestamp", Instant.now().toString()));
    }

    @GetMapping("/message")
    public ResponseEntity<Map<String, String>> message() {
        return ResponseEntity.ok(Map.of(
                "message", "Continuous delivery pipeline is healthy",
                "environment", "application"));
    }
}
