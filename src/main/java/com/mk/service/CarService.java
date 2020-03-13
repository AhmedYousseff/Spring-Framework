package main.java.com.mk.service;

import main.java.com.mk.domain.Car;
import main.java.com.mk.repository.CarRepositoryJdbc;
import main.java.com.mk.repository.CarRepositoryJpa;

public class CarService {
    public void saveJpa(Car car) {
        CarRepositoryJpa carRepository = new CarRepositoryJpa();
        carRepository.saveCar(car);
    }

    public void saveJdbc(Car car) {
        CarRepositoryJdbc repo= new CarRepositoryJdbc();
        repo.save(car);
    }
}
