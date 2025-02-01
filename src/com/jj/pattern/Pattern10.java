package com.jj.pattern;

import java.util.Scanner;

public class Pattern10 {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number:");
		int n=sc.nextInt();
		
		int row=1;
		char start='A';
		while(row<=n) {
			int col=1;
			
			while(col<=n) {
				
				System.out.print(start+" ");
				col++;
				start++;
			}
			System.out.println();
			row++;
		}

	
	}

}
