package com.omarezzat.models;

import com.omarezzat.dao.DatabaseOperations;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Car implements Vehicle {
    private String brand;
    private String type = "car";
}
