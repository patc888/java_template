import java.util.*;
import java.util.concurrent.TimeUnit;

import cucumber.api.java.en.*;
import cucumber.api.junit.Cucumber;

import static org.junit.Assert.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class YahooSteps {
    public static WebDriver driver;

    @Given("^I am on the Yahoo home page$")
    public void home_page() {
        if (driver != null) {
            driver.quit();
        }
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://tw.yahoo.com");
    }

    @When("^I search for \"(\\S+)\"$")
    public void search(String s) {
        // Find the text input element by its name
        WebElement element = driver.findElement(By.id("UHSearchBox"));

        // Enter the search term
        element.sendKeys("pig");

        // Submit the form
        element.submit();

    }

    @Then("^search results are returned$")
    public void search_results() {
        // Check the title of the page
        System.out.println("Page title is: " + driver.getTitle());
    }

    public static void cleanUp() {
        if (driver != null) {
            driver.quit();
        }
    }
}

