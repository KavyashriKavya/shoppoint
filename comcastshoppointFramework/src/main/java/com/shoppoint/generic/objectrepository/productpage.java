package com.shoppoint.generic.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class productpage {
	
	public productpage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText = " ADD TO CART")
	private WebElement addtocartlink;
	
	@FindBy(linkText = "//i[@class='fa fa-heart']")
	private WebElement wishlistlink;

	public WebElement getAddtocartlink() {
		return addtocartlink;
	}

	public WebElement getWishlistlink() {
		return wishlistlink;
	}
	
	

}
