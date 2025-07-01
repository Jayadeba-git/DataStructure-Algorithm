package com.jj.Array;

public class ExtreamPrint {

	public static void main(String[] args) {

		int arr[]= {10,20,30,40,50,60,70};
		int size=7;
		
		printExtream(arr,size);
	}

	private static void printExtream(int[] arr, int size) {

		int i=0;
		int j=size-1;
		
		while(i<=j) {
			if(i==j) {
				System.out.print(arr[i]+" ");
				break;
			}else {
				System.out.print(arr[i]+" ");
				i++;
				System.out.print(arr[j]+" ");
				j--;
			}
		}
	}

}
