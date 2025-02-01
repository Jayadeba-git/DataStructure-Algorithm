package com.jj.searching_sorting;

public class PeakIndexMountainIndex {

	public static void main(String[] args) {
		  int even[]= {2,3,4,7,52,1};
		  
		int ans=  findpeakIndex(even,5);
		System.out.println("Peak index is :"+ans);
	}

	private static int findpeakIndex(int[] arr, int size) {
		int start=0;
		int end=size-1;
		
		int mid=start+(end-start)/2;
		
		while(start<end) {
			if(arr[mid]<arr[mid+1]) {
				start=mid+1;
			}else {
				end=mid;
			}
			mid=start+(end-start)/2;
		}
		
		return start;
	}

	

}
