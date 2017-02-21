package test_general_classes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashboardPage extends AbstractPage{

	public DashboardPage(WebDriver driver) {
		super(driver);
	}
	
	public TaskPage clickOnNewTask(){
		driver.findElement(By.xpath("//a[@href='/scoopz/web/task/']")).click();
		return new TaskPage(driver);
	}

}
