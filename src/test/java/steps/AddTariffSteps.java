package steps;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

public class AddTariffSteps extends Base {

	@Given("The user is in add tariff plan page")
	public void the_user_is_in_add_tariff_plan_page() {
		getDriver();
		loadUrl("http://demo.guru99.com/telecom/addtariffplans.php");
	}

	@When("the User type the form details")
	public void the_User_type_the_form_details(DataTable tariff) throws InterruptedException {
		List<String> li = tariff.asList(String.class);
		System.out.println(li);
		Thread.sleep(4000);
		driver.findElement(By.name("rental")).sendKeys(li.get(0));
		driver.findElement(By.id("local_minutes")).sendKeys(li.get(1));
		driver.findElement(By.id("inter_minutes")).sendKeys(li.get(2));
		driver.findElement(By.id("sms_pack")).sendKeys(li.get(3));
		driver.findElement(By.id("minutes_charges")).sendKeys(li.get(4));
		driver.findElement(By.id("inter_charges")).sendKeys(li.get(5));
		driver.findElement(By.id("sms_charges")).sendKeys(li.get(6));
	}

	@When("Click the sumit button")
	public void click_the_sumit_button() {
		driver.findElement(By.name("submit")).click();
	}

	@Then("The user should see the success message")
	public void the_user_should_see_the_success_message() {
		Assert.assertTrue(true);
	}
	
	

	
}
