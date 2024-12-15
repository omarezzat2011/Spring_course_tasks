package com.omarezzat.controller;

import com.omarezzat.dao.DatabaseOperations;
import com.omarezzat.models.Vehicle;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
@RequiredArgsConstructor
public class CarController implements VehicleController {
    @Autowired
    private final DatabaseOperations databaseOperations;


    @Override
    public void saveVehicle(Vehicle vehicle) {
        databaseOperations.saveData(vehicle);
    }
}
