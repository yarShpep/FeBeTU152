package com.example.tu152.dto.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalTime;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class LocomotiveTechnicalStateLog {
    private Long id;
    private LocalDate date;
    private String direction;
    private String train;
    private Integer weight;
    private String axles;
    private LocalTime acceptanceTime;
    private String arrivalDriver;
    private String arrivalAssistant;
    private LocalTime arrivalTime;
    private String departureDriver;
    private String departureAssistant;
    private LocalTime departureTime;
    private String fuelOption;
    private String electricityReading;
    private Integer fuelAmount;
    private String comments;
    private Boolean signatureGiven;
    private Boolean signatureReceived;
    private LocalDate repairDate;
    private String position;
    private Boolean signature;
}