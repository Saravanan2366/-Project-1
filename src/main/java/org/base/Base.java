package org.base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
public static WebDriver driver;
	
	//LaunchChromeBrowser
	public static WebDriver ChromeLaunch(){
		WebDriverManager.chromedriver().setup();
		return driver=new ChromeDriver();
	}
	public static WebDriver edgeBrowser(){
		WebDriverManager.edgedriver().setup();
		return driver=new EdgeDriver();
	}
	
	//URLlaunch
	public static void urlLaunch(String url) {
		driver.get(url);
	}
	
	//implicitywait AND maximize
	public static void impWait(int sec) {
		driver.manage().timeouts().implicitlyWait(sec, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	
	//Back
	public static void back() {
		driver.navigate().back();
	}
	
	//forward
	public static void forward() {
		driver.navigate().forward();
	}

}
