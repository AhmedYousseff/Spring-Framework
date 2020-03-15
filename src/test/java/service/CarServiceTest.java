package test.java.service;

import main.java.com.mk.domain.Car;
import main.java.com.mk.service.CarService;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class CarServiceTest {

    @Test
    void saveCarTest() {
        Car car = new Car(1001L, "BMW", new BigDecimal(5651));
        boolean res = Arrays.asList("Ferrari", "aston martin", "lampo").stream()
                        .anyMatch(e -> e.equalsIgnoreCase(car.getModel()));
        try {
            if (res == true) {
                CarService carService = new CarService();
                carService.save(car);
            }
        }catch (Exception e) {}
    }
}