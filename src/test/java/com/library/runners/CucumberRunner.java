package com.library.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        glue = "com/library/step_definitions",
        features = "src/test/resources/features",
        dryRun = true,
        monochrome=true,
        plugin = {"pretty","html:test-output"}

)
public class CucumberRunner {
    // I made it
}
