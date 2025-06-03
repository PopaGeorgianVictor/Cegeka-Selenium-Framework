package ro.mayo;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
    private static Properties properties = new Properties();

    public static void readProperties() {
        try {
            properties.load(new FileInputStream("application.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String get(String key) {
        if (properties.isEmpty())
            readProperties();
        return properties.getProperty(key);
    }
}