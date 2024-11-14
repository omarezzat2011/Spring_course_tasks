package com.omarezzat;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Plane implements Vehicle {
    private final VehicleRepository vehicleRepository;
    private String brand;

    @Override
    public void save() {
        vehicleRepository.saveData(brand,"Plane");
    }
}
