package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandleAssignment {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();

		ChromeOptions options = new ChromeOptions();// blocks the browser notificaitons
		options.addArguments("--disable-notifications");
		
		

		
		//username:Demosalesmanager
		//password:crmsfa
		WebDriver driver = new ChromeDriver(options);

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		// WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get("http://leaftaps.com/opentaps/control/login");
		WebElement findElement = driver.findElement(By.xpath("//input[@name='USERNAME']"));
		findElement.sendKeys("DemoSalesManager");
		WebElement findElement2 = driver.findElement(By.xpath("//input[@name='PASSWORD']"));
		findElement2.sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'CRM')]")).click();
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.xpath("//div[@id='left-content-column']//a[contains(text(),'Merge Contacts')]")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//table[@class='twoColumnForm']//img")).click();
		
		Set<String> windowHandle = driver.getWindowHandles();
		List<String> parentWindow = new ArrayList<String>(windowHandle);
		String title= driver.switchTo().window(parentWindow.get(1)).getTitle();
		System.out.println(title);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a[@class='linktext']")).click();
		
	}

}
