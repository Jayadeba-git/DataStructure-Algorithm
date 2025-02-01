package com.jj.pattern;

import java.util.Scanner;

public class Pattern8 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number:");
		int n=sc.nextInt();
		
		int row=1;
		while(row<=n) {
			int col=1;
			while(col<=n) {
				char ch=(char) ('A'+row-1);
				System.out.print(ch);
				col++;
			}
			System.out.println();
			row++;
		}

	}

}
