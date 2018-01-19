package com.tw.geeknight.model;

public class Vehicle {

    private String name;
    private VehicleType vehicleType;
    private int horsePower;//BHP
    private int price;

    public Vehicle(String name, VehicleType vehicleType, int horsePower, int price) {
        this.name = name;
        this.vehicleType = vehicleType;
        this.horsePower = horsePower;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
//        StringBuilder car = new StringBuilder(name);
//        car.append("-").append(vehicleType);
//        car.append("-").append(horsePower).append(" BHP");
//        car.append("-").append(price);
//        return car.toString();
        return name;
    }
}
