package main.java.com.mk;

import main.java.com.mk.domain.Car;

import main.java.com.mk.repository.CarRepositoryJdbc;
import main.java.com.mk.repository.impl.CarRepository;
import main.java.com.mk.service.CarService;
import main.java.com.mk.service.impl.CarServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.math.BigDecimal;

public class Client {
    public static void main(String[] args) {
        ApplicationContext container = new ClassPathXmlApplicationContext("application.xml");
        CarService service = container.getBean("carService", CarService.class);
        service.save(new Car(3L, "BMD", new BigDecimal(3000)));
    }
}
