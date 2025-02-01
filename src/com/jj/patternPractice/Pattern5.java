package com.jj.patternPractice;

import java.util.Scanner;

public class Pattern5 {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number:");
		int n=sc.nextInt();
		
		
		int row=1;
		while(row<=n) {
			int col=1;
			while(col<=row) {
				System.out.print("* ");
				col++;
			}
			System.out.println();
			row++;
		}
	}

}
