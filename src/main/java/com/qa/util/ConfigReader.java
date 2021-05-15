package com.qa.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
    Properties prop;
    public Properties GetProperty() throws IOException {
        prop=new Properties();
        FileInputStream fis = new FileInputStream("src/test/java/config.properties");
        prop.load(fis);
        return prop;

    }
}
