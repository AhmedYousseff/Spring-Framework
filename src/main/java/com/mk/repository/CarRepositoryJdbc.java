package main.java.com.mk.repository;

import main.java.com.mk.domain.Car;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CarRepositoryJdbc {
    private static final String INSERT_CAR_SQL = "INSERT INTO  CAR_JDBC(ID, MODEL, PRICE) values (?, ?, ?)";
    private static final String DATABASE_URL = "jdbc:mysql://localhost:3306/medium";
    private static final String CREATE_TABLES_SQL = "create table CAR_JDBC(ID VARCHAR(255), MODEL VARCHAR(255), PRICE VARCHAR(255))";
    private static final String DRIVER_URL = "com.mysql.cj.jdbc.Driver";
    private static final String DROP_TABLE = "DROP TABEL if exists CAR_JDPC";

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
            try (Connection con = DriverManager.getConnection(DATABASE_URL, "root", ""); PreparedStatement createTable = con.prepareStatement(CREATE_TABLES_SQL)) {
                createTable.executeUpdate();
            }
        }
        catch (SQLException e) { }

    }

    public void save(Car newCar) {
        try {
            try (Connection con = DriverManager.getConnection(DATABASE_URL, "root", ""); PreparedStatement insertCar = con.prepareStatement(INSERT_CAR_SQL)) {
                insertCar.setLong(1, newCar.getId());
                insertCar.setString(2, newCar.getModel());
                insertCar.setBigDecimal(3, newCar.getPrice());
                insertCar.executeUpdate();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

