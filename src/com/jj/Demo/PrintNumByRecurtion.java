package com.jj.Demo;

import java.util.Scanner;

public class PrintNumByRecurtion {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	System.out.println("Enter the value of N ::");
	int a=sc.nextInt();
print(a);
	}

	private static void print(int a) {
		if(a>=1) {
			PrintNumByRecurtion.print(a-1);
			System.out.print(a);
			
		}
		
	}

}
