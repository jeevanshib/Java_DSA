package Recursion;

import java.util.Scanner;

public class NumOfDigits {
	public static int numdigi(int n) {
		if(n<10) 
			return 1;
		else 
			 return 1+ numdigi(n/10);
		}
		
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.print("Number of digits : "
                + numdigi(n));
	}

}
