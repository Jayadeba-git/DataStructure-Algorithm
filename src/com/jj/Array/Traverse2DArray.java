package com.jj.Array;

public class Traverse2DArray {

	public static void main(String[] args) {
	    
		int arr[]= {10,20,30,40 };
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i;j<arr.length;j++) {
				System.out.print("["+arr[i]+","+arr[j]+"]");
			}
			System.out.println();
			
		}

	}

}
