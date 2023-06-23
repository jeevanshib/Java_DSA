package Searching_Sorting;

import java.util.Scanner;

public class SelectionSort {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			int arr[]= new int[n];
			for(int i = 0; i<n; i++) {
				arr[i]=sc.nextInt();
			}
			for(int i = 0;  i<n-1; i++) {
				int min = arr[i];
				int mini = i;
				for(int j = i+1; j<n; j++) {
					if(arr[j]<min) {
						min = arr[j];
						mini = j;
					}
					
				}
				if(mini != i) {
					arr[mini]=arr[i];
					arr[i]=min;
				}
				
			}
			for(int i = 0; i<n; i++) {
				System.out.print(arr[i]+" ");
			}
		}

	}

}
