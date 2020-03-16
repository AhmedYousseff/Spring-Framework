package main.java.com.mk.service;

import main.java.com.mk.domain.Car;
import main.java.com.mk.repository.CarRepositoryJdbc;
import main.java.com.mk.repository.CarRepositoryJpa;
import main.java.com.mk.repository.impl.CarRepository;


public interface CarService {
    public void save(Car car);
}