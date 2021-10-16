import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Project_1 {

	public static void main(String[] args) {
		


		System.setProperty("webdriver.chrome.driver","/Users/Mainuser/Downloads/Chromedriver");
 		
 		WebDriver driver = new ChromeDriver();

 		driver.get("https://www.amazon.com/");
 		
 		driver.manage().window().maximize();
 		
 		
 		
 		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("headphones");
 		
 		driver.findElement(By.id("nav-search-submit-button")).click();
 		
 		List <WebElement>allitems= driver.findElements(By.tagName("span")); 
 		
 	    System.out.println(" Total lists are:" + allitems.size());
 	    
 	    for ( int i =0; i<5; i++)
 	    {
 	    	System.out.println(" First five items are" +allitems.get(i).getAttribute("class"));
 	    	
 	    }
 		
 		
 		
	}

