package com.jj.pattern;

import java.util.Scanner;

public class StarPattern {

	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Eneter Width::");
		int len=sc.nextInt();
		System.out.println("Eneter Width::");
		int wid=sc.nextInt();
		
		for(int row=0;row<len;row++) {
			for(int col=0;col<wid;col++){
				if(row==0 || row==len-1)
				System.out.print("* ");
				else {
					if(col==0 || col ==wid-1) 
						System.out.print("* ");
					else
					   System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}
