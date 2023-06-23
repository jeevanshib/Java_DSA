package Searching_Sorting;

import java.util.Scanner;

public class PushZerosToEnd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[]= new int[n];
		for(int i = 0; i<n; i++) {
			arr[i]=sc.nextInt();
		}
		int c = 0;
		int k[] = new int[n];
		for(int i = 0; i<n; i++) {
			if(arr[i]!=0) {
				k[c]=arr[i];
				++c;
			}
		}
		for(int i = 0; i<n; i++) {
			if(arr[i]==0) {
				k[c]=arr[i];
				++c;
			}
		}
		for(int i = 0; i<n; i++) {
			System.out.print(k[i]+" ");
		}

	}

}
