package com.teachmeskills.hw20.task2.service.car_producer_service;

import com.teachmeskills.hw20.task2.model.Car;
import com.teachmeskills.hw20.task2.model.CarStation;

/**
 * Thread for adding cars to the car station
 * contains constructor
 * contains getter and setter
 * contains "run" method - generating and adding cars to the car station.
 */
public class CarProducer implements Runnable {
    private CarStation carStation;

    public CarProducer(CarStation carStation) {
        this.carStation = carStation;
    }

    public CarStation getCarStation() {
        return carStation;
    }

    public void setCarStation(CarStation carStation) {
        this.carStation = carStation;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            Car car = new Car("BMW");
            carStation.addCar(car);
            try {
                Thread.sleep(4000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
