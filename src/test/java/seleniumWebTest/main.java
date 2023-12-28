package seleniumWebTest;

import java.sql.Driver;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

//Keep test in src/test/java

public class main {

	public static void main(String[] args) throws InterruptedException {
		
// Must Remember
// .navigate/.back/.refresh/.write.sendtext/.click
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.geico.com/");

	//Thread.sleep(2000);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	String title = driver.getTitle();	
	System.out.println(title);
	////*[@class='gb_Hd']
	//driver.findElement(By.xpath("//*[@class='gb_Hd']"));
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.findElement(By.xpath("//*[@id=\"ssp-service-zip\"]")).sendKeys("21244");
	driver.manage().window().maximize();
	driver.manage().window().minimize();
	driver.manage().window().maximize();
	String url = "https://www.geico.com/\r\n";
	String cruuentUrl =    driver.getCurrentUrl();
	
	
	System.out.println(cruuentUrl +  "   This is URL ");
	
	
	//Thread.sleep(9000);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
//we found parent element
	WebElement parentElement =  driver.findElement(By.xpath("//*[@id=\"quoteForm\"]/div[2]"));
	List<WebElement> childElements = parentElement.findElements(By.className("card"));
	
	int numberOfitems = childElements.size();
	System.out.println(numberOfitems);
	
	
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

//RElative xpath by me //*[@class='hamburger-menu']
	WebElement manuButton = driver.findElement(By.xpath("//*[@class='hamburger-menu']"));
	
	System.out.println(manuButton);
	manuButton.click();
	String newTitle = driver.getTitle();
	System.out.println(newTitle);
	
	driver.findElement(By.xpath("//a[text()='Insurance']")).click();
	driver.findElement(By.xpath("//a[text()='Back']")).click();
	System.out.println(newTitle);
Thread.sleep(2000);
	driver.quit();
	
	
	}
	

}
