package com.jj.pattern;

import java.util.Scanner;

public class Pattern17 {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number:");
		int n=sc.nextInt();
		int row=1;
		while(row<=n) {
			
			
			int col=1;
			int space=row-1;
			while(col<=space) {
				System.out.print(" ");
			
			}
			
			int star=n-row+1;
			
			while(star<=1) {
				System.out.print("*");
			}
			System.out.println();
			row++;
			
		}
	}

}
