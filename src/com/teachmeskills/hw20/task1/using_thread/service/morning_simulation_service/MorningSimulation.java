package com.teachmeskills.hw20.task1.using_thread.service.morning_simulation_service;

import com.teachmeskills.hw20.task1.using_thread.model.MorningActivity;
import com.teachmeskills.hw20.task1.using_thread.service.loading_properties_service.LoadingProperties;

import java.util.Properties;

/**
 * Class contains method "startMorningSimulation" - method to run morning simulation
 * load configuration parameters from file
 * create and launch threads based on configuration.
 */
public class MorningSimulation {
    public void startMorningSimulation() {
        Properties properties = LoadingProperties.loadProperties();
        if (properties == null) {
            System.out.println("Error loading config properties.");
        }

        if (properties != null) {
            String activityName = properties.getProperty("newsReaderName", "Unspecified activity");
            int priority = Integer.parseInt(properties.getProperty("newsReaderPriority", "6"));
            MorningActivity newsReader = new MorningActivity(activityName, priority);
            newsReader.start();

            activityName = properties.getProperty("breakfastPreparerName", "Unspecified activity");
            priority = Integer.parseInt(properties.getProperty("breakfastPreparerPriority", "6"));
            MorningActivity breakfastPreparer = new MorningActivity(activityName, priority);
            breakfastPreparer.start();

            activityName = properties.getProperty("coffeeMakerName", "Unspecified activity");
            priority = Integer.parseInt(properties.getProperty("coffeeMakerPriority", "6"));
            MorningActivity coffeeMaker = new MorningActivity(activityName, priority);
            coffeeMaker.start();
        }
    }
}
