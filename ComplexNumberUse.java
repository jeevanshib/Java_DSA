package ObjectOrientedProgramming;

import java.util.Scanner;

public class ComplexNumberUse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int r1 = sc.nextInt();
		int i1 = sc.nextInt();
		int r2 = sc.nextInt();
		int i2 = sc.nextInt();
		int f = sc.nextInt();
		ComplexNumber c1 = new ComplexNumber(r1 , i1);
//		c1.print();
//		c1.setReal(r);
//		c1.setImaginary(i);
//		c1.print();
		
		ComplexNumber c2 = new ComplexNumber(r2, i2);
		if(f == 1) {
		c1.add(c2);
		}
//		c2.print();

//		ComplexNumber c3 = new ComplexNumber(i, r);
		if(f == 2) {
			c1.multiply(c2);
		}
		
		c1.print();
//		c2.print();
		
		
		
		
	}
}
