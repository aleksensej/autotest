package test_cases;

import org.junit.Test;
import test_general_classes.AbstractLoginTestDriver;
import test_general_classes.DashboardPage;
import test_general_classes.TaskPage;

public class LoginTest extends AbstractLoginTestDriver{
		
	@Test
	public void shouldLogin() throws InterruptedException{
		DashboardPage onDashboardPage = onLogin.clickOnLogin();
		TaskPage onTaskPage = onDashboardPage.clickOnNewTask();
		onTaskPage.fillTaskFields("Task Junit test");
		
		
	}
}
