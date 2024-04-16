package com.teachmeskills.hw20.task1.using_runnable.runner;

import com.teachmeskills.hw20.task1.using_runnable.model.MorningActivity;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * Morning simulation class
 * contains method "main" to run the program
 * create and launch threads based on the loaded configuration.
 */
public class Runner {
    public static void main(String[] args) {
        Properties properties = new Properties();
        try (FileInputStream fileInputStream = new FileInputStream("config.properties")) {
            properties.load(fileInputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }

        String activityName = properties.getProperty("newsReaderName", "Unspecified activity");
        int priority = Integer.parseInt(properties.getProperty("newsReaderPriority", "6"));
        Thread threadNews = new Thread(new com.teachmeskills.hw20.task1.using_runnable.model.MorningActivity(activityName, priority));
        threadNews.start();

        activityName = properties.getProperty("breakfastPreparerName", "Unspecified activity");
        priority = Integer.parseInt(properties.getProperty("breakfastPreparerPriority", "6"));
        Thread threadBreakfast = new Thread(new com.teachmeskills.hw20.task1.using_runnable.model.MorningActivity(activityName, priority));
        threadBreakfast.start();

        activityName = properties.getProperty("coffeeMakerName", "Unspecified activity");
        priority = Integer.parseInt(properties.getProperty("coffeeMakerPriority", "6"));
        Thread threadCoffee = new Thread(new MorningActivity(activityName, priority));
        threadCoffee.start();
    }
}
