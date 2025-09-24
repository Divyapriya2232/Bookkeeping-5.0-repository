package com.Capium.stepDefinations;

import java.io.IOException;

import com.Capium.Actions.Bookkeeping_MTD_Actions;
import com.Capium.Utilites.StepTracker;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Bookkeeping_MTD_Stepdef {
	
	Bookkeeping_MTD_Actions MTDActions =new Bookkeeping_MTD_Actions();
	
	@Given("Click on MTD and validate")
    public void click_on_MTD_and_validate() throws InterruptedException{
         MTDActions.validatemtdtab();
		  StepTracker.setCurrentStep("Click on MTD and validate");
    }
	@And("Click on submit vat and validate")
	public void click_on_submit_vat_and_validate() throws InterruptedException {
        MTDActions.validatesubmitvattab();
		  StepTracker.setCurrentStep("Click on submit vat and validate");
    }
	@When("Click on vat period and submit in submit vat")
	public void click_on_vat_period_and_submit_in_submit_vat() throws IOException  {
        MTDActions.validatevatperiodinsubmitvat();
		  StepTracker.setCurrentStep("Click on vat period and submit in submit vat");
    }
	@When("Click on mousehover actions in submit vat")
	public void click_on_mousehover_actions_in_submit_vat() throws IOException, InterruptedException  {
        MTDActions.mousehoveractionsinsubmitvat();
		  StepTracker.setCurrentStep("Click on mousehover actions in submit vat");
    }
	@When("Click on pagination in submit vat")
	public void click_on_pagination_in_submit_vat() throws InterruptedException {
	    MTDActions.paginationinsubmitvat();
	      StepTracker.setCurrentStep("Click on pagination in submit vat");
    }
	@Then("Click on next button in submit vat")
	public void click_on_next_button_in_submit_vat() {
		MTDActions.nextbuttoninsubmitvat();
	      StepTracker.setCurrentStep("Click on next button in submit vat");
	}
	@Then("Click on previous button in submit vat")
	public void click_on_previous_button_in_submit_vat() throws InterruptedException {
		MTDActions.previousbuttoninsubmitavt();
	      StepTracker.setCurrentStep("Click on previous button in submit vat");
	}
	@And("Click on bridging vat and validate")
	public void click_on_bridging_vat_and_validate(){
        MTDActions.validatebridgingvat();
		  StepTracker.setCurrentStep("Click on bridging vat and validate");
    }
	@When("Click on vat period and submit in bridging vat")
	public void click_on_vat_period_and_submit_in_bridging_vat() throws InterruptedException {
	    MTDActions.paginationinsubmitvat();
	      StepTracker.setCurrentStep("Click on vat period and submit in bridging vat");
    }
	@When("Click on mousehover actions in bridging vat")
	public void click_on_mousehover_actions_in_bridging_vat() throws InterruptedException, IOException{
        MTDActions.mousehoveractionsinbridgingvat();
		  StepTracker.setCurrentStep("Click on mousehover actions in bridging vat");
    }
	@And("Click on view vat details tab and validate")
	public void click_on_view_vat_details_tab_and_validate() throws InterruptedException, IOException{
        MTDActions.validateviewvatdetails();
		  StepTracker.setCurrentStep("Click on view vat details tab and validate");
    }
	@And("Click on vat transactions detail tab and validate")
	public void click_on_vat_transactions_detail_tab_and_validate() throws IOException{
        MTDActions.validatevattransactionsdetailtab();
		  StepTracker.setCurrentStep("Click on vat transactions detail tab and validate");
    }
	@And("Click on vat transactions detail actions")
	public void click_on_vat_transactions_detail_actions() throws IOException{
        MTDActions.vattransactionsdetailinactions();
		  StepTracker.setCurrentStep("Click on vat transactions detail tab and validate");
    }
	@When("Click on pagination in vat transactions detail")
	public void click_on_pagination_in_vat_transactions_detail() throws InterruptedException {
	    MTDActions.paginationinvattransactionsdetail();
	      StepTracker.setCurrentStep("Click on pagination in vat transactions detail");
    }
	@Then("Click on next button in vat transactions detail")
	public void click_on_next_button_in_vat_transactions_detail() {
		MTDActions.nextbuttoninvattransactionsdetail();
	      StepTracker.setCurrentStep("Click on next button in vat transactions detail");
	}
	@Then("Click on previous button in vat transactions detail")
	public void click_on_previous_button_in_vat_transactions_detail() throws InterruptedException {
		MTDActions.previousbuttoninvattransactionsdetail();
	      StepTracker.setCurrentStep("Click on previous button in vat transactions detail");
	}
	@And("Click on vat settings tab and validate")
	public void click_on_vat_settings_tab_and_validate() throws InterruptedException {
		MTDActions.validatevatsettingstab();
	      StepTracker.setCurrentStep("Click on vat settings tab and validate");
	}
	@And("Enter non mandatory fields in vat settings")
	public void enter_non_mandatory_fields_in_vat_settings() throws InterruptedException, IOException {
		MTDActions.nonmandatoryfieldsinvatsettings();
	      StepTracker.setCurrentStep("Enter non mandatory fields in vat settings");
	}
	@And("Click on discount period checkbox and validate")
	public void click_on_discount_period_checkbox_and_validate(){
		MTDActions.discountperiodcheckbox();
	      StepTracker.setCurrentStep("Click on discount period checkbox and validate");
	}
	@And("Click on vat codes and validate")
	public void click_on_vat_codes_and_validate(){
		MTDActions.validatevatcodes();
	      StepTracker.setCurrentStep("Click on vat codes and validate");
	}
	@And("Click on actions in vat codes")
	public void click_on_actions_in_vat_codes(){
		MTDActions.vatcodesactions();
	      StepTracker.setCurrentStep("Click on actions in vat codes");
	}
	@And("Click on actions in vat codes selected actions")
	public void click_on_actions_in_vat_codes_selected_actions(){
		MTDActions.selectedactionsinvatcodes();
	      StepTracker.setCurrentStep("Click on actions in vat codes selected actions");
	}
	@And("Click on pagination in vat codes")
	public void click_on_pagination_in_vat_codes() throws InterruptedException{
		MTDActions.paginationinvatcodes();
	      StepTracker.setCurrentStep("Click on pagination in vat codes");
	}
	@And("Click on next button in vat codes")
	public void click_on_next_button_in_vat_codes(){
		MTDActions.nextbuttoninvatcodes();
	      StepTracker.setCurrentStep("Click on next button in vat codes");
	}
	@And("Click on previous button in vat codes")
	public void click_on_previous_button_in_vat_codes() throws InterruptedException{
		MTDActions.previousbuttoninvatcodes();
	      StepTracker.setCurrentStep("Click on previous button in vat codes");
	}

}
