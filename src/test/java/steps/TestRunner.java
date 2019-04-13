package steps;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/features",monochrome=true,glue="steps",plugin= {"html:target","json:src/test/java/pack2/report.json"})
public class TestRunner {

}
