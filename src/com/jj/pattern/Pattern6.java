package com.jj.pattern;

import java.util.Scanner;

public class Pattern6 {

	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number:");
		int n=sc.nextInt();
		
		int row=1;
	    while(row<=n){
	        int col = row;
	        while(col<2*row){
	           System.out.print(col+" ");
	            col++;
	        }
	        System.out.println();
	        row++;
	    }
/*
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number:");
		int n=sc.nextInt();
		
		int row=1,col=1;
		while(row<=n) {
			col=1;
			int value=row;
			while(col<=row) {
				System.out.print(value+" ");
				col++;
				value++;
			}
			System.out.println();
			row++;
		}
	*/}

}
