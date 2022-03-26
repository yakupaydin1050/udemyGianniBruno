package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pageObjects.Base_PO;


public class LoginSteps extends Base_PO {

    private WebDriver driver = getDriver();


    @Given("I access the webdriver university login page")
    public void i_access_the_webdriver_university_login_page() {

        navigateTo_URL("https://webdriveruniversity.com/Login-Portal/index.html?");

    }

    @When("I enter a username {}")
    public void i_enter_a_username(String username) {
        driver.findElement(By.id("text")).sendKeys(username);
    }

    @And("I enter a password {}")
    public void iEnterAPasswordWebdriver(String password) {
        driver.findElement(By.id("password")).sendKeys(password);
    }

    @When("I click on the login button")
    public void i_click_on_the_login_button() {
        driver.findElement(By.id("login-button")).click();

    }

    @Then("I should be presented with the successful login message")
    public void i_should_be_presented_with_the_successful_login_message() {
        String login_Message = driver.switchTo().alert().getText();
        Assert.assertEquals(login_Message, "validation succeeded");
    }


    @Then("I should be presented with the unsuccessful login message")
    public void iShouldBePresentedWithTheUnsuccessfulLoginMessage() {
        String login_Message = driver.switchTo().alert().getText();
        Assert.assertEquals(login_Message, "validation failed");
    }


    @Then("I should be presented with the following login validation message {}")
    public void i_should_be_presented_with_the_following_login_validation_message(String expectedMessage) {
        String login_Message = driver.switchTo().alert().getText();
        Assert.assertEquals(login_Message, expectedMessage);
    }
}
