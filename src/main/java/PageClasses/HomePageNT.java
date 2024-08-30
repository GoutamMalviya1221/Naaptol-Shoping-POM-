package PageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageNT {

	WebDriver driver;
	
	//Create a constructor 
	public HomePageNT(WebDriver driver){
		
		this.driver = driver;
		
		PageFactory.initElements(driver , this);
	
	}

	@FindBy(xpath = "//*[@class='cate_head']")
	private WebElement shopingCategories;
	
	@FindBy(linkText = "Kids & Toys")
	private WebElement KidToys;

	public WebElement getKidToys() {
		return KidToys;
	}

	public WebElement getShopingCategories() {
		return shopingCategories;
	}

	
	
}
