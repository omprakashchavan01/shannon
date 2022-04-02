package awesomecucumber.runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;

import static io.cucumber.testng.CucumberOptions.SnippetType.CAMELCASE;

@CucumberOptions(
        plugin = {"pretty", "html:target/cucumber.html"},
        snippets = CAMELCASE,
//        dryRun = true,
        monochrome = false,
        tags = "@smoke",
        glue = {"awesomecucumber.stepdef", "awesomecucumber.types"},
        features = "src/test/resources/awesomecucumber"
)
public class TestNGRunnerTest extends AbstractTestNGCucumberTests {
    @Override
    @DataProvider(parallel = false)
    public Object[][] scenarios() {
        return super.scenarios();
    }
}
