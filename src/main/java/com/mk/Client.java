package main.java.com.mk;

import main.java.com.mk.domain.Car;
import main.java.com.mk.repository.CarRepositoryJpa;
import main.java.com.mk.service.CarService;

import java.math.BigDecimal;

public class Client {
    public static void main(String[] args) {
        CarService service = new CarService();
        service.saveJpa(new Car(1L, "BMD", new BigDecimal(1000)));
        service.saveJdbc(new Car(1L, "BMD", new BigDecimal(1000)));


    }
}
