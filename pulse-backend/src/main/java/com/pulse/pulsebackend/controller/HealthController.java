package com.pulse.pulsebackend.controller;

import com.pulse.pulsebackend.dto.HealthScoreResponse;
import com.pulse.pulsebackend.service.HealthScoreService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/health")
public class HealthController {

    private final HealthScoreService healthScoreService;

    public HealthController(HealthScoreService healthScoreService) {
        this.healthScoreService = healthScoreService;
    }

    @GetMapping("/score")
    public HealthScoreResponse getHealthScore() {
        return healthScoreService.getMockScore();
    }
}