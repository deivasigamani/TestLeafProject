package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment4LeafGround {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.get("https://leafground.com/select.xhtml;jsessionid=node01726s9tfcenpf1bsn9pis5zxhx417425.node0");
		WebElement findElement = driver.findElement(By.className("ui-selectonemenu"));
		Select firstDropDown = new Select(findElement);
		firstDropDown.selectByIndex(2);
		driver.findElement(By.xpath("//label[contains(text(),'Country')]")).click();
		WebElement findElement5 = driver.findElement(By.xpath("//li[contains(text(),'Germany')]"));
		findElement5.click();
		System.out.println("Choose Country--->"+ findElement5.getText());
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[contains(text(),'Select City')]")).click();
		WebElement findElement3 = driver.findElement(By.xpath("//li[contains(text(),'Munich')]"));
		findElement3.click();
		System.out.println("Confirm Cities belongs to Country is loaded----->>"+ findElement3.getText());
		driver.findElement(By.xpath("//button[@type='button']")).sendKeys(Keys.ENTER);
		WebElement findElement2 = driver.findElement(By.xpath("//li[contains(text(),'Selenium WebDriver')]"));
		findElement2.click();
		System.out.println("Choose Course is--->"+ findElement2.getText());
		driver.findElement(By.xpath("//label[contains(text(),'Select Language')]")).click();
		WebElement findElement4 = driver.findElement(By.xpath("//li[contains(text(),'English')]"));
		findElement4.click();
		System.out.println("Choose language randomly----->"+ findElement4.getText());
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[contains(text(),'Values')]")).click();
		WebElement lang= driver.findElement(By.xpath("//li[@id='j_idt87:value_1']"));
		lang.click();
		System.out.println("Select 'Two' irrespective of the language chosen--->" + lang.getText());
		
	
	
	}

}
