package week2.day1;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SeleniumDropdown {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://leafground.com/select.xhtml");
		WebElement element = driver.findElement(By.className("ui-selectonemenu"));
		Select dd = new Select(element);
		List<WebElement> options = dd.getOptions();
		int size =options.size();
		System.out.println(size);
		for (int i = 0; i < options.size(); i++) {
			Thread.sleep(2000);
			//if particular dropdown options needs to be displayed
			if(i==1 ||i==3) {
			}
			options.get(i).click();		
			}
		}
}
