package com.test.autoit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.support.ui.Select;

public class AutoITDownload {
	public static void main(String[] args) {
		
			// Create a profile
			FirefoxProfile profile=new FirefoxProfile();

			// Set preferences for file type 
			profile.setPreference("browser.helperApps.neverAsk.openFile", "application/octet-stream");
			// Open browser with profile                   
			WebDriver driver=new FirefoxDriver(profile);

			// Set implicit wait
		
			// Maximize window
			driver.manage().window().maximize();
			
			// Open APP to download application
			driver.get("https://www.seleniumhq.org/download/");
			driver.findElement(By.xpath("//a[contains(text(),'3.141.59')]")).click();
			
			
	}}
