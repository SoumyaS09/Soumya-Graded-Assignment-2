package com.sorting.main;

import java.util.Scanner;

public class StockDriver {
	
	public static void main (String []args) {
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Welcome to Stockers.Stockers, enter the operation that you want to perform");
		
		int option;
		System.out.println();
		System.out.println("\n..........................\n");
		System.out.println("1. Display the companies stock prices in ascending order");
		System.out.println("2. Display the companies stock prices in descending order");
		System.out.println("3. Display the total no of companies for which stock prices rose today");
		System.out.println("4. Display the total no of companies for which stock prices declined today");
		System.out.println("5. Search a specific stock price");
		System.out.println("6. press 0 to exit");
		System.out.println("\n..........................\n");
		
		option= scan.nextInt();

		switch(option) {
		
		case 6:
			break;

		
		
		}
	}

}
