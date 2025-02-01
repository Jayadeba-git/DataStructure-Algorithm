package com.jj.pattern;

import java.util.Scanner;

public class Pattern2 {

	public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter number:");
      int n=sc.nextInt();
		int i=1,j=1,count=0;
		
		while(i<=n) {
			j=1;
			while(j<=n) {
				System.out.print(count+" ");
				count++;
				j++;
			}
			System.out.println();
			i++;
		}
		
	}

}
