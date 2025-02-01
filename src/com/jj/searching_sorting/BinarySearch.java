package com.jj.searching_sorting;

public class BinarySearch {

	public static void main(String[] args) {

		
		int even[]= {2,4,6,8,10};
		
		int searchindex=getBimarySearch(even,5,8);
		System.out.println("Index of 8 ::"+searchindex);
		
	}

	private static int getBimarySearch(int[] arr, int size, int searchingElement) {
		
		int start=0;
		int end=size-1;
		
		int mid=(start+end)/2;
		
		
		while(start<=end) {
			
			if(arr[mid]==searchingElement) {
				return mid;
			}
			else if(searchingElement>arr[mid]) {
				start=mid+1;
			}
			else {
				end=mid-1;
			}
			
			mid=(start+end)/2;
		}//while
		
		
		return -1;
	}

}
