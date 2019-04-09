package steps;

import org.junit.Assert;
import org.openqa.selenium.By;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TariffAlert extends Base {
	@When("Click the submit button")
	public void click_the_submit_button() {
	    driver.findElement(By.name("submit")).click();
	}

	@Then("the user sees alert message")
	public void the_user_sees_alert_message() {
		Assert.assertEquals(driver.switchTo().alert().getText(),"please fill all fields Correct Value");
	}
	
	
}
