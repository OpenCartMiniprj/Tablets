package miniProject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tablets__Module 
{
  public static void main(String [] args) throws InterruptedException
  {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\mounika_erri\\Downloads\\chromedriver_win32\\chromedriver.exe");
	   WebDriver w=new ChromeDriver();
	   w.get("http://localhost/opencartpro1/index.php?route=common/home");
	   
	   //Maximizing the window
	   w.manage().window().maximize();
	   Thread.sleep(2000); 
	   
	   //Clicking on the Tablets module
	   w.findElement(By.xpath("//*[@id=\"menu\"]/div[2]/ul/li[4]/a")).click();
	   Thread.sleep(2000);
	   
	   //clicking on the list option
	   w.findElement(By.xpath("//*[@id=\"list-view\"]/i")).click();
	   Thread.sleep(2000);
	   
	   //Clicking on the product
	   w.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div/div/div[1]/a/img")).click();
	   Thread.sleep(2000);
	   
	   //Scrolling
	   JavascriptExecutor js=(JavascriptExecutor)w;
	   js.executeScript("window.scrollBy(0,300)");
	   Thread.sleep(2000);
	   
	   //click on add to cart
	   w.findElement(By.xpath("//*[@id=\"button-cart\"]")).click();
	   Thread.sleep(2000);
	   w.close();
  }
}
