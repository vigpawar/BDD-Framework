package TestRunners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

@CucumberOptions(
        features = "@target/failedrun.txt"
        ,glue={"StepDef","AppHooks"}
        ,dryRun = false,
        monochrome = true,
        plugin ={"pretty",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
                "timeline:test-output-thread/",


        }

)

public class FailedTestRunner {

}
