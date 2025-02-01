package com.jj.pattern;

import java.util.Scanner;

public class Pattern5 {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Eneter number:");
		
		int n=sc.nextInt();
		int row=1,col=1,count=0;
		while(row<=n) {
			col=1;
			while(col<=row) {
				System.out.print(count+" ");
				col++;
				count++;
			}
			row++;
			System.out.println();
		}
		
	}

}
