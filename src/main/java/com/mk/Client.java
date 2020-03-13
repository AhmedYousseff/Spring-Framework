package main.java.com.mk;

import main.java.com.mk.domain.Car;
import main.java.com.mk.repository.CarRepository;

import java.math.BigDecimal;

public class Client {
    public static void main(String[] args) {
        CarRepository repo = new CarRepository();
        repo.saveCar(new Car(1L, "BMD", new BigDecimal(1000)));

    }
}
