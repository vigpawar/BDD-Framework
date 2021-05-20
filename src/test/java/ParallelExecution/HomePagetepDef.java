package ParallelExecution;

import com.cg.pages.HomePage;
import com.cg.pages.LoginPage;
import com.qa.factory.DriverFactory;
import com.qa.util.ConfigReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.io.IOException;
import java.util.Properties;

public class HomePagetepDef {
    LoginPage loginPage = new LoginPage(DriverFactory.GetDriver());
    Properties prop;
    ConfigReader configReader = new ConfigReader();
    HomePage homePage ;

    @Given("user is already on homepage")
    public void user_is_already_on_homepage() throws IOException {
        prop= configReader.GetProperty();
        DriverFactory.GetDriver().get(prop.getProperty("AppUrl"));
        homePage=loginPage.LoginToApplication(prop.getProperty("username"),prop.getProperty("password"));

    }
    @When("user enter product name in searchbox")
    public void user_enter_product_name_in_searchbox() {
    homePage.SearchProduct().sendKeys("dress");

    }
    @Then("user should get list of selected products")
    public void user_should_get_list_of_selected_products() {
        System.out.println("got list of products");

    }

}
