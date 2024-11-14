package com.omarezzat;

import lombok.Data;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@Data
public class Car implements Vehicle {
    private final VehicleRepository vehicleRepository;
    private String brand;


    @Override
    public void save() {
        vehicleRepository.saveData(brand,"Car");
    }
}
