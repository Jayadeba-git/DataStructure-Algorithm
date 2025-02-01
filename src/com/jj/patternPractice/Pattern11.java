package com.jj.patternPractice;

import java.util.Scanner;

public class Pattern11 {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number:");
		int n=sc.nextInt();
		int row=1;
		char ch='A';
		while(row<=n) {
			int col=1;
			while(col<=n) {
				System.out.print(ch);
				col++;
			}
			System.out.println();
			ch++;
			row++;
		}
		
	}

}
