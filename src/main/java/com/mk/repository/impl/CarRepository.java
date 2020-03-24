package main.java.com.mk.repository.impl;

import main.java.com.mk.domain.Car;

import java.math.BigDecimal;
import java.util.List;

public interface CarRepository {
    void save(Car car);
    List<Car> findAllCars();
    void delete(Car car);
    List<Car> findCarByModel(String model);
    Car findCarById(Long id);
    List<Car> priceBetween(BigDecimal min, BigDecimal max);
}
