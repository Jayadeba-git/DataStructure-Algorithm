package com.jj.searching_sorting;

public class GetPivotElementByBS {

	public static void main(String[] args) {
		 int even[]= {7,8,9,1,2,3,5};
		 
		 int pivotelement=getPivot(even,6);
		 System.out.println("Pivot element ::"+even[pivotelement]);

	}

	private static int getPivot(int[] arr, int size) {
     int start=0;
     int end=size-1;
     int mid=start+(end-start)/2;
     
     while(start<end) {
    	 
    	 if(arr[mid]>=arr[0]) {
    		start=mid+1; 
    	 }
    	 else {
    		 end=mid;
    	 }
    	 mid=start+(end-start)/2;
     }
	return start;
	}

}
