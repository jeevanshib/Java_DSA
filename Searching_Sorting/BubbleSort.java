package Searching_Sorting;

import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			int arr[]= new int [n];
			for(int i = 0; i<n; i++) {
				arr[i]=sc.nextInt();
			}
			for(int i = 0; i<n; i++) {
				for(int j = i+1; j<n; j++) {
					if(arr[i]>arr[j]) {
						int temp = arr[j];
						arr [j]=arr[i];
						arr[i]=temp;
					}
				}
				System.out.print(arr[i]+" ");
			}
		}

	}

}
