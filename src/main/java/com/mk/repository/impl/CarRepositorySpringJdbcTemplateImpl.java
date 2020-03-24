package main.java.com.mk.repository.impl;


import lombok.AllArgsConstructor;
import main.java.com.mk.domain.Car;
import org.springframework.jdbc.core.JdbcTemplate;

import java.math.BigDecimal;
import java.util.List;

@AllArgsConstructor
public class CarRepositorySpringJdbcTemplateImpl implements CarRepository {

    private JdbcTemplate jdbcTemplate;

    @Override
    public void save(Car car) {
        jdbcTemplate.update("INSERT INTO  CAR(ID, MODEL, PRICE) values (?, ?, ?)", car.getId(), car.getModel(), car.getPrice());
    }

    @Override
    public List<Car> findAllCars() {
       return  jdbcTemplate.query("SELECT * FROM CAR", new CarMapper());
    }

    @Override
    public void delete(Car car) {
        jdbcTemplate.update("DELETE FROM car WHERE id =?", car.getId());
    }

    @Override
    public List<Car> findCarByModel(String model) {
         return  jdbcTemplate.query("SLECLT * FROM Car where id =?", new CarMapper(), model);
    }

    @Override
    public Car findCarById(Long id) {
        return jdbcTemplate.queryForObject("SLECLT * FROM Car where id =?", new CarMapper(), id);
    }

    @Override
    public List<Car> priceBetween(BigDecimal min, BigDecimal max) {
        return  jdbcTemplate.query("SLECLT * FROM Car WHERE price BETWEEN min=? and max=?", new CarMapper(), min, max);
    }
}
