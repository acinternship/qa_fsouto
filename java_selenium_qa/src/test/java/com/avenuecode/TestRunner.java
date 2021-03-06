package com.avenuecode;

import cucumber.api.junit.Cucumber;
import cucumber.api.CucumberOptions;

import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = { "pretty", "html:target/cucumber-html-report"},
		features = "src/test/resources",
		tags = {"@runThis"}
		)
public class TestRunner {
}
