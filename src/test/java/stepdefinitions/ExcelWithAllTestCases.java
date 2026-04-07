package stepdefinitions;

import org.openqa.selenium.WebDriver;
import utils.DriverFactory;
import io.cucumber.java.en.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import pages.LoginPage;

import java.time.Duration;

public class ExcelWithAllTestCases {

    private WebDriver driver;   // ✅ FIX
    private LoginPage loginPage;

    @Given("user is on login page")
public void user_is_on_login_page() {
    driver = DriverFactory.getDriver();
    driver.get("https://demoqa.com/login");   // 🔥 ADD THIS
    loginPage = new LoginPage(driver);
}

    @When("user enters username {string} and password {string}")
    public void enter_credentials(String username, String password) {
        loginPage.enterUsername(username);
        loginPage.enterPassword(password);
    }

    @And("clicks on login button")
    public void clicks_on_login_button() {
        loginPage.clickLogin();
    }

    @Then("login result should be {string}")
    public void login_result_should_be(String expectedResult) throws InterruptedException {

        if (expectedResult.equalsIgnoreCase("success")) {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            wait.until(ExpectedConditions.urlContains("profile"));
            Assert.assertTrue(driver.getCurrentUrl().contains("profile"));
        } else {
            Thread.sleep(5000);
            Assert.assertTrue(driver.getCurrentUrl().contains("login"));
        }
    }
}