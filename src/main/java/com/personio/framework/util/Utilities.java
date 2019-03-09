package com.personio.framework.util;

import java.io.InputStream;
import java.util.Properties;

public class Utilities {

    public Properties getProperties () {
        try {
            Properties properties = new Properties();
            InputStream inputStream = getClass().getClassLoader().getResourceAsStream("config.properties");
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
    public static void main (String [] args) {
        Properties properties = new Utilities().getProperties();
        System.out.println(properties.get("browser"));
    }
}