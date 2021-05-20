package ParallelExecution;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import org.junit.runner.RunWith;
import org.testng.annotations.DataProvider;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/FeaturesFiles"
        ,glue={"ParallelExecution"}
        ,dryRun = false,
        monochrome = true,
        plugin ={"pretty",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
                "timeline:test-output-thread/"


        }

)

public class TestngRunner extends AbstractTestNGCucumberTests {
    @Override
    @DataProvider(parallel = true)

    public Object[][] scenarios(){
        return super.scenarios();

    }
}
