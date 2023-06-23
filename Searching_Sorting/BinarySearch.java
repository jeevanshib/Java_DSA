package Searching_Sorting;

import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			int arr[] = new int[n];
			for (int i = 0; i < n; i++) {
			    arr[i] = sc.nextInt();
			}
			int a = sc.nextInt();
			int S = 0, E = n - 1;
			while(S<=E){
			int M = (S + E) / 2;
			if(arr[M]== a){
				System.out.println(M);
				break;
			}
			   else if (arr[M] >a) {
			        E= M-1;
			        }
			    else if (a >arr[M]) {
			        S = M+1;
			    }
			}
        
   
        }
	}

}
