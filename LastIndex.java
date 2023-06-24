package Recursion;

import java.util.Scanner;

public class LastIndex {
	public static int lastIndex(int input[], int size, int x) {
		int index=0;
		 for(int i=0;i<size;i++){
		     
		    if(input[i]==x){
		        index=i;
		         for(int j=i;j<size;j++){
		        if(input[j]==x){index=j;}
		        
		       
		         }
		         return index;
		      }
		 }
		return -1;
		}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[]=new int[n];
		for(int i = 0; i<n; i++) {
			arr[i]=sc.nextInt();
		}
		int x = sc.nextInt();
		System.out.println(lastIndex(arr, n, x));
	}

}
