package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {

	public static void main(String[] args) {

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
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("myCompany");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("deiva");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Murugan");
		// String text = driver.findElement(By.id("viewLead_firstName_sp")).getText();
		WebElement findElement3 = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select dropDown = new Select(findElement3);
		dropDown.selectByValue("LEAD_CONFERENCE");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("ComputerScience");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("EditLeadAssignments");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("deivasigamanicse@gmail.com");
		WebElement stateDD = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select stateDropDown = new Select(stateDD);
		stateDropDown.selectByVisibleText("New York");
		driver.findElement(By.name("submitButton")).click();
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("updateLeadForm_description")).clear();
		driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("Important notice for Edit");
		driver.findElement(By.xpath("//input[@value='Update']")).click();

	}
}