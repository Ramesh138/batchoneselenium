package com.selenium.basicprogram;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FileUpload2 {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException, AWTException {

		System.setProperty("webdriver.chrome.driver", ".//driver//chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		Thread.sleep(2000);

		StringSelection sel = new StringSelection("D:\\Public\\Sample.txt");

		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(sel, null);

		System.out.println("selection" + sel);

		driver.findElement(By.name("upload")).click();

		Robot ro = new Robot();

		ro.keyPress(KeyEvent.VK_CONTROL);

		ro.keyPress(KeyEvent.VK_V);

		ro.keyRelease(KeyEvent.VK_CONTROL);

		ro.keyRelease(KeyEvent.VK_V);

		ro.keyPress(KeyEvent.VK_TAB);

		ro.keyRelease(KeyEvent.VK_TAB);

		Thread.sleep(2000);

		ro.keyPress(KeyEvent.VK_TAB);

		ro.keyRelease(KeyEvent.VK_TAB);

		ro.keyPress(KeyEvent.VK_TAB);

		ro.keyRelease(KeyEvent.VK_TAB);

		ro.keyPress(KeyEvent.VK_TAB);

		ro.keyRelease(KeyEvent.VK_TAB);

		Thread.sleep(2000);

		ro.keyPress(KeyEvent.VK_TAB);

		ro.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(2000);
		ro.keyPress(KeyEvent.VK_TAB);

		ro.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(2000);
		ro.keyPress(KeyEvent.VK_TAB);

		ro.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(2000);
		ro.keyPress(KeyEvent.VK_ENTER);

		ro.keyRelease(KeyEvent.VK_ENTER);

		driver.quit();

	}

}
