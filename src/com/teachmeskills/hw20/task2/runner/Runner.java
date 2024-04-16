package com.teachmeskills.hw20.task2.runner;

import com.teachmeskills.hw20.task2.model.CarStation;
import com.teachmeskills.hw20.task2.service.car_consumer_service.CarConsumer;
import com.teachmeskills.hw20.task2.service.car_producer_service.CarProducer;

/**
 * Main program class
 * Creation of a service car object
 * Creating and launching threads for adding and removing away cars.
 */
public class Runner {
    public static void main(String[] args) {
        CarStation carStation = new CarStation();

        Thread producerThread = new Thread(new CarProducer(carStation));
        Thread consumerThread = new Thread(new CarConsumer(carStation));
        producerThread.start();
        consumerThread.start();

    }
}
