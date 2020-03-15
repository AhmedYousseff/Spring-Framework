package main.java.com.mk.service;

import main.java.com.mk.domain.Car;
import main.java.com.mk.repository.CarRepositoryJdbc;
import main.java.com.mk.repository.CarRepositoryJpa;
import main.java.com.mk.repository.impl.CarRepository;


public class CarService {
    private CarRepository carRepository;

    public void setCarRepository(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    public void save(Car car) {
        carRepository.save(car);
    }
}