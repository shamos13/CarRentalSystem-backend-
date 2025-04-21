package com.amos.carrentalsystem.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity(name = "car")
@Data
@NoArgsConstructor
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable=false)
    private String brand;

    @Column(nullable=false)
    private String model;

    private String color;

    @Column(name = "car_year", nullable = true)
    private String carYear;

    @Column(name = "daily_price", nullable = false)
    private double dailyPrice;

    @Column(nullable=false, unique=true)
    private String registrationNumber;

    @Column(nullable=false)
    private String status;
    @Column(name = "seating_capacity", nullable = true)
    private int seatingCapacity;
    @Column(nullable=false)
    private String driveTrain;

    @Column(nullable=true)
    private String fuelType;
    @Column(nullable=true)
    private String bodyStyle;




}
