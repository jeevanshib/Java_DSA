package Recursion;

import java.util.Scanner;

public class FirstIndex {
	public static int firstIndex(int input[], int size, int x) {
		 for(int i=0;i<size;i++){
		     if(input[i]==x){return i;}
		 }
		return -1;
		}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[]= new int [n];
		for(int i = 0; i<n; i++) {
			arr[i]=sc.nextInt();
		}
		int x = sc.nextInt();
		System.out.println(firstIndex(arr, n, x));

	}

}
