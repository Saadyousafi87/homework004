package com.homework.testrunners;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features= {"Features"}, glue= {"com.homework.stepdefs"})

public class testrunner extends AbstractTestNGCucumberTests {

}
