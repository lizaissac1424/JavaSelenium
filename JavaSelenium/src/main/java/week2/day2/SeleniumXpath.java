package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumXpath {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
	driver.get("https://login.salesforce.com/?locale=in");
driver.findElement(By.xpath("//input[@id='username']")).sendKeys("dilip@testleaf.com");
	
	driver.findElement(By.xpath("//input[@id='password']")).sendKeys("testleaf@2024");
	
	driver.findElement(By.xpath("//input[@id='Login']")).click();


	}

}
