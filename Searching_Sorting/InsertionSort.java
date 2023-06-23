package Searching_Sorting;
import java.util.Scanner;
public class InsertionSort {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in); 
			int n = sc.nextInt();
			int arr[]= new int[n];
			int j,sorted=0;
			for(int i = 0; i<n; i++) {
				arr[i]=sc.nextInt();
			}
			for(int i = 1; i<n; i++) {
				sorted=arr[i];
				for(j=i;j>=0;j--) {
					if(arr[j-1]>sorted) {
						arr[j]=arr[j-1];
					}else 
						break;
				}
				arr[j]=sorted;
			}
			for(int i = 0; i<n; i++) {
				System.out.print(arr[i]+" ");
			}
		}		
	}
