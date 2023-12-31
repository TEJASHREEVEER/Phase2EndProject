package stepdefs;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

	
@CucumberOptions(	
		monochrome=true,
        plugin = {"pretty","html:target/html-cucumber","json:target/cucumber.json"},
		features = "src/test/java/Features",
		glue = "stepdefs",
		tags = ("@Login or @Addtocart")
				
				
)

		public class TestRunner {		

}