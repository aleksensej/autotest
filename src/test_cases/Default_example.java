package test_cases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.junit.Assert;

public class Default_example {

	public static void main(String[] args) throws InterruptedException {
		
		//Create Firefox driver to drive the browser
		System.setProperty("webdriver.gecko.driver", "E:\\Workspace\\Automated_testing_UI\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		//Open home page
		driver.get("http://demo.edeja.com:11180/scoopz/web/login");
		
		//Find what field and enter values
		driver.findElement(By.name("email")).sendKeys("nemanja@gmail.com");		
		driver.findElement(By.name("password")).sendKeys("Cane12345");
	
		//Find Login button and click on it	
		driver.findElement(By.xpath("//button[@ng-disabled='vm.isSubmitting']")).click();
		Thread.sleep(2000);
		
		//Check if you are logged in
		String login_url = driver.getCurrentUrl();		
		Assert.assertTrue(login_url.equals("http://demo.edeja.com:11180/scoopz/web/"));
		System.out.println(login_url);
		
		driver.findElement(By.xpath("//a[@href='/scoopz/web/task/']")).click();
		Thread.sleep(500);
		driver.findElement(By.id("title")).sendKeys("Task Junit test");
		// close the driver
		driver.close();
	}

}
