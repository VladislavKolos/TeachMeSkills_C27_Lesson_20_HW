package com.teachmeskills.hw20.task2.model;

import com.teachmeskills.hw20.task2.consts.IConstants;

import java.util.LinkedList;
import java.util.List;

/**
 * Class representing car station
 * contains constructor
 * contains "addCar" method - method for adding a car to the service queue
 * contains "removeCar" method - method for picking up a car from a car station after service.
 */
public class CarStation implements IConstants {
    private final List<Car> cars;

    public CarStation() {
        cars = new LinkedList<>();
    }

    public List<Car> getCars() {
        return cars;
    }

    public synchronized void addCar(Car car) {
        while (cars.size() >= MAX_CARS_FOR_SERVICE) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        cars.add(car);
        System.out.println("Car " + car.getModel() + " added to the car station");
        notify();
    }

    public synchronized Car removeCar() {
        while (cars.isEmpty()) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        Car car = cars.removeFirst();
        System.out.println("Car " + car.getModel() + " remove from the car station");
        notify();
        return car;
    }
}
