package com.jj.patternPractice;

import java.util.Scanner;

public class Pattern4 {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number:");
		int n=sc.nextInt();
		int row=1;
		int value =n*n;// take  a variable starting with multiplication of input value .
		while(row<=n) {
			int col=1;
			
			while(col<=n) {
				System.out.print(value+" ");
				col++;
				value--;//increment that variable 
			
			}
			System.out.println();
			row++;
		}
	}

}
