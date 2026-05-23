package com.pulse.pulsebackend.dto;

import lombok.Builder;
import lombok.Data;


@Data
@Builder
public class HealthScoreResponse {
     private int overallScore;
    private int velocityScore;
    private int qualityScore;
    private int reliabilityScore;
    private int collaborationScore;
    private int burnoutRiskScore;
    private int predictabilityScore;
    private String trend;
    private String status;
}
