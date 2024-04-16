package com.teachmeskills.hw20.task1.using_thread.service.loading_properties_service;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * Class contains method "loadProperties" - method for loading configuration parameters from a "config.properties" file.
 */
public class LoadingProperties {
    public static Properties loadProperties() {
        Properties properties = new Properties();
        try (FileInputStream fileInputStream = new FileInputStream("config.properties")) {
            properties.load(fileInputStream);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
        return properties;
    }
}
