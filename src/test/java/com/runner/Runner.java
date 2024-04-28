package com.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\Vasanth\\eclipse-workspace\\CloudBankin\\src\\test\\java\\com\\feature\\CreateLoan.feature",
glue="com.stepdefinition",
dryRun = false,
tags = "@tag1",
monochrome=true,
plugin = {"html:Reports/sample.html"}
)
public class Runner {

}
