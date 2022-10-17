package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import qa.factory.DriverFactory;
import util.BrowserActionsUtil;

public class AnzHomePage extends BrowserActionsUtil {


	
	private WebDriver driver;

	public AnzHomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}


	@FindBy(xpath = "//label[contains(text(),'Single')]")
	private WebElement single;
	
	@FindBy(xpath = "//select[@title='Number of dependants'")
	private WebElement noOFDependents;
	
	@FindBy(xpath = "//*[contains(text(),'Home to live in')]")
	private WebElement byHome;
	
	@FindBy(xpath = "//span[@id='q2q1i1']/following-sibling::input")
	private WebElement anualIncome;
	@FindBy(xpath = "//span[@id='q2q2i1']/following-sibling::input")
	private WebElement otherIncome;

	
	@FindBy(xpath = "//span[@id='q3q1i1']/following-sibling::input")
	private WebElement livingExpence;
	
	@FindBy(xpath = "//input[@id='credit']")
	private WebElement creditCard;
	
	@FindBy(xpath = "//span[@id='q3q3i1']/following-sibling::input")
	private WebElement otherMonthly;
	
	@FindBy(xpath = "//span[@id='q3q2i1']/following-sibling::input")
	private WebElement current;
	@FindBy(xpath = "//button[contains(text(),'Start over')]")
	private WebElement startOver;
	
	@FindBy(id = "credit")
	private WebElement credit;
	
	@FindBy(id = "borrowResultTextAmount")
	private WebElement barrowLimit;
	
	@FindBy(id = "otherloans")
	private WebElement otherLoans;
	
	@FindBy(id = "btnBorrowCalculater")
	private WebElement calculate;
	
	public void clickOnCalculate(){
		click(calculate);
	}
	
	
	
	public void enterOtherCommitments(String amnt){
		type(otherLoans,amnt);
	}
	
	
public void verifyBorrowLimit(String exp){
	String act=barrowLimit.getText();
	act=act.replace("$", "");
	act.replace(",", "");
	Assert.assertEquals(act, exp,"estimation mismatched");
}
	 public void selectAppType(String type){
		 if(type.equalsIgnoreCase("Single")){
			 click(single);
		 }
	 }
	 
	 public void selectDependecies(int num){
		 selectByVisibleText(noOFDependents, num+"");
	 }
	 
	 public void clickOnPropType(String type){
		 if(type.equalsIgnoreCase("buying a home to live in")){
			 click(byHome);
		 }

	 }
	 
	 public void otherMontlyLoanPayments(String amnt){
		 type(otherMonthly, amnt);
	 }
	 

	 public void enterAnualIncome(String amnt){
		 type(anualIncome, amnt);
	 }
	
	 public void otherCredit(String amnt){
		 type(credit, amnt);
	 }
	

	

	 public void currentHomeLoan(String amnt){
		 type(current, amnt);
	 }
	

	 public void livingExpense(String amnt){
		 type(livingExpence, amnt);
	 }
	

	 public void otherIncome(String amnt){
		 type(otherIncome, amnt);
	 }
	
}
