package PageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OutdoorPlay {
WebDriver driver;
	
	//Create a constructor 
	public OutdoorPlay(WebDriver driver){
		
		this.driver = driver;
		
		PageFactory.initElements(driver , this);
	}
	
	@FindBy(linkText = "Outdoor Play")
	private WebElement outdoorPlay;
	
	@FindBy(id = "isexoutStock")
	private WebElement uncheckBox;
	
	@FindBy(id = "iscod")
	private WebElement checkBox;
	
	@FindBy(id = "brandFilterBox8313")
	private WebElement BrandedCheckBox;
	
	@FindBy(id = "priceFilterBox1")
	private WebElement PriceCheckBox;
	
	@FindBy(id = "discountFilterBox2")
	private WebElement DiscountCheckBox;
	
	@FindBy(linkText = "Kids & Toys")
	private WebElement KidToys;
	
	@FindBy(xpath = "(//*[@class='square'])[1]")
	private WebElement DolpinBubble;
	
	
	

	public WebElement getDolpinBubble() {
		return DolpinBubble;
	}

	public WebElement getKidToys() {
		return KidToys;
	}

	public WebElement getOutdoorPlay() {
		return outdoorPlay;
	}

	public WebElement getUncheckBox() {
		return uncheckBox;
	}

	public WebElement getCheckBox() {
		return checkBox;
	}

	public WebElement getBrandedCheckBox() {
		return BrandedCheckBox;
	}

	public WebElement getPriceCheckBox() {
		return PriceCheckBox;
	}

	public WebElement getDiscountCheckBox() {
		return DiscountCheckBox;
	}

	public WebElement getOutdoorPlayElement() {
		return outdoorPlay;
	}

}
