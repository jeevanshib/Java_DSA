package Searching_Sorting;

import java.util.Scanner;

public class CheckArrayRotation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[]= new int[n];
		int index=0;
		for(int i = 0; i<n; i++) {
			arr[i]=sc.nextInt();
		}
		int min = arr[0];
		for(int i = 0; i<n; i++) {
			if(arr[i]<min) {
				min= arr[i];
				index = i;
			}
		}
		System.out.print(index);

	}

}
