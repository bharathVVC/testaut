package com.qa.testscripts;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_WebDriverManager {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\bhara\\Downloads\\chromedriver_win32\\chromedriver.exe");
	ChromeDriver cdriver=new ChromeDriver();
	System.setProperty("webdriver.edge.driver","C:\\Users\\bhara\\Downloads\\edgedriver_win64\\msedgedriver.exe");
	EdgeDriver edriver=new EdgeDriver();
	WebDriverManager.chromedriver().setup();
	ChromeDriver cdriver1=new ChromeDriver();
	WebDriverManager.edgedriver().setup();
	EdgeDriver edriver1=new EdgeDriver();
	}}


