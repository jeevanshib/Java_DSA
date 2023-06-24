package Recursion;

import java.util.Scanner;

public class HCF {
	public static int value(int n1, int n2) {
		if(n1>n2)
		{
			n1=n1-n2;
			return value(n1, n2);
		}
		else if(n2>n1) {
			n2= n2-n1;
			return value(n1,n2);
		}
		else
			return n1;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		System.out.println(value(n1,n2));
	}

}
