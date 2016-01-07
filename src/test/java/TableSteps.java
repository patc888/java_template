import java.util.*;
import cucumber.api.java.en.*;
import cucumber.api.junit.Cucumber;
import static org.junit.Assert.*;

public class TableSteps {
    Map<String, String> map;

    @Given("^a new table$")
    public void a_new_table() {
        map = new HashMap<>();
    }

    @When("^I add a key \"(\\S+)\" and value \"(\\S+)\"$")
    public void i_add_the_key(String key, String value) {
        map.put(key, value);
    }

    @Then("^the table size is (\\d+)$")
    public void size_of_table(int n) {
        int size = map.size();
        assertEquals("The map size is incorrect",  1, size);
    }
}
