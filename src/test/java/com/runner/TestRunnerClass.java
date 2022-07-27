package com.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.report.Reporting;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.java.lu.a;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(plugin= {"json:target/output.json"},monochrome=true,features= {"src\\test\\resources"},glue= {"com.stepdefinition"})
public class TestRunnerClass {

	@AfterClass
	public static void afterclass() {
	Reporting.generatesJVMReport("C:\\Users\\Dell\\eclipse-workspace\\AdactinHotel\\target\\output.json");

	}
}
