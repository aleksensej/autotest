package test_general_classes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends AbstractPage{

	public LoginPage(WebDriver driver) {
		super(driver);
	}
	
	public DashboardPage clickOnLogin() throws InterruptedException {
		driver.findElement(By.name("email")).sendKeys("nemanja@gmail.com");		
		driver.findElement(By.name("password")).sendKeys("Cane12345");
		driver.findElement(By.xpath("//button[@ng-disabled='vm.isSubmitting']")).click();
		//Adding wait till dashboar page can be loaded
		Thread.sleep(3000);
		return new DashboardPage(driver);
	}

}
