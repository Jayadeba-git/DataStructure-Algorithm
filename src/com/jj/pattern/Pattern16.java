package com.jj.pattern;

import java.util.Scanner;

public class Pattern16 {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number:");
		int n=sc.nextInt();
		int row=1;
		while(row<=n) {
			
		int col=1;
		int space=n-row;
		 while(col<=space) {
			 System.out.print(" ");
			 space--;
		 }
		 while(col<=row) {
			 System.out.print("*");
			 col++;
		 }
		 System.out.println();
		 row++;
		}
		
	}

}
