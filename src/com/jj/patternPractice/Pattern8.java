package com.jj.patternPractice;

import java.util.Scanner;

public class Pattern8 {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number:");
		int n=sc.nextInt();
		/*
		int row=1;
		while(row<=n) {
			int col=1;
			int value=row;
			while(col<=row) {
				System.out.print(value);
				value++;
				col++;
			}
			System.out.println();
			row++;
			
		}*/
		
		
		//Without using the extra variable
		
		int row=1;
		while(row<n) {
			int col=row;
			while(col<row*2) {
				System.out.print(col);
				col++;
			}
			System.out.println();
			row++;
			
		}
	}

}
