package main.java.com.mk;

import main.java.com.mk.config.SimpleContainer;
import main.java.com.mk.domain.Car;
import main.java.com.mk.repository.CarRepositoryJdbc;

import main.java.com.mk.repository.CarRepositoryJpa;
import main.java.com.mk.repository.impl.CarRepository;
import main.java.com.mk.service.CarService;

import java.math.BigDecimal;

public class Client {
    public static void main(String[] args) {
        CarService service = SimpleContainer.getCarService();
        service.save(new Car(1L, "BMD", new BigDecimal(1000)));
    }
}
