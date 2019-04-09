package steps;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/features/AddTariff.feature",monochrome=true,glue="steps",plugin="html:target")
public class TestRunner {

}
