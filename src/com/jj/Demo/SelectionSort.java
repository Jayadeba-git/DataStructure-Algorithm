package com.jj.Demo;

import java.util.Arrays;
import java.util.Random;

public class SelectionSort {

	public static void main(String[] args) {

		Random ran= new Random();
		int[] a=new int[10];
		
		for(int i=0;i<10;i++) {
			a[i]=ran.nextInt(100);
		}

		System.out.println("Before Sorting ::"+Arrays.toString(a));
		//SelectionSort.selectionSortASC(a);
		SelectionSort.selectionSortDesc(a);
		System.out.println("After Sorting ::"+Arrays.toString(a));
	
	}

	private static void selectionSortDesc(int[] a) {
		int min=0;
		
		for(int i=0;i<a.length-1;i++) {
			min=i;
			for(int j=i+1;j<a.length;j++) {
				if(a[j]>a[min])
					min=j;
			}
			
			if(min!=i) {
				int temp;
				temp=a[i];
				a[i]=a[min];
				a[min]=temp;
			}
			
		}
		
	}

	private static void selectionSortASC(int[] a) {
		int min=0;
		
		for(int i=0;i<a.length-1;i++) {
			min=i;
			for(int j=i+1;j<a.length;j++) {
				if(a[j]<a[min])
					min=j;
			}
			
			if(min!=i) {
				int temp;
				temp=a[i];
				a[i]=a[min];
				a[min]=temp;
			}
			
		}
		
	}

}
