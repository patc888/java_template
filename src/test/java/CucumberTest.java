import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

@RunWith(Cucumber.class)
public class CucumberTest {
    @AfterClass
    public static void afterClass() {
        YahooSteps.cleanUp();
    }

    public CucumberTest() {
        System.out.println("hi");
    }
}
