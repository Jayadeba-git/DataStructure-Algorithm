package com.jj.patternPractice;

import java.util.Scanner;

public class Pattern23 {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number:");
		int n=sc.nextInt();
		int row=1;
		while(row<=n) {
			int col=1;
			
			while(col<=n-row+1) {
				System.out.print(col);
				col++;
			}
			
			int col2=1;
			while(col2<row) {
				System.out.print("**");
				col2++;
				
			}
			
			int col1=n-row+1;
			while(col1>=1) {
				System.out.print(col1);
				col1--;
			}
			System.out.println();
			row++;
		}
	}

}
