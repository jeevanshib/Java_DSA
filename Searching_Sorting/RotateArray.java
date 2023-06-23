package Searching_Sorting;

import java.util.Scanner;

public class RotateArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[]= new int [n];
		
		for(int i = 0; i<n; i++) {
			arr[i]= sc.nextInt();
		}
		int a = sc.nextInt();
		int c = 0;
		int k[]= new int[n];
		for(int i = a; i<n; i++) {
			k[c]=arr[i];
			++c;
		}
		for(int i = 0; i<a; i++) {
			k[c]=arr[i];
			++c;
		}
		for(int i = 0; i<n; i++) {
			System.out.print(k[i]+" ");
		}
	}

}
