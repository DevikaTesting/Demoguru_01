package steps;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
	@Before
	public void method1() {
		System.out.println("start before method");
		Base b = new Base();
		b.getDriver();

	}

	@After
	public void method2() {
		System.out.println("start after method");
		Base b = new Base();
		b.getDriver().close();
		b.getDriver().quit();

	}
}
