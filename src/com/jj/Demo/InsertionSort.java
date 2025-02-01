package com.jj.Demo;

import java.util.Arrays;
import java.util.Random;

public class InsertionSort {

	public static void main(String[] args) {
		Random ran= new Random();
		int[] a=new int[10];
		
		for(int i=0;i<10;i++) {
			a[i]=ran.nextInt(100);
		}

		System.out.println("Before Sorting ::"+Arrays.toString(a));
		//SelectionSort.selectionSortASC(a);
		InsertionSort.InsertionSortASC(a);
		System.out.println("After Sorting ::"+Arrays.toString(a));
	
	
	}

	private static void InsertionSortASC(int[] a) {
		int temp,j,i;
		for(i=1;i<a.length;i++) {
			temp=a[i];
			j=i-1;
			while(j>=0 && a[j]>temp) {
				a[j+1]=a[j];
				j--;
			}
			a[j+1]=temp;
		}
		
	}

}
