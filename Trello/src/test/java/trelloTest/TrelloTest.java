package trelloTest;

import java.io.IOException;

import org.openqa.selenium.Point;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import trelloPageLibrary.Trellopage;

public class TrelloTest extends BaseClass {
	public Trellopage lp;

@Test(priority=1)
public void login() throws IOException, InterruptedException {
	 lp=new Trellopage(driver);
	lp.getEmail().sendKeys(ReadProperty.readValue("Username"));
    lp.getContinueBtn().click();
    BaseClass.explicitWait(lp.getPassword());
	lp.getPassword().sendKeys(ReadProperty.readValue("Password"));
	lp.getLogInBtn().click();
	BaseClass.explicitWait(lp.getCreateBtn());
    boolean displayed=lp.getCreateBtn().isDisplayed();
    Assert.assertTrue(displayed);
   
}
@Test(priority=2)
public void createBoard() throws IOException {
	
	lp.getCreateBtn().click();
	lp.getCreateBoardList().click();
    lp.getCreateBoradtitle().sendKeys(ReadProperty.readValue("BoardName"));
    BaseClass.explicitWait(lp.getCreateBoradtitleBtn());
    lp.getCreateBoradtitleBtn().click();
}
@Test(priority=3)
public void createList() throws IOException {
	
	lp.getListTitle().sendKeys(ReadProperty.readValue("ListTitle1"));
    lp.getAddListBtn().click();
    lp.getListTitle().sendKeys(ReadProperty.readValue("ListTitle2"));
    lp.getAddListBtn().click();
    
}
@Test(priority=4)
public void addCardInListAandDragAndDrpinListB() throws IOException {
	
    Actions act=new Actions(driver);
    lp.getAddCardInListA().click();
    lp.getENtertitleInListA().sendKeys(ReadProperty.readValue("CardTitleInListA"));
    lp.getAddCardBtninListA().click();
    BaseClass.explicitWait(lp.getSourceList1());
    BaseClass.explicitWait(lp.getDesList2());
    act.dragAndDrop(lp.getSourceList1(), lp.getDesList2()).perform();;
   int x= lp.getMovedcard().getLocation().getX();
   int y= lp.getMovedcard().getLocation().getY();
System.out.println(x +"  "+y);

}
@Test(priority=5)
public void logout() {
	
    lp.getAccuntMenu().click();
    lp.getLogout().click();

}
}
