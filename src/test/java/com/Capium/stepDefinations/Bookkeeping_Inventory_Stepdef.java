package com.Capium.stepDefinations;

import java.awt.AWTException;
import java.io.IOException;

import com.Capium.Actions.Bookkeeping_Inventory_Actions;
import com.Capium.Actions.Bookkeeping_Quickentry_Actions;
import com.Capium.Utilites.StepTracker;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class Bookkeeping_Inventory_Stepdef {

	Bookkeeping_Inventory_Actions  InventoryActions=new Bookkeeping_Inventory_Actions();
	
	@And("Click on product")
	public void click_on_product() throws InterruptedException {
		InventoryActions.producttab();
	    StepTracker.setCurrentStep("Click on product");
	}
	@Given("Click on inventory and validate")
	public void click_on_inventory_and_validate() throws InterruptedException, IOException {
		InventoryActions.inventorytab();
	    StepTracker.setCurrentStep("Click on inventory and validate");
	}
	@And("Click on from and to date")
	public void click_on_from_and_to_date() throws IOException {
		InventoryActions.setDateAsTextandsearch();
	    StepTracker.setCurrentStep("Click on from and to date");
	}
	@And("Click on loss of stock and validate")
	public void click_on_loss_of_stock_and_validate() {
		InventoryActions.losstostock();
	    StepTracker.setCurrentStep("Click on loss of stock and validate");
	}
	@When("Enter mandatory fields in inventory")
	public void enter_mandatory_fields_in_inventory() throws InterruptedException {
		InventoryActions.mandatoryfieldsinlosstostock();
	    StepTracker.setCurrentStep("Enter mandatory fields in inventory");
	}
	@When("Enter non mandatory fields in inventory")
	public void enter_non_mandatory_fields_in_inventory() throws InterruptedException, AWTException {
		InventoryActions.nonmandatoryfieldsininventory();
	    StepTracker.setCurrentStep("Enter non mandatory fields in inventory");
	}
	@When("Click on cancel in loss of stock and validate")
	public void click_on_cancel_in_loss_of_stock_and_validate() throws InterruptedException {
		InventoryActions.cancelinlossofstock();
	    StepTracker.setCurrentStep("Click on cancel in loss of stock and validate");
	}
	@When("Click on add new line in loss of stock and validate")
	public void click_on_add_new_line_in_loss_of_stock_and_validate() {
		InventoryActions.addnewlineinlossofstock();
	    StepTracker.setCurrentStep("Click on add new line in loss of stock and validate");
	}
	@When("Click on clear all lines in loss of stock and validate")
	public void click_on_clear_all_lines_in_loss_of_stock_and_validate() {
		InventoryActions.clearalllinesinlossofstock();
	    StepTracker.setCurrentStep("Click on clear all lines in loss of stock and validate");
	}
	@When("Click on delete in loss of stock and validate")
	public void click_on_delete_in_loss_of_stock_and_validate() {
		InventoryActions.deleteinlossofstock();
	    StepTracker.setCurrentStep("Click on delete in loss of stock and validate");
	}
	@When("Click on accounts in inventory and validate")
	public void click_on_accounts_in_inventory_and_validate() {
		InventoryActions.accountsinlossofstock();
	    StepTracker.setCurrentStep("Click on accounts in inventory and validate");
	}

}
