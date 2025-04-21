package com.amos.carrentalsystem.service;

import com.amos.carrentalsystem.entity.Car;

import java.util.List;

public interface CarService {

    public List<Car> findAll();

    Car addCar(Car car);


    Car fetchCarById(Long id);


    List<Car> fetchCarByStatus(String status);

    public void deleteCarById(Long id);

    List<Car> fetchCarByBrand(String brand);

    List<Car> fetchCarByColor(String color);
}
