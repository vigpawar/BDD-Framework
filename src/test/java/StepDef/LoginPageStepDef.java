package StepDef;

import com.cg.pages.LoginPage;
import com.qa.factory.DriverFactory;
import com.qa.util.ConfigReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.io.IOException;
import java.util.Properties;

public class LoginPageStepDef {
    ConfigReader configReader = new ConfigReader();
    Properties prop ;
    LoginPage loginPage = new LoginPage(DriverFactory.GetDriver()); ;
    String ActualTitle;

    @Given("user is on login page")
    public void user_is_on_login_page() throws IOException {
        prop= configReader.GetProperty();
        DriverFactory.GetDriver().get(prop.getProperty("AppUrl"));

    }
    @When("user gets title of page")
    public void user_gets_title_of_page() {
        ActualTitle = loginPage.GetTtile();
        System.out.println(ActualTitle);
    }
    @Then("page title should be {string}")
    public void page_title_should_be(String ExpectedTitle) {

        Assert.assertEquals(ActualTitle,ExpectedTitle);
    }
    @Then("he clicks on sign in button")
    public void he_clicks_on_sign_in_button() {
        if(loginPage.isSigninLinkExists()==true){
            loginPage.clickSignin();
        }
    }
    @Then("he enters username {string} and password {string}")
    public void he_enters_username_and_password(String Username, String Password) {
        loginPage.EnterUsername().sendKeys(Username);
        loginPage.EnterPassword().sendKeys(Password);
        loginPage.ClickSignIn();

    }
    @Then("user should be on home page")
    public void user_should_be_on_home_page() {

    }

}
