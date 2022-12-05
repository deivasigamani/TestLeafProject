package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {

	public static void main(String[] args) {
		// Setup the browser driver
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		WebElement findElement = driver.findElement(By.id("username"));
		findElement.sendKeys("DemoCSR");
		WebElement findElement2 = driver.findElement(By.id("password"));
		findElement2.sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("myCompany");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("deiva");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Murugan");
		
	//	String text = driver.findElement(By.id("viewLead_firstName_sp")).getText();
		
		WebElement findElement3 = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select dropDown= new Select(findElement3);
		dropDown.selectByValue("LEAD_CONFERENCE");
		
		
		driver.findElement(By.name("submitButton")).click();
		//driver.close();
	}

}
