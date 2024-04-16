package com.teachmeskills.hw20.task1.using_thread.runner;

import com.teachmeskills.hw20.task1.using_thread.service.morning_simulation_service.MorningSimulation;

/**
 * Class with method "main" to run the program
 * create an object of the "MorningSimulation" class
 * call the "startMorningSimulation" method
 */
public class Runner {
    public static void main(String[] args) {
        MorningSimulation simulation = new MorningSimulation();
        simulation.startMorningSimulation();
    }
}
