package com.jj.Demo;

import java.util.Scanner;

public class SwapNumbers {

	public static void main(String[] args) {
		Scanner sc=new  Scanner(System.in);
		System.out.println("Enter a value:");
		int a=sc.nextInt();
		System.out.println("Enter b value:");
		int b=sc.nextInt();
//		SwapNumbers.swap1(a,b);
		SwapNumbers.swap2(a,b);

	}

	/*private static void swap1(int a, int b) {
	int temp;
	temp=a;
	a=b;
	b=temp;
	System.out.println("a and b value: "+a+" and "+b);
		
	}*/
	private static void swap2(int a, int b) {
		
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("a and b value: "+a+" and "+b);
			
		}
	

}
