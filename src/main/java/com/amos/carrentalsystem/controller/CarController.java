package com.amos.carrentalsystem.controller;

import com.amos.carrentalsystem.entity.Car;
import com.amos.carrentalsystem.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/cars")
public class CarController {

    private final CarService carService;

    @Autowired
    public CarController(CarService carService) {
        this.carService = carService;
    }

    // REST APIs EndPoints
    @PostMapping
    public Car addCar(@RequestBody Car car) {
        return carService.addCar(car);
    }

    @GetMapping
    public List<Car> findAll() {
        return carService.findAll();
    }


    // Filtering rules
    @GetMapping("/{id}")
   public Car fetchCarById(@PathVariable Long id) {
        return carService.fetchCarById(id);
    }

    @GetMapping("/status/{status}")
    public List<Car> fetchCarByStatus(@PathVariable String status) {
        return carService.fetchCarByStatus(status);
    }

    @GetMapping("/brand/{brand}")
    public List<Car> fetchCarByBrand(@PathVariable String brand) {
        return carService.fetchCarByBrand(brand);
    }
    @GetMapping("/color/{color}")
    public List<Car> fetchCarByColor(@PathVariable String color) {
        return carService.fetchCarByColor(color);
    }



    @DeleteMapping("/{id}")
    public String deleteCarById(@PathVariable Long id) {
        carService.deleteCarById(id);
        return "Car deleted successfully";
    }
}
