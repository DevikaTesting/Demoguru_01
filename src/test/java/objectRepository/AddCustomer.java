package objectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import steps.Base;

public class AddCustomer {
	public AddCustomer() {
		PageFactory.initElements(Base.driver, this);
	}

	@FindBy(xpath = "//label[text()='Done']")
	private WebElement cli;
	@FindBy(id = "fname")
	private WebElement name;
	@FindBy(id = "lname")
	private WebElement lname;
	@FindBy(id = "email")
	private WebElement mail;
	@FindBy(name = "addr")
	private WebElement address;
	@FindBy(id = "telephoneno")
	private WebElement phno;
	@FindBy(name = "submit")
	private WebElement sub;

	public WebElement getCli() {
		return cli;
	}

	public WebElement getName() {
		return name;
	}

	public WebElement getLname() {
		return lname;
	}

	public WebElement getMail() {
		return mail;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getPhno() {
		return phno;
	}

	public WebElement getSub() {
		return sub;
	}

}
