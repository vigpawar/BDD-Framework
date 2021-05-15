package com.cg.pages;

import com.qa.factory.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

    WebDriver driver;

     private By signin = By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a");
     private  By usernameTextBox = By.xpath("//*[@id=\"email\"]");
     private By passwordTextBox = By.xpath("//*[@id=\"passwd\"]");
     private By SignInButton = By.xpath("//*[@id=\"SubmitLogin\"]/span");

     public LoginPage(WebDriver driver)
     {
     this.driver=driver;
     }


    public String GetTtile()
    {
     // driver= DriverFactory.GetDriver();
      return driver.getTitle();

    }
    public boolean isSigninLinkExists()
    {
       return driver.findElement(signin).isDisplayed();
    }
    public void clickSignin()
    {
        driver.findElement(signin).click();
    }
    public WebElement EnterUsername()
    {
        return driver.findElement(usernameTextBox);
    }
    public WebElement EnterPassword()
    {
        return driver.findElement(passwordTextBox);
    }
    public void ClickSignIn(){
         driver.findElement(signin).click();
    }
    public HomePage LoginToApplication(String username, String password)
    {
    driver.findElement(usernameTextBox).sendKeys(username);
    driver.findElement(passwordTextBox).sendKeys(password);
    driver.findElement(signin).click();
    return new HomePage(driver);
    }

}
