package org.utility;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class UtilityClass {
	public static WebDriver driver;
	public static WebElement findelement;
	public void browserLaunch(String browser) {
		if(browser.equals("chrome")) {
			driver = new ChromeDriver();}
		else if(browser.equals("firefox")) {
			driver = new FirefoxDriver();}
		else if(browser.equals("Edge")) {
			driver = new EdgeDriver();}
		else {
			System.out.println("Invalid Browser");}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);}
	public static void launchurl(String Url) {
		driver.get(Url);}
	public static WebElement locateElement(String LocatorName,String Locatorvalue) {
		if (LocatorName.equals("id")) {
			findelement=driver.findElement(By.id("Locatorvalue"));}
		else if(LocatorName.equals("name")) {
			findelement=driver.findElement(By.name("Locatorvalue"));}
		else if(LocatorName.equals("classname")) {
			findelement=driver.findElement(By.className("Locatorvalue"));}
		else if(LocatorName.equals("xpath")) {
			findelement=driver.findElement(By.xpath("Locatorvalue"));}
		return findelement;}
	public void typetext(WebElement ele, String data) {
		ele.sendKeys(data);
	}
	public static void btnclick(WebElement ele) {
		ele.click();}
	public static List<WebElement>getOptions(WebElement ele){
		Select s = new Select(ele);
		List<WebElement> options = s.getOptions();
		return options;}
	public static void refresh() {
		driver.navigate().refresh();}
	public static void implicitywait(long sec) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(sec));}
	public static void quit() {
		driver.quit();}
	public static void btnclick1(WebElement ele) {
		ele.click();}
	public static void btnclick2(WebElement ele) {
		ele.click();}
	public static void btnclick3(WebElement ele) {
		ele.click();}
	public static void btnclick4(WebElement ele) {
		ele.click();} 
	
	public void datein(WebElement ele,String data) {
		ele.sendKeys(data);
	}
	public void dateout(WebElement ele,String data) {
		ele.sendKeys(data);
	}
	public static void btnclick5(WebElement ele) {
		ele.click();}
	public static void btnclick6(WebElement ele) {
		ele.click();}
	public static void btnclick7(WebElement ele) {
		ele.click();}
	public static void btnclick8(WebElement ele) {
		ele.click();}
	public static void btnclick9(WebElement ele) {
		ele.click();}
	
   public void firstname(WebElement ele,String data) {
		ele.sendKeys(data);}
   public void lastname(WebElement ele,String data) {
		ele.sendKeys(data);}
   public void address(WebElement ele,String data) {
	   ele.sendKeys(data);}
   public void creditcardnum(WebElement ele,String data) {
	   ele.sendKeys(data);}
  
	public static void btnclick10(WebElement ele) {
		ele.click();}
	public static void btnclick11(WebElement ele) {
		ele.click();}
	public static void btnclick12(WebElement ele) {
		ele.click();}
	public static void btnclick13(WebElement ele) {
		ele.click();}
	
	public static void snap(String targetlocation) throws IOException {
		TakesScreenshot ts = (TakesScreenshot)driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File target = new File(targetlocation);
		FileHandler.copy(source, target);}
	public static void date() {
		Date d = new Date();
		System.out.println(d);}
}













