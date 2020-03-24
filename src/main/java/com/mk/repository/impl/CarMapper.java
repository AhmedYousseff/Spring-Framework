package main.java.com.mk.repository.impl;

import main.java.com.mk.domain.Car;
import org.springframework.jdbc.core.RowMapper;

import java.math.BigDecimal;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CarMapper implements RowMapper<Car> {
    @Override
    public Car mapRow(ResultSet resultSet, int rowNumber) throws SQLException {
        Long id = resultSet.getLong("id");
        String model = resultSet.getString("model");
        BigDecimal price = resultSet.getBigDecimal("price");
        return  new Car(id, model, price);
    }
}
