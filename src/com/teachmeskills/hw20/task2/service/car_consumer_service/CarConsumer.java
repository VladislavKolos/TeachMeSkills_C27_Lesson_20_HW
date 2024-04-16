package com.teachmeskills.hw20.task2.service.car_consumer_service;

import com.teachmeskills.hw20.task2.model.Car;
import com.teachmeskills.hw20.task2.model.CarStation;

/**
 * Thread for picking up cars from car stations after servicing
 * contains constructor
 * contains getter and setter
 * contains "run" method - picking up repaired cars from the car station.
 */
public class CarConsumer implements Runnable {
    private CarStation carStation;

    public CarConsumer(CarStation carStation) {
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
            Car car = carStation.removeCar();
            try {
                Thread.sleep(4000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
