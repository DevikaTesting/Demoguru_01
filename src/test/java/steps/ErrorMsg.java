package steps;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

public class ErrorMsg {
	static WebDriver driver;
	Base b=new Base();
	@Given("the user directs to add customer page")
	public void the_user_directs_to_add_customer_page() {
	    driver=b.getDriver();
	    b.loadUrl("http://demo.guru99.com/telecom/addcustomer.php");
	}

	@When("the user enters invalid data in the fields")
	public void the_user_enters_invalid_data_in_the_fields(DataTable cusDetails) throws InterruptedException {
	List<String> cus = cusDetails.asList(String.class);
	
		Thread.sleep(2000);
	    driver.findElement(By.xpath("//label[text()='Done']")).click();
	    driver.findElement(By.id("fname")).sendKeys(cus.get(0).toString());
	    driver.findElement(By.id("lname")).sendKeys(cus.get(1).toString());
	    driver.findElement(By.id("email")).sendKeys(cus.get(2).toString());
	    driver.findElement(By.name("addr")).sendKeys(cus.get(3).toString());
	    driver.findElement(By.id("telephoneno")).sendKeys(cus.get(4).toString());
	    driver.findElement(By.name("submit")).click();
	}

	@Then("the user should see error message")
	public void the_user_should_see_error_message() {
	    Assert.assertTrue(driver.findElement(By.id("fname")).getText(),true);
	    Assert.assertTrue(driver.findElement(By.id("lname")).getText(),true);
	    Assert.assertTrue(driver.findElement(By.id("email")).getText(),true);
	    Assert.assertTrue(driver.findElement(By.name("addr")).getText(),true);
	    Assert.assertTrue(driver.findElement(By.id("telephoneno")).getText(),true);
	}

}
