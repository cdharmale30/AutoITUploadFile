package com.test.autoit;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AutoITTest {
	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\selelib\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://tinyupload.com/");
		
		////input[@type='file']
		driver.findElement(By.xpath("//input[@type='file']")).click();;
		Runtime.getRuntime().exec("C:\\Users\\chetan\\Videos\\AutoIT\\FileUpload.exe");
		Thread.sleep(3000);
	}

}
