package controller;

import java.util.Scanner;

import dao.Atm_Dao;
import dto.Atm_Dto;

public class Display_main 
{    
	static long  AccountNumber=309887718;
	
	public static void displaymain()
	{
		System.out.println("                   Welcome to ATM                  ");
		System.out.println("            please perform any operation         ");
		System.out.println("          which operation you want to perform    ");
		System.out.println("          press 1/2/3/4.... for below operation");
		System.out.println("                                                ");
		System.out.println("        1)AccountInformation       4)BalanceEnquiry  ");
		System.out.println("  	2)ChangePin                5)WithDraw Money  ");
		System.out.println("   	3)HomePage                                   ");
	
	
	}
	public static void enterOperation()
	{
		Atm_Dao atm_Dao=new Atm_Dao();
		Atm_Dto atm_Dto=new  Atm_Dto();
		Scanner sc=new Scanner(System.in);
		System.out.println("Please Enter Operation Here ");		
		int n=sc.nextInt();
		switch (n) 
		{
		case 1:		
				atm_Dao.AccountInfo(AccountNumber);
				break;
		case 2:	
				atm_Dao.updatePin(AccountNumber);
				break;				
		case 3:				
				displaymain();
				enterOperation();
				break;
		case 4:
				atm_Dao.BalanceInfo(AccountNumber);
				break;				
		case 5:
				atm_Dao.withdrawMoney(AccountNumber);
				break;				
		default : System.out.println("Please Enter valid input");
		      		enterOperation();
		      		break;
		}
	}

}
