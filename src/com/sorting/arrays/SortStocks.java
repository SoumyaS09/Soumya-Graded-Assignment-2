package com.sorting.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SortStocks {
	public static void main (String[]args) {
	Scanner sc = new Scanner (System.in);
	
	int i, j, temp;
	
	System.out.println("Enter the no of companies");
	int arraySize = sc.nextInt();
	int[] array = new int[arraySize];
	
	System.out.println("Please enter the stock of the company");
	for(i = 0; i <arraySize; i++ ) {
		array[i]= sc.nextInt();	
	}
	for (i = 0; i< arraySize; i++) {
		for (j = i + 1; j< arraySize; j++) {
			if(array[i] > array[j]) {
				temp = array[i];
				array[i]= array[j];
				array[j]= temp;
			}
		}
	}
	
	System.out.println("Stock prices in ascending order are :" + Arrays.toString(array));
	for(j = 0; j< arraySize; j++) {
		Arrays.sort(array);

	}
	
	
	for(i =0; i< arraySize; i++) {
		for(j= i+1; j < arraySize; j++ ) {
			if(array[i] < array[j]) {
				temp = array[i];
				array[i]= array[j];
				array[j]= temp;
			}
		}
	}
	System.out.println("Stock prices in decending order are: " + Arrays.toString(array));
	for(j = 0; j< arraySize; j++) {
		Arrays.sort(array);
	}
	}
		
}
