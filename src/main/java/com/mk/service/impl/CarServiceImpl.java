package main.java.com.mk.service.impl;

import lombok.Setter;
import main.java.com.mk.domain.Car;
import main.java.com.mk.repository.impl.CarRepository;
import main.java.com.mk.service.CarService;

import java.util.List;

public class CarServiceImpl implements CarService {

    @Setter
    private CarRepository carRepository;

    public void save(Car car) {
        carRepository.save(car);
    }

    @Override
    public List<Car> findAllCars() {
        return carRepository.findAllCars();
    }

}
