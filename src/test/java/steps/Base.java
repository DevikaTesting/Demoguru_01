package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	public static WebDriver driver;
public WebDriver getDriver() {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\KASTHURI\\Downloads\\chromedriver.exe");
    return driver=new ChromeDriver();

}
public void loadUrl(String url) {
	driver.get(url);

}

}

