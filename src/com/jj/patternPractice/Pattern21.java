package com.jj.patternPractice;

import java.util.Scanner;

public class Pattern21 {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number:");
		int n=sc.nextInt();
		
		int row=1;
		while(row<=n) {
			
			int space=1;
			while(space<n-row+1) {
				System.out.print(" ");
				space++;
			}
			int col=1;
			while(col<=row) {
				System.out.print(row);
				col++;
			}
			System.out.println();
			row++;
		}
			
	}

}
