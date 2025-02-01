package com.jj.pattern;

public class Pattern1 {

	public static void main(String[] args) {

		int n=5;
		int i = 1,j=1;
		while(i<=n) {
			j=1;	
			while(j<=n) {
				System.out.print(n-j);
				j++;
			}
			System.out.println();
			i++;
			
		}
	}

}
