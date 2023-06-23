package Searching_Sorting;

import java.util.Scanner;

public class MergeSortedArrya {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 int n = sc.nextInt();
		 int m = sc.nextInt();
		 int l = m+n;
		 int arr1[] = new int[n];
		 int arr2[]= new int [m];
		 int arr3[]= new int[l];
		 int i , j , k;
		 for(i =0; i<n; i++) {
			 arr1[i]=sc.nextInt();
		 }
		 for(int q=0;q<m;q++) {
			 arr2[q] = sc.nextInt();
		 }
		 for(j = 0; j<n; j++) {
			 arr3[j] = arr1[j];
		 }
		 for(k=0;k<m;k++) {
			 arr3[k+n] = arr2[k];
		 }
		 for(int i1 = 0; i1<l; i1++) {
			 for(int j1 = i1+1; j1<l; j1++) {
				 if(arr3[i1]>arr3[j1]) {
					 int temp = arr3[j1];
						arr3[j1]=arr3[i1];
						arr3[i1]=temp;
				 }
			 }
			 System.out.print(arr3[i1]+" ");
		 }
		 
	}
		 

}

