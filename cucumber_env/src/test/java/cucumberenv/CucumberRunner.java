package cucumberenv;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources",
		glue= {"cucumberenv"}
		)

public class CucumberRunner {
	// 4th commit
}
