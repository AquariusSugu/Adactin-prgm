package com.runner;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Broken {

	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		List<WebElement> alllinks = driver.findElements(By.tagName("a"));
		int size = alllinks.size();
		System.out.println("total links "+size);
		int count =0;
		for(int i=0;i<alllinks.size(); i++)
		{
			WebElement link = alllinks.get(i);
			String attribute = link.getAttribute("href");
			URL url = new URL(attribute);
			URLConnection openConnection = url.openConnection();
			HttpsURLConnection connection = (HttpsURLConnection) openConnection;
			int responseCode = connection.getResponseCode();
			if(responseCode!=200)
			{
				count++;
				System.out.println("Links name are "+ attribute);
			}
		}
		
		System.out.println("Total no of broken links:" + count);
	}
}
