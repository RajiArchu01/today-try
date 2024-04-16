package org.base;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.utility.UtilityClass;

//pom
public class LocatingPage extends UtilityClass {
	public LocatingPage() {
		PageFactory.initElements(driver, this);}

	@FindBy(id="username")
	private WebElement username;

	@FindBy(id="password")
	private WebElement password;

	@FindBy(name="login")
	private WebElement login;

	@FindBy(id="location")
	private WebElement location ;

	@FindBy(id="hotels")
	private WebElement hotels ;

	@FindBy(id="room_type")
	private WebElement roomtype ;

	@FindBy(id="room_nos")
	private WebElement rooms ;

	@FindBy(id="datepick_in")
	private WebElement datein ;

	@FindBy(id="datepick_out")
	private WebElement dateout ;
	
	@FindBy(id="adult_room")
	private WebElement adultroom ;
	
	@FindBy(id="child_room")
	private WebElement childroom ;

    @FindBy(id="Submit")
    private WebElement submit;
    
    @FindBy(id="radiobutton_0")
    private WebElement clickbutton;
    
    @FindBy(id="continue")
    private WebElement Continue;
    
    @FindBy(id="first_name")
    private WebElement firstname;
    
    @FindBy(id="last_name")
    private WebElement lastname;
    
    @FindBy(id="address")
    private WebElement address;
    
    @FindBy(id="cc_num")
    private WebElement creditcardnum;
    
    @FindBy(id="cc_type")
    private WebElement creditcardtype;
    
    @FindBy(id="cc_exp_month")
    private WebElement creditcardmonth;
    
    @FindBy(id="cc_exp_year")
    private WebElement creditcardyear;
    
    @FindBy(id="cc_cvv")
    private WebElement cvv  ;
    
    @FindBy(id="book_now")
    private WebElement booking  ;
    

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLogin() {
		return login;
	}

	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotels() {
		return hotels;
	}

	public WebElement getRoomtype() {
		return roomtype;
	}

	public WebElement getRooms() {
		return rooms;
	}

	public WebElement getdatein() {
		return datein;
	}

	public WebElement getdateout() {
		return dateout;
	}

	public WebElement getadultroom() {
		return adultroom;}
	public WebElement getchildroom() {
		return childroom;}
	public WebElement getSubmit() {
		return submit;}
	public WebElement getClickbutton() {
		return clickbutton;}
	public WebElement getContinue() {
		return Continue;}
	public WebElement getDatein() {
		return datein;}
	public WebElement getDateout() {
		return dateout;}
	public WebElement getAdultroom() {
		return adultroom;}
	public WebElement getChildroom() {
		return childroom;}
	public WebElement getFirstname() {
		return firstname;}
	public WebElement getLastname() {
		return lastname;}
	public WebElement getAddress() {
		return address;}
	public WebElement getCreditcardnum() {
		return creditcardnum;}
	public WebElement getCreditcardtype() {
		return creditcardtype;}
	public WebElement getCreditcardmonth() {
		return creditcardmonth;}
	public WebElement getCreditcardyear() {
		return creditcardyear;}
	public WebElement getCvv() {
		return cvv;}
	public WebElement getBooking() {
		return booking;}
}

