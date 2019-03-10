package com.personio.framework.util;

import java.io.InputStream;
import java.util.Properties;

/*
Class for utilities
 */
public class Utilities {

    /*
    Read properties file in the resources folder
     */
    public Properties getProperties (String propertiesFile) {
        try {
            Properties properties = new Properties();
            InputStream inputStream = getClass().getClassLoader().getResourceAsStream(propertiesFile);
            if (inputStream != null) {
                properties.load(inputStream);
            return properties;
            } else {
                throw new AssertionError("Property file 'config.properties' not found in the classpath");
            }
        }
        catch (Exception ex) {
            throw new AssertionError("Unable to load config.properties");
        }
    }
}