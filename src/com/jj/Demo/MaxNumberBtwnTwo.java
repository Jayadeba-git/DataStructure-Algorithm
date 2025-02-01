package com.jj.Demo;

import java.util.Scanner;

public class MaxNumberBtwnTwo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1st number:");
		int a=sc.nextInt();
		System.out.println("Enter 2nd number:");
		int b=sc.nextInt();
        System.out.println("Among "+a+","+b+" --->"+calMax(a,b)+" is Maximum");
	}

	private static int calMax(int a, int b) {
		return (a>b?a:b);
	}
	private static int calMax1(int a, int b) {
		return Math.max(a, b);
	}


}
