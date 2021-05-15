package StepDef;

import com.qa.factory.DriverFactory;
import com.qa.util.ConfigReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.io.IOException;
import java.util.Properties;

public class LoginPageStepDef {
    WebDriver driver;
    ConfigReader configReader = new ConfigReader();
    Properties prop ;

    @Given("user is on login page")
    public void user_is_on_login_page() throws IOException {
        prop= configReader.GetProperty();
        driver = DriverFactory.GetDriver();
        driver.get(prop.getProperty("AppUrl"));

    }
    @When("user gets title of page")
    public void user_gets_title_of_page() {
        System.out.println("hi");
    }
    @Then("page title should be {string}")
    public void page_title_should_be(String string) {
        System.out.println("hello");
    }

}
