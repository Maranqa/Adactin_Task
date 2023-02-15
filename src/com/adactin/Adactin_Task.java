package com.adactin;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.logging.FileHandler;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Adactin_Task {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Asus\\eclipse-workspace\\Adactin_Task\\Web Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://adactinhotelapp.com/SearchHotel.php");
		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.findElement(By.name("username")).sendKeys("Viswa1212");
		driver.findElement(By.id("password")).sendKeys("*Viswa1212");
		driver.findElement(By.xpath("//input[@type='Submit']")).click();
		Thread.sleep(2000);
		WebElement location = driver.findElement(By.name("location"));
		location.click();
		Select s =new Select(location);
		s.selectByVisibleText("London");
		Thread.sleep(2000);
		WebElement hotels = driver.findElement(By.name("hotels"));
		hotels.click();
		Select s1 = new Select(hotels);
		s1.selectByValue("Hotel Creek");
		Thread.sleep(2000);
		WebElement roomtype = driver.findElement(By.id("room_type"));
		roomtype.click();
		Thread.sleep(2000);
		Select s2 = new Select(roomtype);
		s2.selectByIndex(3);
		Thread.sleep(2000);
		WebElement rmno = driver.findElement(By.name("room_nos"));
		rmno.click();
		Select s3 = new Select(rmno);
		s3.selectByValue("1");
		Thread.sleep(2000);
		WebElement checkin = driver.findElement(By.name("datepick_in"));
		checkin.clear();
		checkin.sendKeys("30/01/2023");
		Thread.sleep(2000);
		WebElement checkout = driver.findElement(By.id("datepick_out"));
		checkout.clear();
		checkout.sendKeys("31/01/2023");
		WebElement adults = driver.findElement(By.id("adult_room"));
		adults.click();
		Select s4 = new Select(adults);
		s4.selectByValue("2");
		WebElement childrens = driver.findElement(By.name("child_room"));
		childrens.click();
		Select s5 = new Select(childrens);
		s5.selectByValue("2");
		driver.findElement(By.name("Submit")).click();
		driver.findElement(By.name("radiobutton_0")).click();	
		driver.findElement(By.name("continue")).click();
		WebElement firstname = driver.findElement(By.name("first_name"));
		firstname.sendKeys("Maran");
		WebElement lastname = driver.findElement(By.name("last_name"));
		lastname.sendKeys("Mkumar");
		WebElement address = driver.findElement(By.name("address"));
		address.sendKeys("Koyambedu,chennai-05");
		WebElement creditcard = driver.findElement(By.name("cc_num"));
		creditcard.sendKeys("1234567899876543");
		WebElement cardtype = driver.findElement(By.name("cc_type"));
		cardtype.click();
		Select s6 =new Select(cardtype);
		s6.selectByValue("AMEX");
		Thread.sleep(2000);
		WebElement expmonth = driver.findElement(By.id("cc_exp_month"));
		expmonth.click();
		Thread.sleep(5000);
		Select s7 = new Select(expmonth);
		s7.selectByValue("2");
		WebElement expyr = driver.findElement(By.name("cc_exp_year"));
		expyr.click();
		Select s8 = new Select(expyr);
		s8.selectByValue("2022");
		WebElement cvvnumber = driver.findElement(By.name("cc_cvv"));
		cvvnumber.sendKeys("624");
		driver.findElement(By.name("book_now")).click();
		TakesScreenshot ss = (TakesScreenshot)driver;
		Thread.sleep(2000);
		File f = ss.getScreenshotAs(OutputType.FILE);
		Thread.sleep(4000);
		File f1 = new File("C:\\Users\\Asus\\eclipse-workspace\\Adactin_Task\\Web Driver\\Hb.png");
//		Filehandler(f1,f);
		Thread.sleep(2000);
		FileUtils.copyFile(f,f1);
		
		}

	}


