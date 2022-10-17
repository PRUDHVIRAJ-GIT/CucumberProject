package steps;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.AnzHomePage;
import qa.factory.DriverFactory;


@SuppressWarnings("unused")
public class Assignment1 {
	

	private WebDriver driver;
	private AnzHomePage anz = null;

@When("user open url as {string}")
public void user_open_url_as(String url) {
	
	anz=new AnzHomePage(DriverFactory.getDriver());
	DriverFactory driverFactory = new DriverFactory();
	driver = driverFactory.init_driver("chrome");
    driver.get(url);   
}

@When("user clicks on calculate")
public void clickOnCalculate() {
	anz.clickOnCalculate();
}


	
@When("user clicks on Application type as {string}")
public void user_clicks_on_application_type_as(String type) {
   anz.selectAppType(type);
}

@When("user enters ammount for annual income as\"{int}\"")
public void user_enters_ammount_for_annual_income_as(int amnt) {
   anz.enterAnualIncome(amnt+"");
}


@When("user enters ammount for other income as {string}")
public void user_enters_ammount_for_other_income_as(String amnt) {
   anz.otherIncome(amnt);
}


@When("user enters ammount for other loan payments as {string}")
public void user_enters_ammount_for_other_loan_payments_as(String amnt) {
	anz.otherMontlyLoanPayments(amnt);
    // Write code here that turns the phrase above into concrete actions
//    throw new io.cucumber.java.PendingException();
}


@When("user enters ammount for other commitments as {string}")
public void user_enters_ammount_for_other_commitments_as(String amnt) {
	anz.enterOtherCommitments(amnt);
	
}


@When("user enters ammount for living expence as {string}")
public void user_enters_ammount_for_living_expence_as(String amnt) {
   anz.livingExpense(amnt);
}


@When("user enters ammount for home loan payments as {string}")
public void user_enters_ammount_for_home_loan_payments_as(String amnt) {
 anz.currentHomeLoan(amnt);  
}


@When("user enters ammount for card limit as {string}")
public void user_enters_ammount_for_card_limit_as(String amnt) {
   anz.otherCredit(amnt);
}


@Then("estimation should be {string}")
public void estimation_should_be(String amnt) {
   anz.verifyBorrowLimit(amnt);
}





}
