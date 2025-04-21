package com.amos.carrentalsystem.repository;

import com.amos.carrentalsystem.entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CarRepository extends JpaRepository<Car, Long> {

    List<Car> findCarByStatus(String status);
    List<Car> findCarByBrand(String brand);

    List<Car> findCarByColor(String color);
}
