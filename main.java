package controller;

import dao.Atm_Dao;

public class main {

	public static void main(String[] args)
	{
		Atm_Dao atm_Dao=new Atm_Dao();
		Display_main display_main= new Display_main();
		display_main.displaymain();
		display_main.enterOperation();
		
	}

}
