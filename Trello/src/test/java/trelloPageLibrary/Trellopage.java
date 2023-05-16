package trelloPageLibrary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import trelloTest.BaseClass;

public class Trellopage extends BaseClass{
	public Trellopage(WebDriver driver) {
		this.driver = driver;
		//PageFactory.initElements(driver, this);
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@id=\"user\"]")
	private WebElement Email;
	
	@FindBy(id="login")
	private WebElement continueBtn;
	
	@FindBy(xpath="//span[text()='Log in']")
	private WebElement LogInBtn;
	
	@FindBy(xpath="//span[text()=\"Create board\"]")
	private WebElement CreateBoard;

	@FindBy(xpath="//p[text()=\"Create\"]")
	private WebElement CreateBtn;
	
	@FindBy(xpath="//span[text()='Create board']")
	private WebElement CreateBoardList;
	
	
	@FindBy(xpath="//input[@type='text']")
	private WebElement CreateBoradtitle;
	
	@FindBy(xpath="//button[text()='Create']")
	private WebElement CreateBoradtitleBtn;
	
	@FindBy(xpath="//input[@class=\"list-name-input\"]")
	private WebElement ListTitle;
	
	
	@FindBy(xpath="//input[@value=\"Add list\"]")
	private WebElement AddListBtn;
	
	@FindBy(xpath="//span[@class='list-card-title js-card-name']")
	private WebElement SourceList1;
	
	@FindBy(xpath="(//span[text()='Add a card'])[2]")
	private WebElement DesList2;
	
	@FindBy(xpath="(//span[text()='Add a card'])[1]")
	private WebElement AddCardInListA;
	
	@FindBy(xpath="//textarea[@placeholder=\"Enter a title for this card…\"]")
	private WebElement ENtertitleInListA;
	
	@FindBy(xpath="//input[@value=\"Add card\"]")
	private WebElement AddCardBtninListA;	
	
	@FindBy(xpath="//div[@class=\"list-cards u-fancy-scrollbar js-list-cards js-sortable ui-sortable\"]")
	private WebElement movedcard;
	
	@FindBy(xpath="//button[@aria-label=\"Open member menu\"]")
	private WebElement AccuntMenu;	
	
	@FindBy(xpath="//span[text()=\"Log out\"]")
	private WebElement Logout;	
	
	@FindBy(xpath="//input[@name=\"password\"]")
	private WebElement Password;
	

	
	
	//span[text()="Log out"]
			
	
	public WebElement getCreateBoard() {
		return CreateBoard;
	}

	public WebElement getPassword() {
		return Password;
	}

	public WebElement getCreateBoradtitle() {
		return CreateBoradtitle;
	}

	public WebElement getCreateBoradtitleBtn() {
		return CreateBoradtitleBtn;
	}

	public WebElement getEmail() {
		return Email;
	}

	public WebElement getContinueBtn() {
		return continueBtn;
	}

	public WebElement getCreateBtn() {
		return CreateBtn;
	}

	public WebElement getListTitle() {
		return ListTitle;
	}

	public WebElement getAddListBtn() {
		return AddListBtn;
	}

	public WebElement getSourceList1() {
		return SourceList1;
	}

	public WebElement getDesList2() {
		return DesList2;
	}

	public WebElement getAddCardInListA() {
		return AddCardInListA;
	}

	public WebElement getENtertitleInListA() {
		return ENtertitleInListA;
	}

	public WebElement getAddCardBtninListA() {
		return AddCardBtninListA;
	}

	public WebElement getMovedcard() {
		return movedcard;
	}

	public WebElement getAccuntMenu() {
		return AccuntMenu;
	}

	public WebElement getLogout() {
		return Logout;
	}

	public WebElement getLogInBtn() {
		return LogInBtn;
	}

	public WebElement getCreateBoardList() {
		return CreateBoardList;
	}
    
	
	
	
}
