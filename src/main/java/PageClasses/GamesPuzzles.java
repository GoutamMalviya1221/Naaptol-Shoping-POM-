package PageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GamesPuzzles {
	
WebDriver driver;
	
	//Create a constructor 
	public  GamesPuzzles(WebDriver driver){
		
		this.driver = driver;
		
		PageFactory.initElements(driver , this);
	}


	@FindBy(linkText = "Games and puzzles")
	private WebElement GamesPuzzles;
	
	@FindBy(linkText = "Table & Board Games")
	private WebElement TableBoardGames;
	
	@FindBy(id = "iscod")
	private WebElement gpCheckBox;
	
	@FindBy(id = "brandFilterBox8313")
	private WebElement gpBranded;
	
	@FindBy(id = "priceFilterBox1")
	private WebElement gpPrice;
	
	@FindBy(id = "discountFilterBox1")
	private WebElement gpDiscount;
	
	@FindBy(xpath = "//*[@class='square']")
	private WebElement gpLasergun;

	public WebElement getGpLasergun() {
		return gpLasergun;
	}

	public WebElement getGamesPuzzles() {
		return GamesPuzzles;
	}

	public WebElement getTableBoardGames() {
		return TableBoardGames;
	}

	public WebElement getGpCheckBox() {
		return gpCheckBox;
	}

	public WebElement getGpBranded() {
		return gpBranded;
	}

	public WebElement getGpPrice() {
		return gpPrice;
	}

	public WebElement getGpDiscount() {
		return gpDiscount;
	}

}
