package org.adactin;
import java.io.IOException;

import org.base.LocatingPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.utility.UtilityClass;

public class AdactinHotel extends UtilityClass {
	//Testing Annotations

	@BeforeClass
	private void beforeclass() {
		browserLaunch("chrome");}
	@AfterClass
	private void afterclass() throws IOException {
		snap("C:\\Users\\karthickrajan\\OneDrive\\Desktop\\Archuma studykit\\adactinhotel.png");
		quit();
	}
	@BeforeMethod
	private void beforemethod() {
		date();}
	@AfterMethod
	private void aftermethod() {
		date();}
	@Test
	private void test1() throws InterruptedException {
		launchurl("https://adactinhotelapp.com/");
		LocatingPage lp =new LocatingPage();

		WebElement username = lp.getUsername();
		typetext(username,"rajiarchu01");

		WebElement password = lp.getPassword();
		typetext(password,"Archuma01@");

		WebElement login = lp.getLogin();
		btnclick(login);

		WebElement location = lp.getLocation();
		btnclick1(location);
		Select s =new Select(location);
		s.selectByIndex(3);

		WebElement hotels = lp.getHotels();
		btnclick2(hotels);
		Select s1 =new Select(hotels);
		s1.selectByIndex(2);

		WebElement roomtype = lp.getRoomtype();
		btnclick3(roomtype);
		Select s2 =new Select(roomtype);
		s2.selectByIndex(2);

		WebElement rooms = lp.getRooms();
		btnclick4(rooms);
		Select s3 =new Select(rooms);
		s3.selectByIndex(2);
 Thread.sleep(3000);
		WebElement datein = lp.getdatein();
		lp.typetext(datein, "15/08/2023");

		WebElement dateout = lp.getdateout();
		lp.typetext(dateout, "17/08/2023");
		
		WebElement adultroom = lp.getadultroom();
		btnclick5(adultroom);
		Select s4 =new Select(adultroom);
		s4.selectByIndex(2);

		WebElement childroom = lp.getchildroom();
		btnclick6(childroom);
		Select s5 =new Select(childroom);
		s5.selectByIndex(2);

		WebElement submit = lp.getSubmit();
		btnclick7(submit);
 
		WebElement clickbutton = lp.getClickbutton();
		btnclick8(clickbutton);
 
		WebElement Continue = lp.getContinue();
		btnclick9(Continue);
		
		WebElement firstname = lp.getFirstname();
		typetext(firstname,"Raajalakshmi");

		WebElement lastname = lp.getLastname();
		typetext(lastname,"Balasubramanian");

		WebElement address = lp.getAddress();
		typetext(address,"chennai");

		WebElement creditcardnum = lp.getCreditcardmonth();
		typetext(creditcardnum,"8947589623589");

		WebElement Creditcardtype = lp.getCreditcardtype();
		btnclick10(Creditcardtype);
		
		WebElement Creditcardyear = lp.getCreditcardyear();
		btnclick11(Creditcardyear);
		
		WebElement cvv = lp.getCvv();
		btnclick12(cvv);
		
		WebElement booking = lp.getBooking();
		btnclick13(booking);        
	}
}
