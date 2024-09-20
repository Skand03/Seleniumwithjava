package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Conditional_elements {
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("WebDriver.ChromeDriver", "D:\\All_Language\\INSTALLED_SOFT\\ECLLIPS\\Scripts\\chromedriver.exe");		
		WebDriver Driver = new ChromeDriver();
		
		Driver.get("http://demo.guru99.com/test/facebook.html");
		WebElement chkPer = Driver.findElement(By.name("persistent"));
		
		chkPer.click(); // output - Keep me logged in will be checked
		
		if(chkPer.isSelected())
		{
			System.out.println("Checkbox is selected");
		}
		else
		{
			System.out.println("Checkbox is not selected");
		} 
	
}
}

