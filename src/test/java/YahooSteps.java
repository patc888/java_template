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
        //driver.get("http://www.yahoo.com");
        driver.get("http://localhost:8080");
    }

    @When("^I search for \"(\\S+)\"$")
    public void search(String s) {
        // Find the text input element by its name
        WebElement element = driver.findElement(By.linkText("Objects"));
        element.click();

        // Enter something to search for
        //element.sendKeys("Cheese!");

        // Now submit the form. WebDriver will find the form for us from the element
        //element.submit();

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

