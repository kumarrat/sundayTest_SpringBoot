package org.example;


import org.springframework.stereotype.Component;

@Component
public class Car {

    private String model;

    public void setModel(String model) {
        this.model = model;
    }

    public Car() {
        this.model = "THAR";
        System.out.println("Car Object created!!");
    }

    public String getColor() {
        return model;
    }
}
