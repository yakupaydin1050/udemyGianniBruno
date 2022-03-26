package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//monochrome -> true oldugu zaman konsol daha okunakli
//pretty -> konsolda senaryolar da cikiyor
//html -> cucumber isimli bir html rapor olustuyor
//cucumber.json dosyasi jenkins icin anlamlı bir rapor olustuyor
//@befor ya da @after nereye yazarsak yazalim, tum senaryolarda browser acilir.

@CucumberOptions(features = {"classpath:features"}, glue = {"stepDefinitions"},
                tags = "@smoke", monochrome = true, dryRun = false,
                 plugin = {"pretty", "html:target/cucumber", "json:target/cucumber.json"})



public class MainRunner extends AbstractTestNGCucumberTests {
}
