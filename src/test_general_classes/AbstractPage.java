package test_general_classes;

import org.openqa.selenium.WebDriver;

public class AbstractPage {
	
	protected WebDriver driver;
	
	public AbstractPage (WebDriver driver){
		this.driver = driver;
	}
	
	public WebDriver getDriver(){
		return driver;
	}
	
	public LoginPage navigateToWebApp() {
		driver.get("http://demo.edeja.com:11180/scoopz/web/login");
		return new LoginPage(driver);
	}
}
