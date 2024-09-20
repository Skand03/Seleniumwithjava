package test;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class DropDown {
	
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("WebDriver.ChromeDriver", "D:\\All_Language\\INSTALLED_SOFT\\ECLLIPS\\Scripts\\chromedriver.exe");		
		WebDriver Driver = new ChromeDriver();
			
			//static dropdown --------------------------
		
			
			//  Driver.get("https://rahulshettyacademy.com/dropdownsPractise");
			  /* Thread.sleep(3000); Driver.manage().window().maximize(); WebElement curdd =
			 * Driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")); Select
			 * curDropDown = new Select(curdd); curDropDown.selectByIndex(3);
			 * curDropDown.selectByValue("AED"); curDropDown.selectByVisibleText("USD");
			 * Thread.sleep(2000);
			 * 
			 * Driver.findElement(By.id("divpaxinfo")).click(); // output - click passengers DropDown
			 * Thread.sleep(2000);
			 * 
			 * for(int i=1;i<=5;i++) { Driver.findElement(By.id("hrefIncAdt")).click(); //
			 * increments 5 times } for(int i=1;i<=3;i++) {
			 * Driver.findElement(By.id("hrefDecAdt")).click(); // decrements 2 times }
			 * 
			 * 
			 * Driver.findElement(By.id("ctl00_mainContent_chk_StudentDiscount")).click();
			 * Thread.sleep(3000);
			 */
		
			//Dynamic DropDown --------------------------------------
		
		/*	Driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
			Driver.findElement(By.xpath("//a[@value='BLR']")).click(); 
			Thread.sleep(2000);
			Driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();
			Thread.sleep(5000);  	// Output - open depart time calender
			
			
			//Auto Suggestion DropDown
			Driver.findElement(By.id("autosuggest")).sendKeys("ind"); // output - search India 
			Thread.sleep(3000);
			List<WebElement> countryList = Driver.findElements(By.xpath("//li[@class='ui-menu-item']/a"));
			
			//for(int i=1;i<=countryList.size();i++)
			for(WebElement country:countryList)
			{
				if(country.getText()=="India")
				{
					System.out.println(country.getText());
					country.click();
				}
			}
			Thread.sleep(3000); */
			
			
			Driver.get("https://www.spicejet.com/");
			Thread.sleep(5000);
			Driver.manage().window().maximize();
			
			Driver.findElement(By.cssSelector(".ui-datepicker-trigger")).click(); //click a date picker
			Driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();
			System.out.println(Driver.findElement(By.name("ctl00$mainContent$view_date2")).isEnabled());
			
			System.out.println(Driver.findElement(By.id("Div1")).getAttribute("style"));
			
			Driver.findElement(By.id("ctl00_mainContent_view_date2")).click();
			Thread.sleep(5000);
			System.out.println(Driver.findElement(By.id("Div1")).getAttribute("style"));
			
			if(Driver.findElement(By.id("Div1")).getAttribute("style").contains("1"))
			{
				System.out.println("enabled");
			}
			
			/*Driver.get("https://en-gb.facebook.com/");
			
			Driver.findElement(By.id("email")).sendKeys("azxcvkljasdf234slkdfjklsajdf");
			Driver.findElement(By.name("pass")).sendKeys("password");
			//Driver.findElement(By.name("login")).click();
			Driver.findElement(By.xpath("//button[@name='login']")).click();
			
			String errmsg = Driver.findElement(By.xpath("//*[@id=\'email_container\']/div[2]")).getText();
			System.out.println(errmsg);
			
			if(errmsg=="")
			{
				System.out.println("Login successful");
			}
			else
			{
				System.out.println("Incorrect login");
			}*/
}
}