package com.amos.carrentalsystem.service;

import com.amos.carrentalsystem.entity.Car;
import com.amos.carrentalsystem.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    private CarRepository carRepository;

    @Autowired
    public CarServiceImpl(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    @Override
    public List<Car> findAll() {
        return carRepository.findAll();
    }

    @Override
    public Car addCar(Car car) {
        return carRepository.save(car);
    }

    @Override
    public Car fetchCarById(Long id) {
        return carRepository.findById(id).orElse(null);
    }

    @Override
    public List<Car> fetchCarByStatus(String status) {
        return carRepository.findCarByStatus(status);
    }

    @Override
    public void deleteCarById(Long id) {
        carRepository.deleteById(id);
    }

    @Override
    public List<Car> fetchCarByBrand(String brand) {
        return carRepository.findCarByBrand(brand);
    }

    public List<Car> fetchCarByColor(String color) {
        return carRepository.findCarByColor(color);
    }


}
