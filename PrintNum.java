package Recursion;

import java.util.Scanner;

public class PrintNum {
	public static void printnum(int n) {
		if(n>0) {
			printnum(n-1);
			System.out.print(n + " ");
		}
		return;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		printnum(n);
	}

}
