package com.tw.geeknight.lambda;

import com.tw.geeknight.model.Vehicle;
import com.tw.geeknight.model.VehicleType;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static com.tw.geeknight.model.VehicleType.*;

public class VehicleSample {
    public static void main(String[] args) {
        List<Vehicle> vehicles = Arrays.asList(
          new Vehicle("Maruti Dzire LXI", SEDAN, 82,6-000-000 ),
          new Vehicle("Hyundai Verna 1.6", SEDAN, 121,9-000-000 ),
          new Vehicle("Honda City ZX", SEDAN, 117,15-000-000 ),
          new Vehicle("Skoda Octavia Style Plus", SEDAN, 141,28-000-000 ),
          new Vehicle("Maruti Swift", HATCH_BACK, 74,5-000-000 ),
          new Vehicle("Maruti Baleno", HATCH_BACK, 74,6-000-000 ),
          new Vehicle("Volkswagen Beetle", HATCH_BACK, 148,26-000-000 ),
          new Vehicle("Fiat Abarth Punto", HATCH_BACK, 148,11-000-000 ),
          new Vehicle("Maruti Gypsy", SUV, 80,6-000-000 ),
          new Vehicle("Honda BRV", SUV, 98,12-000-000 ),
          new Vehicle("Mahindra XUV500", SUV, 140,18-000-000 )
        );

        Map<VehicleType, List<Vehicle>> collect = vehicles.stream()
                .collect(Collectors.groupingBy(Vehicle::getVehicleType));

    }



}


