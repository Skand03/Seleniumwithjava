package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class selector_Locator {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("WebDriver.ChromeDriver", "D:\\All_Language\\INSTALLED_SOFT\\ECLLIPS\\Scripts\\chromedriver.exe");		
		WebDriver Driver = new ChromeDriver();
		
		Driver.get("https://en-gb.facebook.com/");
		
		Driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
		Driver.findElement(By.id("pass")).sendKeys("aabbccddee");
		Driver.findElement(By.name("login")).click();
		Driver.findElement(By.linkText("Forgotten password?")).click();
		
		/*Driver.findElement(By.name("email")).sendKeys("abc@gmail.com");
		Driver.findElement(By.name("pass")).sendKeys("abccccderea213");
		Driver.findElement(By.name("login")).click();*/
		
		//Driver.findElement(By.linkText("Forgotten password?")).click();
		
		/*Driver.get("https://www.airbnb.co.in");
		Driver.findElement(By.name("query")).sendKeys("Goa");
		//Driver.findElement(By.className("p1kudodg")).click();
		//Driver.findElement(By.id("tab--tabs--1")).click();
		//Driver.findElement(By.className("_1i9o6cu")).click();
		Driver.findElement(By.linkText("I’m flexible")).click();*/
		
		/*Driver.findElement(By.name("email")).sendKeys("abc@gmail.com");
		Driver.findElement(By.name("pass")).sendKeys("abccccderea213");
		//Driver.findElement(By.xpath("//*[@id=\'u_0_h_J5\']")).click();
		Driver.findElement(By.cssSelector("#u_0_h_yJ")).click();*/
		
	}
}
