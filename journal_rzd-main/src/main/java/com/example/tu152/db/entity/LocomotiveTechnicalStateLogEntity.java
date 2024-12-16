package com.example.tu152.db.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "locomotive_technical_state_log")
public class LocomotiveTechnicalStateLogEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "date")
    private LocalDate date;

    @Column(name = "direction")
    private String direction;

    @Column(name = "train")
    private String train;

    @Column(name = "weight")
    private Integer weight;

    @Column(name = "axles")
    private String axles;

    @Column(name = "acceptance_time")
    private LocalTime acceptanceTime;

    @Column(name = "arrival_driver")
    private String arrivalDriver;

    @Column(name = "arrival_assistant")
    private String arrivalAssistant;

    @Column(name = "arrival_time")
    private LocalTime arrivalTime;

    @Column(name = "departure_driver")
    private String departureDriver;

    @Column(name = "departure_assistant")
    private String departureAssistant;

    @Column(name = "departure_time")
    private LocalTime departureTime;

    @Column(name = "fuel_option")
    private String fuelOption;

    @Column(name = "electricity_reading")
    private String electricityReading;

    @Column(name = "fuel_amount")
    private Integer fuelAmount;

    @Column(name = "comments")
    private String comments;

    @Column(name = "signature_given")
    private Boolean signatureGiven;

    @Column(name = "signature_received")
    private Boolean signatureReceived;

    @Column(name = "repair_date")
    private LocalDate repairDate;

    @Column(name = "position")
    private String position;

    @Column(name = "signature")
    private Boolean signature;
}