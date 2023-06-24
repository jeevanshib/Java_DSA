package Recursion;

import java.util.Scanner;

public class CheckArray {
	public static boolean check(int arr[], int l, int r, int x) {
        if (r >= l) {
            int mid = l + (r - l) / 2;
            if (arr[mid] == x)
                return true;
            if (arr[mid] > x)
                return check(arr, l, mid - 1, x);
            return check(arr, mid + 1, r, x);
        }
        return false;
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[]=new int[n];
		for(int i = 0; i<n; i++) {
			arr[i]=sc.nextInt();
		}
		int a = sc.nextInt();
		System.out.println(check(arr, 0 , n-1, a));
	}

}
