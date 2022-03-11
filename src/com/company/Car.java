package com.company;

public class Car {
    private int id;
    private String carNumber;

    public Car(){}

    public Car(int id, String carNumber) {
        this.id = id;
        this.carNumber = carNumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCarNumber() {
        return carNumber;
    }

    public void setCarNumber(String carNumber) {
        this.carNumber = carNumber;
    }

    @Override
    public String toString() {
        return "Car: " +
                "id: " + id +
                " carNumber: " + carNumber+"\n";
    }
}
