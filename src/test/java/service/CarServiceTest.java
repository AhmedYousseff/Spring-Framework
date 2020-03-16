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
    }
}