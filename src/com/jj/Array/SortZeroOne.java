package com.jj.Array;

public class SortZeroOne {

	public static void main(String[] args) {
	  
		  int arr[]= {1,1,0,1,1,0};
		  int size=6;
		  
		  sortZeroOne(arr,size);
		  for(int ele:arr) {
			  System.out.print(" "+ele);
		  }
	}

	private static void sortZeroOne(int[] arr, int size) {
	
		int zeroCont=0;
		int oneCount=0;
		for(int i=0;i<size;i++) {
			if(arr[i]==0)zeroCont++;
			if(arr[i]==1)oneCount++;
		}
		
		for(int i=0;i<zeroCont;i++) {
			arr[i]=0;
		}
		for(int i=zeroCont;i<size;i++) {
			arr[i]=1;
		}
		
	}

}
