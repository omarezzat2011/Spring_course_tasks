package com.omarezzat.dao;

import com.omarezzat.models.Vehicle;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Scope;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
@RequiredArgsConstructor
public class DatabaseOperations {
    private final String URL;
    private final String USER ;
    private final String PASSWORD;
    private Connection connection;


    @PostConstruct
    public void connectToDatabase() {
        try {
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Database connection established.");
        } catch (SQLException e) {
            throw new RuntimeException("Failed to connect to database", e);
        }
    }

    @PreDestroy
    public void disconnectFromDatabase() {
        if (connection != null) {
            try {
                connection.close();
                System.out.println("Database connection closed.");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
    public void saveData(Vehicle vehicle){
        String query = "INSERT INTO vehicles (type, brand) VALUES (?, ?)";
        try (
                PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, vehicle.getType());
            statement.setString(2, vehicle.getBrand());
            statement.executeUpdate();
            System.out.println("Data saved for " + vehicle.getType() + ": " + vehicle.getBrand());
        } catch (
                SQLException e) {
            e.printStackTrace();
        }

    }

    public void printConfig() {
        System.out.println("Database URL: " + URL);
        System.out.println("Database User: " + USER);
        System.out.println("Database Password: " + PASSWORD);
    }

}
