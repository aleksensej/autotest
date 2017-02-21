package test_general_classes;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AbstractLoginTestDriver {

    protected WebDriver driver;
    protected LoginPage onLogin;
	
	@Before
	public void testSetup(){
		System.setProperty("webdriver.gecko.driver", "E:\\Workspace\\Automated_testing_UI\\geckodriver.exe");
		driver = new FirefoxDriver();
		onLogin = new LoginPage(driver);
		onLogin = onLogin.navigateToWebApp();
	}
	
	@After
	public void testShutDown(){
		driver.close();
	}
	
}
