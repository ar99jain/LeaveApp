package testRunner1;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/java/features" ,  //---It will run all feature files
		//features = "src/test/java/Features/Ultimatix.feature",
		glue = "src/test/java/steps"
		)

public class AllTest {

}


