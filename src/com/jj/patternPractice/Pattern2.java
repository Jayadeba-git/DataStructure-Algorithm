package com.jj.patternPractice;

import java.util.Scanner;

public class Pattern2 {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number:");
		int n=sc.nextInt();
		int row=1;
		while(row<=n) {
			int col=1;
			int value=n;
			while(col<=n) {
				System.out.print(value+" ");
				col++;
				value--;
			}
			System.out.println();
			row++;
		}
	}

}
