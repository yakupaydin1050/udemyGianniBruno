package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(features = {"classpath:features"}, glue = {"stepDefinitions"},
                monochrome = true, dryRun = false)



public class MainRunner extends AbstractTestNGCucumberTests {
}
