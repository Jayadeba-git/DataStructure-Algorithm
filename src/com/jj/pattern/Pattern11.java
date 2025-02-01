package com.jj.pattern;

import java.util.Scanner;

public class Pattern11 {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number:");
		int n=sc.nextInt();
		int i=1;
		while(i<=n) {
			int j=1;
			while(j<=n) {
				char ch= (char) ((char)'A'+i+j-2);
				System.out.print(ch);
				j++;
			}
			System.out.println();
			i++;
		}
		
		
	}

}
