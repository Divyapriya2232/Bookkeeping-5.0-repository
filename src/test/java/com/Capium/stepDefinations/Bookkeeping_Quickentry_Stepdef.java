package com.Capium.stepDefinations;

import java.io.IOException;

import com.Capium.Actions.Bookkeeping_Quickentry_Actions;
import com.Capium.Utilites.StepTracker;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Bookkeeping_Quickentry_Stepdef {

	Bookkeeping_Quickentry_Actions  QuickentryActions=new Bookkeeping_Quickentry_Actions();
	
	@Given("Click on quick entry and validate")
	public void click_on_quick_entry_and_validate() throws InterruptedException {
		QuickentryActions.verifyQuickentrytab();
		StepTracker.setCurrentStep("Click on quick entry and validate");
	}
	@And("Click on add quick entry and validate")
	public void click_on_add_quick_entry_and_validate() {
		QuickentryActions.addquickentryandvalidate();
		StepTracker.setCurrentStep("Click on add quick entry and validate");  
	}
	@When("Enter mandatory fields and save and exit in quick entry")
	public void enter_mandatory_fields_and_save_and_exit_in_quick_entry() throws InterruptedException {
	    QuickentryActions.Entermandatoryfieldsinquickentry();
		StepTracker.setCurrentStep("Enter mandatory fields and save and exit in quick entry");
	}
	@When("Enter non mandatory fields and save and new in quick entry")
	public void enter_non_mandatory_fields_and_save_and_new_in_quick_entry() throws InterruptedException, IOException {
	    QuickentryActions.Enternonmandatoryfieldsinquickentry();
		StepTracker.setCurrentStep("Enter non mandatory fields and save and new in quick entry");
	}
	@Then("Click on clear form in quick entry")
	public void click_on_clear_form_in_quick_entry() throws InterruptedException{
	    QuickentryActions.clickonclearforminquickentry();
		StepTracker.setCurrentStep("Click on clear form in quick entry");
	}
	@Then("Click on add new line in quick entry")
	public void click_on_add_new_line_in_quick_entry() throws InterruptedException {
	    QuickentryActions.addnewlineinquickentry();
		StepTracker.setCurrentStep("Click on add new line in quick entry");
	}
	@Then("Click on search in add new quick entry")
	public void click_on_search_in_add_new_quick_entry() throws InterruptedException {
	    QuickentryActions.searchinaddnewquickentry();
		StepTracker.setCurrentStep("Click on search in add new quick entry");
	}
	@Then("Click on add button in add new quick entry")
	public void click_on_add_button_in_add_new_quick_entry() throws InterruptedException {
	    QuickentryActions.addbuttoninaddnewquickentry();
		StepTracker.setCurrentStep("Click on add button in add new quick entry");
	}
	@Then("Click on checkbox and validate in add new quick entry")
	public void click_on_checkbox_and_validate_in_add_new_quick_entry() throws InterruptedException {
	    QuickentryActions.checkboxinaddnewquickentryandverifyoptionsareenabling();
		StepTracker.setCurrentStep("Click on checkbox and validate in add new quick entry");
	}
	@Then("Click on cancel selections in add new quick entry")
	public void click_on_cancel_selections_in_add_new_quick_entry() throws InterruptedException {
	    QuickentryActions.cancelselectionsinaddnewquickentry();
		StepTracker.setCurrentStep("Click on cancel selections in add new quick entry");
	}
	@When("Click on delete yes button in add new quick entry")
	public void click_on_delete_yes_button_in_add_new_quick_entry() throws InterruptedException {
	    QuickentryActions.Deleteyesbuttoninaddnewquickentry();
		StepTracker.setCurrentStep("Click on delete yes button in add new quick entry");
	}
	@Then("Click on delete no button in add new quick entry")
	public void click_on_delete_no_button_in_add_new_quick_entry() throws InterruptedException {
	    QuickentryActions.Deletenobuttoninaddnewquickentry();
		StepTracker.setCurrentStep("Click on delete no button in add new quick entry");
	}
	@Then("Click on copy button in add new quick entry")
	public void click_on_copy_button_in_add_new_quick_entry() throws InterruptedException {
	    QuickentryActions.Copybuttoninaddnewquickentry();
		StepTracker.setCurrentStep("Click on copy button in add new quick entry");
	}
	@When("Click on export in add new quick entry")
	public void click_on_export_in_add_new_quick_entry() throws InterruptedException {
	    QuickentryActions.exportinaddnewquickentry();
		StepTracker.setCurrentStep("Click on export in add new quick entry");
	}
	@When("Click on inactive yes button in add new quick entry")
	public void click_on_inactive_yes_button_in_add_new_quick_entry() throws InterruptedException {
	    QuickentryActions.Inactiveyesbuttoninaddnewquickentry();
	    StepTracker.setCurrentStep("Click on inactive yes button in add new quick entry");
	}
	@Then("Click on inactive no button in add new quick entry")
	public void click_on_inactive_no_button_in_add_new_quick_entry() throws InterruptedException {
	    QuickentryActions.Inactivenobuttoninaddnewquickentry();
		StepTracker.setCurrentStep("Click on inactive no button in add new quick entry");
	}
	@When("Click on active yes button in add new quick entry")
	public void click_on_active_yes_button_in_add_new_quick_entry() throws InterruptedException {
	    QuickentryActions.Activeyesbuttoninaddnewquickentry();
	    StepTracker.setCurrentStep("Click on active yes button in add new quick entry");
	}

	@Then("Click on active no button in add new quick entry")
	public void click_on_active_no_button_in_add_new_quick_entry() throws InterruptedException {
	    QuickentryActions.Activenobuttoninaddnewquickentry();
		StepTracker.setCurrentStep("Click on active no button in add new quick entry");
	}
	@Then ("Click on close yes button in add new quick entry")
	public void click_on_close_yes_button_in_add_new_quick_entry() throws InterruptedException {
	    QuickentryActions.Closeyesbuttoninaddnewquickentry();
		StepTracker.setCurrentStep("Click on close yes button in add new quick entry");
	}
	@When ("Click on close no button in add new quick entry")
	public void click_on_close_no_button_in_add_new_quick_entry() throws InterruptedException {
	    QuickentryActions.Closenobuttoninaddnewquickentry();
		StepTracker.setCurrentStep("Click on close no button in add new quick entry");
	}
	@Then("Click on search in add quick entry")
	public void click_on_search_in_add_quick_entry() throws InterruptedException {
		QuickentryActions.searchinaddquickentry();
		StepTracker.setCurrentStep("Click on search in add quick entry");
	}
	@And ("Click on checkboxes in add quick entry")
	public void click_on_checkboxes_in_add_quick_entry() throws InterruptedException {
		QuickentryActions.checkboxesinaddquickentry();
		StepTracker.setCurrentStep("Click on checkboxes in add quick entry");
	}
	@When("Click on actions in add quick entry")
	public void click_on_actions_in_add_quick_entry() throws InterruptedException {
	    QuickentryActions.actionsinaddquickentry();
		StepTracker.setCurrentStep("Click on actions in add quick entry");
	}
	@Then("Click on export in add quick entry actions")
	public void click_on_export_in_add_quick_entry_actions() throws InterruptedException {
		 QuickentryActions.exportinaddquickentryactions();
		StepTracker.setCurrentStep("Click on export in add quick entry actions");
	}
	@Then("Click on mousehover view in add quick entry")
	public void click_on_mousehover_view_in_add_quick_entry() throws InterruptedException{
	   QuickentryActions.mousehoverviewinaddquickentry();
		StepTracker.setCurrentStep("Click on mousehover view in add quick entry");
	}
	@When ("Click on mousehover export in add quick entry")
	public void Click_on_mousehover_export_in_add_quick_entry() throws InterruptedException {
		QuickentryActions.mousehoverexportinaddquickentry();
		StepTracker.setCurrentStep("Click on mousehover export in add quick entry");
	}
	@When ("Click on mousehover edit in add quick entry")
	public void Click_on_mousehover_edit_in_add_quick_entry() {
		QuickentryActions.mousehovereditinaddquickentry();
		StepTracker.setCurrentStep("Click on mousehover edit in add quick entry");
	}
	@When ("Click on mousehover delete yes button in add quick entry")
	public void Click_on_mousehover_delete_yes_button_in_add_quick_entry() {
		QuickentryActions.mousehoverdeleteyesbuttoninaddquickentry();
		StepTracker.setCurrentStep("Click on mousehover delete yes button in add quick entry");
	}
	@Then ("Click on mousehover delete no button in add quick entry")
	public void Click_on_mousehover_delete_no_button_in_add_quick_entry() throws InterruptedException {
		QuickentryActions.mousehoverdeletenobuttoninaddquickentry();
		StepTracker.setCurrentStep("Click on mousehover delete no button in add quick entry");
	}
	@Then("Click on checkbox and validate in add quick entry")
	public void click_on_checkbox_and_validate_in_add_quick_entry() throws InterruptedException {
		QuickentryActions.checkboxinaddquickentryandverifyoptionsareenabling();
		StepTracker.setCurrentStep("Click on checkbox and validate in add quick entry");
	}
	@Then("Click on cancel selections in add quick entry")
	public void click_on_cancel_selections_in_add_quick_entry() throws InterruptedException {
		QuickentryActions.cancelselectionsinaddquickentry();
		StepTracker.setCurrentStep("Click on cancel selections in add quick entry");
	}
	@When("Click on delete yes button in add quick entry")
	public void click_on_delete_yes_button_in_add_quick_entry() throws InterruptedException {
		QuickentryActions.Deleteyesbuttoninaddquickentry();
		StepTracker.setCurrentStep("Click on delete yes button in add quick entry");
	}
	@Then("Click on delete no button in add quick entry")
	public void click_on_delete_no_button_in_add_quick_entry() throws InterruptedException {
		QuickentryActions.Deletenobuttoninaddquickentry();
		StepTracker.setCurrentStep("Click on delete no button in add quick entry");
	}
	@When("Click on copy button in add quick entry")
	public void click_on_copy_button_in_add_quick_entry() throws InterruptedException {
		QuickentryActions.Copybuttoninaddquickentry();
		StepTracker.setCurrentStep("Click on copy button in add quick entry");
	}
	@When("Click on selected item export in add quick entry")
	public void click_on_selected_item_export_in_add_quick_entry() {
		QuickentryActions.selecteditemexportinaddquickentry();
		StepTracker.setCurrentStep("Click on selected item export in add quick entry");
	}
	@When("Click on inactive yes button in add quick entry")
	public void click_on_inactive_yes_button_in_add_quick_entry() throws InterruptedException {
	    QuickentryActions.Inactiveyesbuttoninaddquickentry();
	    StepTracker.setCurrentStep("Click on inactive yes button in add quick entry");
	}
	@Then("Click on inactive no button in add quick entry")
	public void click_on_inactive_no_button_in_add_quick_entry() throws InterruptedException {
	    QuickentryActions.Inactivenobuttoninaddquickentry();
		StepTracker.setCurrentStep("Click on inactive no button in add quick entry");
	}
	@Then("Click on active yes button in add quick entry")
	public void click_on_active_yes_button_in_add_quick_entry() throws InterruptedException {
	    QuickentryActions.Activeyesbuttoninaddquickentry();
	    StepTracker.setCurrentStep("Click on active yes button in add quick entry");
	}
	@Then("Click on active no button in add quick entry")
	public void click_on_active_no_button_in_add_quick_entry() throws InterruptedException {
	    QuickentryActions.Activenobuttoninaddquickentry();
		StepTracker.setCurrentStep("Click on active no button in add quick entry");
	}
	@When("Click on pagination in add quick entry")
	public void click_on_pagination_in_add_quick_entry() throws Exception {
	    QuickentryActions.ClickonPagiantionDropdownandValidateinquickentry();
		StepTracker.setCurrentStep("Click on pagination in add quick entry");
	}
	@When("Click on next in add quick entry")
	public void click_on_next_in_add_quick_entry() throws Exception {
	    QuickentryActions.nextbuttoninaddquickentry();
		StepTracker.setCurrentStep("Click on next in add quick entry");
	}
	@When("Click on previous in add quick entry")
	public void click_on_previous_in_add_quick_entry() throws Exception {
	    QuickentryActions.previousbuttoninaddquickentry();
		StepTracker.setCurrentStep("Click on previous in add quick entry");
	}
}
