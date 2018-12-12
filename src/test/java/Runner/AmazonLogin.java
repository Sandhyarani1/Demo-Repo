package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "D:\\eclipse\\Qualitest\\com.qa.Testing\\src\\test\\resources\\FunctionalTest\\Loginamazon.Feature"
		,glue= {"StepDefinition"}
		
		
		)




public class AmazonLogin
{
	

}
