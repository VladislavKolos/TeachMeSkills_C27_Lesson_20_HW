package com.teachmeskills.hw20.task2.model;

/**
 * Class representing a car
 * contains constructor, getter and "toString" method.
 */
public class Car {
    private final String model;

    public Car(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                '}';
    }
}
