package com.jj.searching_sorting;

public class FirstLastOccuranceByBS {

	public static void main(String[] args) {

         int even[]= {2,3,4,7,8,11,11,11,11,11,11,12,13};
		
		int left=getLeftMostOccurance(even,13,11);
		int right=getRightMostOccurance(even,13,11);
		System.out.println("Index of left most 11 ::"+left);
		System.out.println("Index of right most 11 ::"+right);
		
	}

	private static int getLeftMostOccurance(int[] arr, int size, int key) {
    
		int start=0;
		int end=size-1;
		int mid=(start+end)/2;
		int ans=-1;
		
		while(start<=end) {
			
			if(arr[mid]==key) {
				end=mid-1;
				ans=mid;
			}
			else if(arr[mid]>key) {
				end=mid-1;
			}
			else if(arr[mid]<key) {
				start=mid+1;
			}
			mid=(start+end)/2;
		}//while
		
		return ans;
	}

	private static int getRightMostOccurance(int[] arr, int size, int key) {
	    
		int start=0;
		int end=size-1;
		int mid=(start+end)/2;
		int ans=-1;
		
		while(start<=end) {
			
			if(arr[mid]==key) {
				start=mid+1;
				ans=mid;
			}
			else if(arr[mid]>key) {
				end=mid-1;
			}
			else if(arr[mid]<key) {
				start=mid+1;
			}
			mid=(start+end)/2;
		}//while
		
		return ans;
	}

	
	
}
