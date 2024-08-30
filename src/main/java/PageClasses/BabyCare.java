package PageClasses;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BabyCare {
WebDriver driver;
	
	//Create a constructor 
	public  BabyCare(WebDriver driver){
		
		this.driver = driver;
		
		PageFactory.initElements(driver , this);
	}
	
	@FindBy(linkText = "Baby Care & Maternity")
	private WebElement bcBabyCar;
	
	@FindBy(linkText = "Kids Footwear")
	private WebElement bcKidsfootware;
	
	@FindBy(id = "isexoutStock")
	private WebElement bcOutOfStock;
	
	@FindBy(id = "brandFilterBox38776")
	private WebElement bcBrandCheck;
	
	@FindBy(id = "priceFilterBox1")
	private WebElement bcPrice;
	
	@FindBy(xpath = "//*[@class='square']")
	private WebElement bcRainSandals;
	
	//------------------------------------------------------//
	
	@FindBy(linkText = "Kids Wear")
	private WebElement bcKidsWear;
	
	@FindBy(id = "isfreeship")
	private WebElement bcFreeShiping;
	
	@FindBy(id = "brandFilterBox38398")
	private WebElement bcAmerican;

	@FindBy(id = "priceFilterBox1")
	private WebElement bc2201_3800;
	
	@FindBy(xpath = "//*[@class='square']")
	private WebElement bcCargoJeans;
	
	//-----------------------------------------------------------//
	
	@FindBy(linkText = "Baby Bedding")
	private WebElement bcBabyBedding;
	
	@FindBy(id = "iscod")
	private WebElement bcBBCashonDelivery;
	
	@FindBy(id = "brandFilterBox38548")
	private WebElement bcBBLuxuryQueen;;

	@FindBy(id = "priceFilterBox1")
	private WebElement bcBB499_499;

	@FindBy(id = "discountFilterBox1")
	private WebElement bcBBDiscount;

	@FindBy(xpath = "//*[@class='square']")
	private WebElement bcBBBayMosquito;

	//-------------------------------------------------------------------//
	
	@FindBy(linkText = "Body Care")
	private WebElement bcBodyCare;
	
	@FindBy(id = "isfreeship")
	private WebElement bcBodycareShipping;

	@FindBy(id = "brandFilterBox8313")
	private WebElement bcBodyCareranded;

	@FindBy(id = "priceFilterBox1")
	private WebElement bcBodyCare299_299;

	@FindBy(id = "discountFilterBox1")
	private WebElement bcBodyCareDiscount;
	
	@FindBy(xpath = "//*[@class='square']")
	private WebElement bcBabyCareQuickBrush;


	
	public WebElement getBcBodyCare() {
		return bcBodyCare;
	}

	public WebElement getBcBodycareShipping() {
		return bcBodycareShipping;
	}

	public WebElement getBcBodyCareranded() {
		return bcBodyCareranded;
	}

	public WebElement getBcBodyCare299_299() {
		return bcBodyCare299_299;
	}

	public WebElement getBcBodyCareDiscount() {
		return bcBodyCareDiscount;
	}

	public WebElement getBcBabyCareQuickBrush() {
		return bcBabyCareQuickBrush;
	}

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getBcBabyBedding() {
		return bcBabyBedding;
	}

	public WebElement getBcBBCashonDelivery() {
		return bcBBCashonDelivery;
	}

	public WebElement getBcBBLuxuryQueen() {
		return bcBBLuxuryQueen;
	}

	public WebElement getBcBB499_499() {
		return bcBB499_499;
	}

	public WebElement getBcBBDiscount() {
		return bcBBDiscount;
	}

	public WebElement getBcBBBayMosquito() {
		return bcBBBayMosquito;
	}

	public WebElement getBcKidsWear() {
		return bcKidsWear;
	}

	public WebElement getBcFreeShiping() {
		return bcFreeShiping;
	}

	public WebElement getBcAmerican() {
		return bcAmerican;
	}

	public WebElement getBc2201_3800() {
		return bc2201_3800;
	}

	public WebElement getBcCargoJeans() {
		return bcCargoJeans;
	}

	public WebElement getBcBabyCar() {
		return bcBabyCar;
	}

	public WebElement getBcKidsfootware() {
		return bcKidsfootware;
	}

	public WebElement getBcOutOfStock() {
		return bcOutOfStock;
	}

	public WebElement getBcBrandCheck() {
		return bcBrandCheck;
	}

	public WebElement getBcPrice() {
		return bcPrice;
	}

	public WebElement getBcRainSandals() {
		return bcRainSandals;
	}

}
