package com.sorting.service;

import java.util.Scanner;

public class Operations {

	Scanner scan = new Scanner(System.in);

	public void Companies() {
		int companies = 0;
		System.out.println("Enter the no of companies");
		scan.nextInt();
		if (companies > 0) {
			System.out.println("Enter current stock price of the company 1\r\n" + "");
			System.out.println("Whether company's stock price rose today compare to yesterday?");
			scan.nextBoolean();

		}

	}

}
