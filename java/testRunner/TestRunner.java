package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
		features="./Features/myfeature4.feature",		// if we want to execute the entire folder 
									// if we want to execute a partticular feature file we write
									//"./FolderNameOfFeatures/nameOftheFeatureFile"
		glue="StepDefinition",	
		tags="@smoke"								// name of package
//		dryRun=false				// if we write this the browser is not be opened when it is true
						// if it is false it willl be exeuted and open the browser
		)

public class TestRunner {
	
	

}
