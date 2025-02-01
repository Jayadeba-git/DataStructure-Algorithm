package com.jj.patternPractice;

import java.util.Scanner;

public class Pattern14 {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number:");
		int n=sc.nextInt();
		int row=1;
		char ch='A';
		while(row<=n) {
			int col=1;
			while(col<=row) {
				System.out.print(ch);
				ch++;
				col++;
			}
			System.out.println();
			row++;
		}
	}

}
