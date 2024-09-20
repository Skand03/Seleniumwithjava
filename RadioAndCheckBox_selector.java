package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioAndCheckBox_selector {
	
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("WebDriver.ChromeDriver", "D:\\All_Language\\INSTALLED_SOFT\\ECLLIPS\\Scripts\\chromedriver.exe");		
		WebDriver Driver = new ChromeDriver();
		
		Driver.get("http://demo.guru99.com/test/radio.html");
		//check the radio button and checkbox
		Driver.findElement(By.id("vfb-7-3")).click(); //Option-3
		
		Driver.findElement(By.id("vfb-6-0")).click(); //checkbox-1
		Driver.findElement(By.id("vfb-6-1")).click(); //checkbox-2
		Driver.findElement(By.id("vfb-6-2")).click(); //checkbox-3
	
}
}