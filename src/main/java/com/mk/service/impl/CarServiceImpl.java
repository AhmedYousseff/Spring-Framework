package main.java.com.mk.service.impl;

import lombok.Setter;
import main.java.com.mk.domain.Car;
import main.java.com.mk.repository.impl.CarRepository;
import main.java.com.mk.service.CarService;

public class CarServiceImpl implements CarService {

    @Setter
    private CarRepository carRepository;

    public void save(Car car) {
        carRepository.save(car);
    }
}
