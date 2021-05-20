package com.cg.pages;

import com.qa.factory.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
 private WebDriver driver;
 By searchBox = By.xpath("//*[@id=\"search_query_top\"]");
 public HomePage(WebDriver driver){
     this.driver=driver;
 }
 public WebElement SearchProduct()
 {
     return driver.findElement(searchBox);
 }
 public String GetTitle()
 {
     return driver.getTitle();
 }




}

