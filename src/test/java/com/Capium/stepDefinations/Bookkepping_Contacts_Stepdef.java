package com.Capium.stepDefinations;

import java.io.IOException;

import com.Capium.Actions.Bookkeeping_Contacts_Actions;
import com.Capium.Actions.Bookkeeping_Quickentry_Actions;
import com.Capium.Utilites.StepTracker;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Bookkepping_Contacts_Stepdef {
	
	Bookkeeping_Contacts_Actions  ContactsActions=new Bookkeeping_Contacts_Actions();

	@Given("Click on customers in contacts")
	public void click_on_customers_in_contacts() throws InterruptedException {
		ContactsActions.customerstabincontacts();
		StepTracker.setCurrentStep("Click on customers in contacts");
	}
	@Then("Click on add new customer and validate")
	public void click_on_add_new_customer_and_validate() {
		ContactsActions.validateaddnewcustomers();
		StepTracker.setCurrentStep("Click on add new customer and validate");
	}
	@Then("Enter mandatory fields in customers")
	public void enter_mandatory_fields_in_customers() {
		ContactsActions.entermandatoryfieldsincustomers();
		StepTracker.setCurrentStep("Enter mandatory fields in customers");
	}
	@Then("Enter nonmandatory fields in customers")
	public void enter_nonmandatory_fields_in_customers() throws IOException {
		ContactsActions.enternonmandatoryfieldsincustomers();
		StepTracker.setCurrentStep("Enter nonmandatory fields in customers");
	}
	@Then("Click on clearform in customers")
	public void click_on_clearform_in_customers() {
		ContactsActions.clearformincustomers();
		StepTracker.setCurrentStep("Click on clearform in customers");
	}
	@Then("Click on search in add new customer")
	public void click_on_search_in_add_new_customer() {
		ContactsActions.searchinaddnewcustomer();
		StepTracker.setCurrentStep("Click on search in add new customer");
	}
	@Then("Click on add button in add new customer")
	public void click_on_add_button_in_add_new_customer() {
		ContactsActions.addbuttoninaddnewcustomer();
		StepTracker.setCurrentStep("Click on add button in add new customer");
	}
	@Then("Click on checkbox and validate options in add new customer")
	public void click_on_checkbox_and_validate_options_in_add_new_customer() throws InterruptedException {
		ContactsActions.checkboxandvalidateoptionsinaddnewcustomer();
		StepTracker.setCurrentStep("Click on checkbox and validate options in add new customer");
	}
	@Then("Click on cancel selections in add new customer")
	public void click_on_cancel_selections_in_add_new_customer() {
		ContactsActions.cancelselectionsinaddnewcustomer();
		StepTracker.setCurrentStep("Click on cancel selections in add new customer");
	}
	@When("Click on delete button in add new customer")
	public void click_on_delete_yes_button_in_add_new_customer() {
		ContactsActions.deletebuttoninaddnewcustomer();
		StepTracker.setCurrentStep("Click on delete button in add new customer");
	}
	@Then("Click on copy button in add new customer")
	public void click_on_copy_button_in_add_new_customer() {
		ContactsActions.copybuttoninaddnewcustomer();
		StepTracker.setCurrentStep("Click on copy button in add new customer");
	}
	@When("Click on export in add new customer")
	public void click_on_export_in_add_new_customer() throws InterruptedException {
		ContactsActions.exportinaddnewcustomer();
		StepTracker.setCurrentStep("Click on export in add new customer");
	}
	@When("Click on inactive button in add new customer")
	public void click_on_inactive_button_in_add_new_customer() {
		ContactsActions.inactivebuttoninaddnewcustomer();
		StepTracker.setCurrentStep("Click on inactive button in add new customer");
	}
	@When("Click on active button in add new customer")
	public void click_on_active_button_in_add_new_customer() {
		ContactsActions.activebuttoninaddnewcustomer();
		StepTracker.setCurrentStep("Click on active button in add new customer");
	}
	@Then("Click on close button in add new customer")
	public void click_on_close_button_in_add_new_customer() {
		ContactsActions.closebuttoninaddnewcustomer();
		StepTracker.setCurrentStep("Click on close button in add new customer");
	}
	@Then("Click on search in add customer")
	public void click_on_search_in_add_customer() throws InterruptedException {
		ContactsActions.searchinaddcustomer();
		StepTracker.setCurrentStep("Click on search in add customer");
	}
	@Then("Click on actions in add customer")
	public void click_on_actions_in_add_customer() throws InterruptedException {
		ContactsActions.actionsinaddcustomer();
		StepTracker.setCurrentStep("Click on actions in add customer");
	}
	@Then("Click on mousehover edit in add customer")
	public void click_on_mousehover_edit_in_add_customer() {
		ContactsActions.mousehovereditinaddcustomer();
		StepTracker.setCurrentStep("Click on mousehover edit in add customer");
	}
	@When("Click on mousehover delete button in add customer")
	public void click_on_mousehover_delete_button_in_add_customer() {
		ContactsActions.mousehoverdeletebuttoninaddcustomer();
		StepTracker.setCurrentStep("Click on mousehover delete button in add customer");
	}
	@Then("Click on checkbox and validate options in add customer")
	public void click_on_checkbox_and_validate_options_in_add_customer() throws InterruptedException {
		ContactsActions.checkboxinaddcustomer();
		StepTracker.setCurrentStep("Click on checkbox and validate options in add customer");
	}
	@When("Click on cancel selection button in add customer")
	public void click_on_cancel_selection_button_in_add_customer() {
		ContactsActions.cancelselectioninaddcustomer();
		StepTracker.setCurrentStep("Click on cancel selection button in add customer");
	}
	@When("Click on delete button in add customer")
	public void click_on_delete_button_in_add_customer() throws InterruptedException {
		ContactsActions.deletebuttoninaddcustomer();
		StepTracker.setCurrentStep("Click on delete button in add customer");
	}
	@When("Click on copy button in add customer")
	public void click_on_copy_button_in_add_customer() {
		ContactsActions.copybuttoninaddcustomer();
		StepTracker.setCurrentStep("Click on copy button in add customer");
	}
	@When("Click on export button in add customer")
	public void click_on_export_button_in_add_customer() throws InterruptedException {
		ContactsActions.exportinaddcustomer();
		StepTracker.setCurrentStep("Click on export button in add customers");
	}
	@When("Click on inactive button in add customer")
	public void click_on_inactive_button_in_add_customer() {
		ContactsActions.inactivebuttoninaddcustomer();
		StepTracker.setCurrentStep("Click on inactive button in add customer");
	}
	@When("Click on active button in add customer")
	public void click_on_active_button_in_add_customer() {
		ContactsActions.activebuttoninaddcustomer();
		StepTracker.setCurrentStep("Click on active button in add customer");
	}
	@When("Click on pagination in add customer")
	public void click_on_pagination_in_add_customer() throws Exception {
		ContactsActions.pagiantiondropdowninaddcustomer();
		StepTracker.setCurrentStep("Click on pagination in add customer");
	}
	@When("Click on next in add customer")
	public void click_on_next_in_add_customer() throws InterruptedException {
		ContactsActions.nextbuttoninaddcustomer();
		StepTracker.setCurrentStep("Click on next in add customer");
	}
	@Then("Click on previous in add customer")
	public void click_on_previous_in_add_customer() throws InterruptedException{
		ContactsActions.previousbuttoninaddcustomer();
		StepTracker.setCurrentStep("Click on previous in add customer");
	}
	@Given("Click on suppliers in contacts")
	public void click_on_suppliers_in_contacts() throws InterruptedException {
		ContactsActions.supplierstabincontacts();
		StepTracker.setCurrentStep("Click on suppliers in contacts");
	}
	@And("Click on add supplier and validate")
	public void click_on_add_supplier_and_validate() {
		ContactsActions.validateaddnewsuppliers();
		StepTracker.setCurrentStep("Click on add supplier and validate");
	}
	@Then("Enter mandatory fields in suppliers")
	public void enter_mandatory_fields_in_suppliers() {
		ContactsActions.entermandatoryfieldsinsuppliers();
		StepTracker.setCurrentStep("Enter mandatory fields in suppliers");
	}
	@Then("Enter nonmandatory fields in suppliers")
	public void enter_non_mandatory_fields_in_suppliers() throws IOException {
		ContactsActions.enternonmandatoryfieldsinsuppliers();
		StepTracker.setCurrentStep("Enter nonmandatory fields in suppliers");
	}
	@Then("Click on clear form in suppliers")
	public void click_on_clear_form_in_suppliers() {
		ContactsActions.clearforminsuppliers();
		StepTracker.setCurrentStep("Click on clear form in suppliers");
	}
	@Then("Click on search in add new suppliers")
	public void click_on_search_in_add_new_suppliers() {
		ContactsActions.searchinaddnewsuppliers();
		StepTracker.setCurrentStep("Click on search in add new suppliers");
	}
	@Then("Click on add button in add new suppliers")
	public void click_on_add_button_in_add_new_suppliers() {
		ContactsActions.addbuttoninaddnewsuppliers();
		StepTracker.setCurrentStep("Click on add button in add new suppliers");
	}
	@Then("Click checkbox and validate in add new suppliers")
	public void click_checkbox_and_validate_in_add_new_suppliers() throws InterruptedException {
		ContactsActions.checkboxandvalidateoptionsinaddnewsuppliers();
		StepTracker.setCurrentStep("Click checkbox and validate in add new suppliers");
	}
	@When("Click on cancel selection in add new suppliers")
	public void click_on_cancel_selection_in_add_new_suppliers() {
		ContactsActions.cancelselectionsinaddnewsuppliers();
		StepTracker.setCurrentStep("Click on cancel selection in add new suppliers");
	}
	@When("Click on delete button in add new suppliers")
	public void click_on_delete_button_in_add_new_suppliers() {
		ContactsActions.deletebuttoninaddnewsuppliers();
		StepTracker.setCurrentStep("Click on delete button in add new suppliers");
	}
	@When("Click on copy button in add new suppliers")
	public void click_on_copy_button_in_add_new_suppliers() throws InterruptedException {
		ContactsActions.copybuttoninaddnewsuppliers();
		StepTracker.setCurrentStep("Click on copy button in add new suppliers");
	}
	@When("Click on export in add new suppliers")
	public void click_on_export_in_add_new_suppliers() throws InterruptedException {
		ContactsActions.exportinaddnewsupliers();
		StepTracker.setCurrentStep("Click on export in add new suppliers");
	}
	@When("Click on inactive button in add new suppliers")
	public void click_on_inactive_button_in_add_new_suppliers() {
		ContactsActions.inactivebuttoninaddnewsuppliers();
		StepTracker.setCurrentStep("Click on inactive button in add new suppliers");
	}
	@When("Click on active button in add new suppliers")
	public void click_on_active_button_in_add_new_suppliers() {
		ContactsActions.activebuttoninaddnewsuppliers();
		StepTracker.setCurrentStep("Click on active button in add new suppliers");
	}
	@When("Click on close button in add new suppliers")
	public void click_on_close_button_in_add_new_suppliers() {
		ContactsActions.closebuttoninaddnewsuppliers();
		StepTracker.setCurrentStep("Click on close button in add new suppliers");
	}
	@When("Click on search button in add supplier")
	public void click_on_search_button_in_add_supplier() throws InterruptedException {
		ContactsActions.searchinaddsupplier();
		StepTracker.setCurrentStep("Click on search button in add supplier");
	}
	@When("Click on actions export in add supplier")
	public void click_on_export_in_add_supplier() {
		ContactsActions.actionsinaddsupplier();
		StepTracker.setCurrentStep("Click on actions export in add supplier");
	}
	@When("Click on checkbox and validate options in add supplier")
	public void click_on_checkbox_and_validate_options_in_add_supplier() throws InterruptedException {
		ContactsActions.checkboxandvalidateoptionsinaddsuppliers();
		StepTracker.setCurrentStep("Click on checkbox and validate options in add supplier");
	}
	@When("Click on cancel selection in add supplier")
	public void click_on_cancel_selection_in_add_supplier() throws InterruptedException {
		ContactsActions.cancelselectionsinaddsupplier();
		StepTracker.setCurrentStep("Click on cancel selection in add supplier");
	}
	@When("Click on delete button in add supplier")
	public void click_on_delete_yes_button_in_add_supplier() {
		ContactsActions.deletebuttoninaddsupplier();
		StepTracker.setCurrentStep("Click on delete button in add supplier");
	}
	@When("Click on copy button in add supplier")
	public void click_on_copy_button_in_add_supplier() {
		ContactsActions.copybuttoninaddsupplier();
		StepTracker.setCurrentStep("Click on copy button in add supplier");
	}
	@When("Click on export button in add supplier")
	public void click_on_export_button_in_add_supplier() throws InterruptedException {
		ContactsActions.exportinaddsupplier();
		StepTracker.setCurrentStep("Click on export button in add supplier");
	}
	@When("Click on inactive button in add supplier")
	public void click_on_inactive_button_in_add_supplier() {
		ContactsActions.inactivebuttoninaddsupplier();
		StepTracker.setCurrentStep("Click on inactive button in add supplier");
	}
	@When("Click on active button in add supplier")
	public void click_on_active_button_in_add_supplier() {
		ContactsActions.activebuttoninaddsupplier();
		StepTracker.setCurrentStep("Click on active button in add supplier");
	}
	@When("Click on pagination in add supplier")
	public void click_on_pagination_in_add_supplier() throws Exception {
		ContactsActions.pagiantiondropdowninaddsupplier();
		StepTracker.setCurrentStep("Click on pagination in add supplier");
	}
	@When("Click on next in add supplier")
	public void click_on_next_in_add_supplier() throws InterruptedException {
		ContactsActions.nextbuttoninaddsupplier();
		StepTracker.setCurrentStep("Click on next in add supplier");
	}
	@Then("Click on previous in add supplier")
	public void click_on_previous_in_add_supplier() throws InterruptedException{
		ContactsActions.previousbuttoninaddsupplier();
		StepTracker.setCurrentStep("Click on previous in add supplier");
	}
	@Given("Click on director in contacts")
	public void click_on_director_in_contacts() throws InterruptedException {
		ContactsActions.directortabincontacts();
		StepTracker.setCurrentStep("Click on director in contacts");
	}
	@And("Click on add director and validate")
	public void click_on_add_director_and_validate() {
		ContactsActions.validateaddnewdirector();
		StepTracker.setCurrentStep("Click on add director and validate");
	}
	@Then("Enter mandatory fields in director")
	public void enter_mandatory_fields_in_director() throws InterruptedException {
		ContactsActions.entermandatoryfieldsindirector();
		StepTracker.setCurrentStep("Enter mandatory fields in director");
	}
	@Then("Enter nonmandatory fields in director")
	public void enter_nonmandatory_fields_in_director() throws IOException {
		ContactsActions.enternonmandatoryfieldsindirector();
		StepTracker.setCurrentStep("Enter nonmandatory fields in director");
	}
	@Then("Click on clear form in director")
	public void click_on_clear_form_in_director() {
		ContactsActions.clearformindirector();
		StepTracker.setCurrentStep("Click on clear form in director");
	}
	@Then("Click on search in add new director")
	public void click_on_search_in_add_new_director() {
		ContactsActions.searchinaddnewdirector();
		StepTracker.setCurrentStep("Click on search in add new director");
	}
	@Then("Click on add button in add new director")
	public void click_on_add_button_in_add_new_director() {
		ContactsActions.addbuttoninaddnewdirector();
		StepTracker.setCurrentStep("Click on add button in add new director");
	}
	@Then("Click checkbox and validate in add new director")
	public void click_checkbox_and_validate_in_add_new_director() throws InterruptedException {
		ContactsActions.checkboxandvalidateoptionsinaddnewdirector();
		StepTracker.setCurrentStep("Click checkbox and validate in add new director");
	}
	@When("Click on cancel selection in add new director")
	public void click_on_cancel_selection_in_add_new_director() throws InterruptedException {
		ContactsActions.cancelselectionsinaddnewdirector();
		StepTracker.setCurrentStep("Click on cancel selection in add new director");
	}
	@When("Click on delete button in add new director")
	public void click_on_delete_button_in_add_new_director() {
		ContactsActions.deletebuttoninaddnewdirector();
		StepTracker.setCurrentStep("Click on delete button in add new director");
	}
	@When("Click on copy button in add new director")
	public void click_on_copy_button_in_add_new_director() {
		ContactsActions.copybuttoninaddnewdirector();
		StepTracker.setCurrentStep("Click on copy button in add new director");
	}
	@When("Click on export in add new director")
	public void click_on_export_in_add_new_director() {
		ContactsActions.exportinaddnewdirector();
		StepTracker.setCurrentStep("Click on export in add new director");
	}
	@When("Click on inactive button in add new director")
	public void click_on_inactive_button_in_add_new_director() {
		ContactsActions.inactivebuttoninaddnewdirector();
		StepTracker.setCurrentStep("Click on inactive button in add new director");
	}
	@When("Click on active button in add new director")
	public void click_on_active_button_in_add_new_director() {
		ContactsActions.activebuttoninaddnewdirector();
		StepTracker.setCurrentStep("Click on active button in add new director");
	}
	@Then("Click on close button in add new director")
	public void click_on_close_button_in_add_new_director() {
		ContactsActions.closebuttoninaddnewdirector();
		StepTracker.setCurrentStep("Click on close button in add new director");
	}
	@When("Click on search in add director")
	public void click_on_search_in_add_director() {
		ContactsActions.searchinadddirector();
		StepTracker.setCurrentStep("Click on search in add director");
	}
	@When("Click on actions export in add director")
	public void click_on_actions_export_in_add_director() {
		ContactsActions.actionsexportinadddirector();
		StepTracker.setCurrentStep("Click on actions export in add director");
	}
	@When("Click on mousehover edit in add director")
	public void click_on_mousehover_edit_in_add_director() {
		ContactsActions.mousehovereditinadddirector();
		StepTracker.setCurrentStep("Click on mousehover edit in add director");
	}
	@When("Click on mousehover delete button in add director")
	public void click_on_mousehover_delete_button_in_add_director() {
		ContactsActions.mousehoverdeletebuttoninadddirector();
		StepTracker.setCurrentStep("Click on mousehover delete button in add director");
	}
	@When("Click on checkbox and validate options in add director")
	public void click_on_checkbox_and_validate_options_in_add_director() throws InterruptedException {
		ContactsActions.checkboxandvalidateoptionsinadddirector();
		StepTracker.setCurrentStep("Click on checkbox and validate options in add director");
	}
	@When("Click on delete button in add director")
	public void click_on_delete_button_in_add_director() {
		ContactsActions.deletebuttoninadddirector();
		StepTracker.setCurrentStep("Click on delete button in add director");
	}
	@When("Click on copy button in add director")
	public void click_on_copy_button_in_add_director() {
		ContactsActions.copybuttoninadddirector();
		StepTracker.setCurrentStep("Click on copy button in add director");
	}
	@When("Click on export in add director")
	public void click_on_export_in_add_director() {
		ContactsActions.exportinadddirector();
		StepTracker.setCurrentStep("Click on export in add director");
	}
	@When("Click on inactive button in add director")
	public void click_on_inactive_button_in_add_director() {
		ContactsActions.inactivebuttoninadddirector();
		StepTracker.setCurrentStep("Click on inactive button in add director");
	}
	@When("Click on active button in add director")
	public void click_on_active_button_in_add_director() {
		ContactsActions.activebuttoninadddirector();
		StepTracker.setCurrentStep("Click on active button in add director");
	}
	@When("Click on close button in add director")
	public void click_on_close_button_in_add_director() {
		ContactsActions.closebuttoninadddirector();
		StepTracker.setCurrentStep("Click on close button in add director");
	}
	@When("Click on pagination in add director")
	public void click_on_pagination_in_add_director() throws Exception {
		ContactsActions.pagiantiondropdowninadddirector();
		StepTracker.setCurrentStep("Click on pagination in add director");
	}
	@When("Click on next in add director")
	public void click_on_next_in_add_director() throws InterruptedException {
		ContactsActions.nextbuttoninadddirector();
		StepTracker.setCurrentStep("Click on next in add director");
	}
	@Then("Click on previous in add director")
	public void click_on_previous_in_add_director() throws InterruptedException {
		ContactsActions.previousbuttoninadddirector();
		StepTracker.setCurrentStep("Click on previous in add director");
	}
	@Given("Click on shareholder in contacts")
	public void click_on_shareholder_in_contacts() throws InterruptedException {
		ContactsActions.shareholdertabincontacts();
		StepTracker.setCurrentStep("Click on shareholder in contacts");
	}
	@And("Click on add shareholder and validate")
	public void click_on_add_shareholder_and_validate() {
		ContactsActions.validateaddnewshareholder();
		StepTracker.setCurrentStep("Click on add shareholder and validate");
	}
	@When("Enter mandatory fields in shareholder")
	public void enter_mandatory_fields_in_shareholder() {
		ContactsActions.entermandatoryfieldsinshareholder();
		StepTracker.setCurrentStep("Enter mandatory fields in shareholder");
	}
	@When("Enter nonmandatory fields in shareholder")
	public void enter_nonmandatory_fields_in_shareholder() throws IOException {
		ContactsActions.enternonmandatoryfieldsinshareholder();
		StepTracker.setCurrentStep("Enter nonmandatory fields in shareholder");
	}
	@When("Click on clearform in shareholder")
	public void click_on_clearform_in_shareholder() {
		ContactsActions.clearformindirector();
		StepTracker.setCurrentStep("Click on clearform in shareholder");
	}
	@When("Click on search in add new shareholder")
	public void click_on_search_in_add_new_shareholder() {
		ContactsActions.searchinaddnewshareholder();
		StepTracker.setCurrentStep("Click on search in add new shareholder");
	}
	@When("Click on add button in add new shareholder")
	public void click_on_add_button_in_add_new_shareholder() {
		ContactsActions.addbuttoninaddnewshareholder();
		StepTracker.setCurrentStep("Click on add button in add new shareholder");
	}
	@When("Click checkbox and validate options in add new shareholder")
	public void click_checkbox_and_validate_option_in_add_new_shareholder() throws InterruptedException {
		ContactsActions.checkboxandvalidateoptionsinaddnewshareholder();
		StepTracker.setCurrentStep("Click checkbox and validate options in add new shareholder");
	}
	@When("Click on cancel selections in add new shareholder")
	public void click_on_cancel_selections_in_add_new_shareholder() {
		ContactsActions.cancelselectionsinaddnewshareholder();
		StepTracker.setCurrentStep("Click on cancel selections in add new shareholder");
	}
	@When("Click on delete button in add new shareholder")
	public void click_on_delete_button_in_add_new_shareholder() {
		ContactsActions.deletebuttoninaddnewshareholder();
		StepTracker.setCurrentStep("Click on delete button in add new shareholder");
	}
	@Then("Click on copy button in add new shareholder")
	public void click_on_copy_button_in_add_new_shareholder() {
		ContactsActions.copybuttoninaddnewshareholders();
		StepTracker.setCurrentStep("Click on copy button in add new shareholder");
	}
	@When("Click on export in add new shareholder")
	public void click_on_export_in_add_new_shareholder() throws InterruptedException {
		ContactsActions.exportinaddnewshareholder();
		StepTracker.setCurrentStep("Click on export in add new shareholder");
	}
	@When("Click on inactive button in add new shareholder")
	public void click_on_inactive_button_in_add_new_shareholder() {
		ContactsActions.inactivebuttoninaddnewshareholder();
		StepTracker.setCurrentStep("Click on inactive button in add new shareholder");
	}
	@When("Click on active button in add new shareholder")
	public void click_on_active_button_in_add_new_shareholder() {
		ContactsActions.activebuttoninaddnewshareholder();
		StepTracker.setCurrentStep("Click on active button in add new shareholder");
	}
	@Then("Click on close button in add new shareholder")
	public void click_on_close_button_in_add_new_shareholder() {
		ContactsActions.closebuttoninaddnewshareholder();
		StepTracker.setCurrentStep("Click on close button in add new shareholder");
	}
	@Then("Click on search in add shareholder")
	public void click_on_search_in_add_shareholder(){
		ContactsActions.searchinaddshareholder();
		StepTracker.setCurrentStep("Click on search in add shareholder");
	}
	@When("Click on actions export in add shareholder")
	public void click_on_actions_export_in_add_shareholder() throws InterruptedException {
		ContactsActions.actionsexportinaddshareholder();
		StepTracker.setCurrentStep("Click on actions export in add shareholder");
	}
	@When("Click on checkbox and validate options in shareholder")
	public void click_on_checkbox_and_validate_options_in_shareholder() throws InterruptedException {
		ContactsActions.checkboxandvalidateoptionsinshareholder();
		StepTracker.setCurrentStep("Click on checkbox and validate options in shareholder");
	}
	@When("Click on cancel selections in add shareholder")
	public void click_on_cancel_selections_in_add_shareholder() {
		ContactsActions.cancelselectioninaddshareholder();
		StepTracker.setCurrentStep("Click on cancel selections in add shareholder");
	}
	@When("Click on mousehover edit in add shareholder")
	public void click_on_mousehover_edit_in_add_shareholder() {
		ContactsActions.mousehovereditinaddshareholder();
		StepTracker.setCurrentStep("Click on mousehover edit in add shareholder");
	}
	@When("Click on mousehover delete button in add shareholder")
	public void click_on_mousehover_delete_button_in_add_shareholder() {
		ContactsActions.mousehoverdeletebuttoninaddshareholder();
		StepTracker.setCurrentStep("Click on mousehover delete button in add shareholder");
	}
	@When("Click on delete button in add shareholder")
	public void click_on_delete_button_in_add_shareholder() {
		ContactsActions.deletebuttoninaddshareholder();
		StepTracker.setCurrentStep("Click on delete button in add shareholder");
	}
	@When("Click on copy button in add shareholder")
	public void click_on_copy_button_in_add_shareholder() {
		ContactsActions.copybuttoninaddshareholder();
		StepTracker.setCurrentStep("Click on copy button in add shareholder");
	}
	@When("Click on export button in add shareholder")
	public void click_on_export_button_in_add_shareholder() throws InterruptedException {
		ContactsActions.exportinaddshareholder();
		StepTracker.setCurrentStep("Click on export button in add shareholder");
	}
	@When("Click on inactive button in add shareholder")
	public void click_on_inactive_button_in_add_shareholder() {
		ContactsActions.inactivebuttoninaddshareholder();
		StepTracker.setCurrentStep("Click on inactive button in add shareholder");
	}
	@When("Click on active button in add shareholder")
	public void click_on_active_button_in_add_shareholder() {
		ContactsActions.activebuttoninaddshareholder();
		StepTracker.setCurrentStep("Click on active button in add shareholder");
	}
	@When("Click on pagination in add shareholder")
	public void click_on_pagination_in_add_shareholder() throws Exception {
		ContactsActions.pagiantiondropdowninaddshareholder();
		StepTracker.setCurrentStep("Click on pagination in add shareholder");
	}
	@When("Click on next in add shareholder")
	public void click_on_next_in_add_shareholder() throws InterruptedException {
		ContactsActions.nextbuttoninaddshareholder();
		StepTracker.setCurrentStep("Click on next in add shareholder");
	}
	@Then("Click on previous in add shareholder")
	public void click_on_previous_in_add_shareholder() throws InterruptedException {
		ContactsActions.previousbuttoninaddshareholder();
		StepTracker.setCurrentStep("Click on previous in add shareholder");
	}
}
