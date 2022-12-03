package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DupilicateLead {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		WebElement findElement = driver.findElement(By.id("username"));
		findElement.sendKeys("DemoSalesManager");
		WebElement findElement2 = driver.findElement(By.id("password"));
		findElement2.sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("myCompany");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("deivasigamani2");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Murugan2");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("MyFirstname");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("SeleniumAutoMation");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("DuplicateLeadDescription");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("deiva@gmail.com");
		WebElement stateDD = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select stateDropDown = new Select(stateDD);
		stateDropDown.selectByVisibleText("New York");
		driver.findElement(By.name("submitButton")).click();
		String titleOfThePage = driver.getTitle();
		System.out.println(titleOfThePage);
		driver.findElement(By.linkText("Duplicate Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).clear();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("DuplicateCompanyNameEntered");
		driver.findElement(By.id("createLeadForm_firstName")).clear();
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("DuplicateFirstName");
		driver.findElement(By.xpath("//input[@value='Create Lead']")).click();
		String titleOfTheDuplicateLeadAssignment = driver.getTitle();
		System.out.println(titleOfTheDuplicateLeadAssignment);
	}

}
