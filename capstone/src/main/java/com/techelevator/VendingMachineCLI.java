package com.techelevator;

import com.techelevator.view.Menu;

public class VendingMachineCLI {

	private static final String   MAIN_MENU_OPTION_DISPLAY_ITEMS = "Display Vending Machine Items";
	private static final String   MAIN_MENU_OPTION_PURCHASE      = "Purchase";
	private static final String   MAIN_MENU_OPTION_EXIT          = "Exit";
	private static final String[] MAIN_MENU_OPTIONS = { MAIN_MENU_OPTION_DISPLAY_ITEMS,
													    MAIN_MENU_OPTION_PURCHASE,
													    MAIN_MENU_OPTION_EXIT};
	
	private Menu menu;
	
	public VendingMachineCLI(Menu menu) {
		this.menu = menu;
	}
	
	public void run() {
		boolean shouldLoop = true;
		while(shouldLoop) {
			String choice = (String)menu.getChoiceFromOptions(MAIN_MENU_OPTIONS);
			
			if(choice.equals(MAIN_MENU_OPTION_DISPLAY_ITEMS)) {
				// display vending machine items - good place for a method call
			} 
			else if(choice.equals(MAIN_MENU_OPTION_PURCHASE)) {
				// do purchase - good place for a method call
			}
			else if(choice.equals(MAIN_MENU_OPTION_EXIT)) {
				// do any end of program processing - good place for a method call
		         shouldLoop=false;	  
			  }		  
		}
	}
	
	public static void main(String[] args) {
		Menu menu = new Menu(System.in, System.out);
		VendingMachineCLI cli = new VendingMachineCLI(menu);
		cli.run();
	}
}