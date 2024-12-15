package com.omarezzat.controller;

import com.omarezzat.dao.DatabaseOperations;
import com.omarezzat.models.Vehicle;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
@NoArgsConstructor
@Setter
public class PlaneController implements VehicleController {
    @Autowired
    private  DatabaseOperations databaseOperations;


    @Override
    public void saveVehicle(Vehicle vehicle) {
        databaseOperations.saveData(vehicle);
    }
}
