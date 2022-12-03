package week4.day1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandleClassRoomActivity {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();

		ChromeOptions options = new ChromeOptions();// blocks the browser notificaitons
		options.addArguments("--disable-notifications");

		WebDriver driver = new ChromeDriver(options);
		// WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.findElement(By.xpath("//div[@class='h_menu_drop_button hidden-xs']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//img[@id='disha-banner-close']")).click();
		driver.findElement(By.xpath("//label[text()='FLIGHTS']")).click();
		Set<String> parentWindow = driver.getWindowHandles();
		List<String> windowHandle = new ArrayList<String>(parentWindow);
		String parentWindowTitle = driver.switchTo().window(windowHandle.get(0)).getTitle();
		System.out.println(parentWindowTitle);
		

	}

}
