package AppHooks;

import com.qa.factory.DriverFactory;
import com.qa.util.ConfigReader;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.IOException;
import java.util.Properties;

public class ApplicationHooks {

    DriverFactory driverFactory;
    ConfigReader configReader;
    Properties prop ;
    WebDriver driver;

    @Before(order = 0)
    public void SetupProperties() throws IOException {
    configReader = new ConfigReader();
    prop=configReader.GetProperty();
    }
    @Before(order = 1)
    public void LaunchBrowser()
    {
        driverFactory = new DriverFactory();
        driver=driverFactory.Initialization();
    }
    @After(order = 1)
    public void TearDown(Scenario scenario)
    {
    if (scenario.isFailed()){
    String ScreenshotName =scenario.getName().replaceAll(" ","_");
        byte[] SourcePath = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        scenario.attach(SourcePath,"image/png",ScreenshotName);
    }
    }
    @After(order = 0)
    public void CloseWindow()
    {
    driver.quit();
    }
}
