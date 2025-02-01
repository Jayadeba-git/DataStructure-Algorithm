package com.jj.patternPractice;

import java.util.Scanner;

public class Pattern9 {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number:");
		int n=sc.nextInt();
		
		int row=1;
		while(row<n) {
			int col=1;
			char ch='A';
			while(col<=n) {
				System.out.print(ch+1);
				ch++;
				col++;
			}
			System.out.println();
			row++;
		}
	}

}
