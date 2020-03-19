package main.java.com.mk.repository.impl;

import main.java.com.mk.domain.Car;

import java.math.BigDecimal;
import java.util.List;

public interface CarRepository {
    public void save(Car car);
    List<Car> findAllCars();
}
