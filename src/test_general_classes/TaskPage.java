package test_general_classes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TaskPage extends AbstractPage{
	
	public TaskPage(WebDriver driver){
		super(driver);
	}
	
	public TaskPage fillTaskFields (String title){
		driver.findElement(By.id("title")).sendKeys(title);
		return new TaskPage(driver);		
	}

}
