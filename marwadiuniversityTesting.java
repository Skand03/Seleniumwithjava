package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class marwadiuniversityTesting {

	public static void main(String[] args) {

		System.setProperty("WebDriver.ChromeDriver", "D:\\All_Language\\INSTALLED_SOFT\\ECLLIPS\\Scripts\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.marwadiuniversity.ac.in");
		driver.manage().window().maximize();	
		System.out.println(driver.getTitle()); 
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getPageSource());
		
		driver.get("https://www.google.com");
		driver.navigate().back();
		driver.close();	

	}

}
