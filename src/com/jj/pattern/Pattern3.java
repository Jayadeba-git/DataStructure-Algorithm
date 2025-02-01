package com.jj.pattern;

import java.util.Scanner;

public class Pattern3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number:");
		int count=sc.nextInt();
		int row=1,col=1;
		while(row<=count) {
			col=1;
			while(col<=row) {
				System.out.print("* ");
				col++;
			}
			row++;
			System.out.println();
		}
	}

}
