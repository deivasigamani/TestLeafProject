package week3.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonPhonePrice {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("phone");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		List<WebElement> findElements = driver.findElements(By.cssSelector(".a-price-whole"));

		List<Integer> mobileList = new ArrayList<Integer>();

		for (int i = 0; i < findElements.size(); i++) {
			WebElement webElement = findElements.get(i);

			String text = webElement.getText();
			String replaceFirst = text.replaceFirst(",", "");

			int parseInt = Integer.parseInt(replaceFirst);

			boolean add = mobileList.add(parseInt);

		}
		Collections.sort(mobileList);

		System.out.println("Before finding the least mobile price" + mobileList);
		Integer integer = mobileList.get(0);

		System.out.println("After finding the least value in the mobile price" + integer);

	}

}
