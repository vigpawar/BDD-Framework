package com.qa.factory;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverFactory {

    WebDriver driver;
    static ThreadLocal<WebDriver> Tlocal=new ThreadLocal<>();

    public WebDriver Initialization() {

        WebDriverManager.chromedriver().setup();
        Tlocal.set(new ChromeDriver());
        return GetDriver();
    }
    public synchronized static WebDriver GetDriver() {
        return Tlocal.get();
    }
}
