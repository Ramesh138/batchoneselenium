package com.selenium.basicprogram;

import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class Application {

	public static WebDriver driver = null;
	
	public static void fluentwaitmethod(WebElement ele) {
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(30,TimeUnit.SECONDS)
				.pollingEvery(5, TimeUnit.SECONDS)
				.ignoring(NoSuchElementException.class);
				
				WebElement fillusername = wait.until(new Function<WebDriver, WebElement>() {
					
					public WebElement apply(WebDriver driver) {
						System.out.println(" i am in");
						return ele;
					}
				});
	}

	public static void launchurl(String url) {
		System.setProperty("webdriver.chrome.driver", ".//driver//chromedriver.exe");

		driver = new ChromeDriver();

		// driver.get("https://testguild.com/"); // to launch URL

//		String urlvalu = "https://testguild.com/";

		driver.navigate().to(url);
		
	

		System.out.println("Launch the url " + url);
	}
	
	
	
	public void mercuryLOgin() throws InterruptedException {
		driver.findElement(By.name("userName")).sendKeys("Pradeephnk@gmail.com");

		Thread.sleep(1000);

		driver.findElement(By.name("password")).sendKeys("Hansika2010");
		
		Thread.sleep(1000);
		
		
		driver.findElement(By.name("login")).click();
	}

	public static void maximiseTheWindow() {

		driver.manage().window().maximize(); // to maximise the window

	}

	public void clickblog() throws InterruptedException {
		driver.findElement(By.linkText("Blog")).click();

		System.out.println("click on the blog hyperlink");

		Thread.sleep(2000); // for 2 seconds of our code to excute
	}

	public void clickprodcast() throws InterruptedException {
		driver.findElement(By.linkText("Podcasts")).click();

		System.out.println(" click o the podcasts");

		Thread.sleep(2000); // for 2 seconds of our code to excute

	}

	public void navigateback() throws InterruptedException {
		driver.navigate().back();

		System.out.println(" navigate back to the blog");

		Thread.sleep(2000); // for 2 seconds of our code to excute
	}

	public void navigateforward() throws InterruptedException {
		driver.navigate().forward();

		System.out.println(" navigate forword to the URl");

		Thread.sleep(2000); // for 2 seconds of our code to excute
	}

	public void navigaterefresh() throws InterruptedException {
		driver.navigate().refresh();

		System.out.println("Refresh the URL");
		Thread.sleep(2000); // for 2 seconds of our code to excute
	}

	public static void closethebrowser() {
		driver.close();
	}

	public static void main(String[] args) throws InterruptedException {

		Application app = new Application();

		app.launchurl("Application");

		app.maximiseTheWindow();

		app.clickblog();

		app.clickprodcast();

		app.navigateback();

		app.navigateforward();

		app.navigaterefresh();

		app.closethebrowser();
	}

}
