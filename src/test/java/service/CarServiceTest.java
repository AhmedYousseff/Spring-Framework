package test.java.service;

import main.java.com.mk.domain.Car;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

class CarServiceTest {

    @Test
    void saveCarTest() {
        Car car = new Car(1001L, "BMW", new BigDecimal(5651));
    }
}