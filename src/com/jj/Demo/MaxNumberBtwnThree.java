package com.jj.Demo;

import java.util.Scanner;

public class MaxNumberBtwnThree {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1st number:");
		int a=sc.nextInt();
		System.out.println("Enter 2nd number:");
		int b=sc.nextInt();
		System.out.println("Enter 3rd number:");
		int c=sc.nextInt();
        System.out.println("Among "+a+","+b+","+c+"--->"+calMax1(a,b,c)+" is Maximum");
	}

	private static int calMax(int a, int b,int c) {
		return ((a>b && a>c)?a:(b>c?b:c));
	}
	private static int calMax1(int a, int b,int c) {
		return Math.max(Math.max(a, b), c);
	}


}
