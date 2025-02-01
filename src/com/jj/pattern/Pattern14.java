package com.jj.pattern;

import java.util.Scanner;

public class Pattern14 {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number:");
		int n=sc.nextInt();
		
		int row=1;
		
		while(row<=n) {
			int col=1;
			while(col<=row) {
				char ch=(char) ('A'+row+col-2);
				System.out.print(ch+" ");
				col++;
			}
			System.out.println();
			row++;
			
		}
		
	}

}
