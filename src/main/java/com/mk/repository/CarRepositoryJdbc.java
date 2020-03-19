package main.java.com.mk.repository;

import main.java.com.mk.domain.Car;
import main.java.com.mk.repository.impl.CarRepository;

import java.math.BigDecimal;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class CarRepositoryJdbc implements CarRepository {
    private static final String INSERT_CAR_SQL = "INSERT INTO  CAR(ID, MODEL, PRICE) values (?, ?, ?)";
    private static final String DATABASE_URL = "jdbc:mysql://localhost:3306/medium";
    private static final String CREATE_TABLES_SQL = "create table CAR(ID VARCHAR(255), MODEL VARCHAR(255), PRICE VARCHAR(255))";
    private static final String FIND_ALL_CARS = "SELECT * FROM CAR";
    private static final String DRIVER_URL = "com.mysql.cj.jdbc.Driver";

    public CarRepositoryJdbc() {
        try {
            Class.forName(DRIVER_URL);
            createTable();
        } catch (ClassNotFoundException e) {
            e.getCause();
        }
    }

    private static void createTable(){
        try {
            try (Connection con = DriverManager.getConnection(DATABASE_URL, "root", "");
                 PreparedStatement createTable = con.prepareStatement(CREATE_TABLES_SQL)) {
                createTable.executeUpdate();
            }
        }
        catch (SQLException e) { }
    }

    public void save(Car newCar) {
        try {
            try (Connection con = DriverManager.getConnection(DATABASE_URL, "root", "");
                 PreparedStatement insertCar = con.prepareStatement(INSERT_CAR_SQL)) {
                insertCar.setLong(1, newCar.getId());
                insertCar.setString(2, newCar.getModel());
                insertCar.setBigDecimal(3, newCar.getPrice());
                insertCar.executeUpdate();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Car> findAllCars() {
        List<Car> cars = new ArrayList<>();
        ResultSet resultSet = null;
        try (Connection con = DriverManager.getConnection(DATABASE_URL, "root", "");
             PreparedStatement statement = con.prepareStatement(FIND_ALL_CARS)) {
            resultSet = statement.executeQuery();
                while (resultSet.next()) {
                    Long id = resultSet.getLong(1);
                    String modell = resultSet.getString(2);
                    BigDecimal price = resultSet.getBigDecimal(3);
                    Car car = new Car(id, modell, price);
                    cars.add(car);
                }

        } catch (SQLException sql){}
            return cars;
    }

}

