package com.cucumber.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(
	//	features= {"/Users/shanbalakrishnan/Documents/Geethanjali/WorkSpace/CucumberBasics/Features/Demo.feature"},
	//	features= {"/Users/shanbalakrishnan/Documents/Geethanjali/WorkSpace/CucumberFrameworkFirebass/Features"},
		features= {"Features/"},
		glue= {"com.cucumber.steps"},
		//tags= "@smoke",
		plugin= {"pretty","html:target/cucumber-reports/cucumber.html",
						"json:target/cucumber-reports/cucumber.json"}
		)
		




public class Runner {

}
