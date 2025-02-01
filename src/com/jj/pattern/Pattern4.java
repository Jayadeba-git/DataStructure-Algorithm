package com.jj.pattern;

import java.util.Scanner;

public class Pattern4 {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number:");
		int n=sc.nextInt();
		int row=1,col=1;
		while(row<=n) {
			col=1;
			while(col<=row) {
				System.out.print(row);
				col++;
			}
			System.out.println();
			row++;
		}
	}

}
