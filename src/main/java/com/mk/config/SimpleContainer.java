package main.java.com.mk.config;

import main.java.com.mk.repository.CarRepositoryJpa;
import main.java.com.mk.repository.impl.CarRepository;
import main.java.com.mk.service.CarService;

public class SimpleContainer {

  public static CarService getCarService() {

      CarRepository carRepository = new CarRepositoryJpa();

      CarService carService = new CarService();

      carService.setCarRepository(carRepository);

      return carService;
  }
}
