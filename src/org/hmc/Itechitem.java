package org.hmc;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Itechitem {
public static void main(String[] args) throws AWTException {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Jessica\\eclipse-workspace\\Sharma18\\Ndows\\driver\\chromedriver.exe");	
WebDriver driver=new ChromeDriver();	
driver.get("https://www.snapdeal.com/");
WebElement s=driver.findElement(By.name("keyword"));
s.sendKeys("iphone11");
Robot r=new Robot();
r.keyPress(KeyEvent.VK_ENTER);
r.keyRelease(KeyEvent.VK_ENTER);

	}

}
