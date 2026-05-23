package com.pulse.pulsebackend.service;

import com.pulse.pulsebackend.dto.HealthScoreResponse;
import org.springframework.stereotype.Service;


@Service
public class HealthScoreService {
    
    public HealthScoreResponse getMockScore() {
        return HealthScoreResponse.builder()
                .overallScore(74)
                .velocityScore(82)
                .qualityScore(71)
                .reliabilityScore(79)
                .collaborationScore(68)
                .burnoutRiskScore(43)
                .predictabilityScore(75)
                .trend("down")
                .status("WATCH")
                .build();
    }
}
