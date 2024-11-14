package com.omarezzat;

import lombok.*;
import org.springframework.beans.factory.annotation.Value;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

@Data
@RequiredArgsConstructor
public class VehicleRepository {
    private final String URL;
    private final String USER ;
    private final String PASSWORD;

    public void saveData(String brand, String vehicleType) {
        String query = "INSERT INTO vehicles (type, brand) VALUES (?, ?)";
        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, vehicleType);
            statement.setString(2, brand);
            statement.executeUpdate();
            System.out.println("Data saved for " + vehicleType + ": " + brand);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void printConfig() {
        System.out.println("Database URL: " + URL);
        System.out.println("Database User: " + USER);
        System.out.println("Database Password: " + PASSWORD);
    }

}
