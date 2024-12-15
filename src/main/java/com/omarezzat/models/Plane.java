package com.omarezzat.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Plane implements Vehicle {
    private String brand;
    private String type = "plane";
}
