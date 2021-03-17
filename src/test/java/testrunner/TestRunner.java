package testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(            // features="C:/workspace/cucumber/features/admin.feature" ,------>it will excute only one feature file
		
		            features = ".\\features", // it will excute the all feature files
                    glue = "stepdefinition",
                    dryRun=false,
                    monochrome=true,    // it will delete the unwanted imformation
                    plugin= {"pretty","html:test-output"},
		            tags= ("@sanity")   // it is used to excute only sanity tags in feature file
                    
              )

public class TestRunner {

}
