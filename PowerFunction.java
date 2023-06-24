package Recursion;

import java.util.Scanner;

public class PowerFunction {
	public static int pow(int n, int x) {
		if(n==1) {
			return 1;
		}
		return (int) Math.pow(n, x);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = sc.nextInt();
		int ans = pow(n, x);
		System.out.println(ans);
	}

}
