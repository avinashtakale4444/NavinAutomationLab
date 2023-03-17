package Selenium;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/test.feature",
        glue = "src/test/java/Selenium",
        dryRun = true


)
public class Runner {

}
