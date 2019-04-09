package steps;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

public class TariffInvalid extends Base{
	
	@When("user fill the fields with invalid data")
	public void user_fill_the_fields_with_invalid_data(DataTable tariff) throws InterruptedException {
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
		driver.findElement(By.name("submit")).click();

	}

	@Then("the user see invalid input labels")
	public void the_user_see_invalid_input_labels() {
		Assert.assertEquals(driver.switchTo().alert().getText(),"please fill all fields Correct Value");
		
	}
	
}