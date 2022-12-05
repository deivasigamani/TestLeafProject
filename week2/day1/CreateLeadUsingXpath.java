package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLeadUsingXpath {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		WebElement findElement = driver.findElement(By.xpath("//input[@name='USERNAME']"));
		findElement.sendKeys("DemoCSR");
		WebElement findElement2 = driver.findElement(By.xpath("//input[@name='PASSWORD']"));
		findElement2.sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'CRM')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Leads')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Create Lead')]")).click();
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("Deiva");
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("MyNewCompany");
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("Murugan");
		driver.findElement(By.xpath("//input[@name='submitButton']")).sendKeys(Keys.ENTER);

	}

}
