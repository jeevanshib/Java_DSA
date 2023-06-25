package ObjectOrientedProgramming;

public class fractionUse {

	public static void main(String[] args) {
		fraction f1 = new fraction(20,30);
		f1.print();
		//2/3
		f1.setNumerator(12);
		//4/1
		int d = f1.getNumerator();
		System.out.println(d);
		f1.print();
		
		f1.setNumerator(10);
		f1.setDenominator(30);
		//1/3
		f1.print();
		
		fraction f2 = new fraction(3,4);
		f1.add(f2);
		f1.print();
		//f1=13/12;
		f2.print();
		//3/4
		
		fraction f3 = new fraction(4,5);
		f3.multiply(f2);
		f3.print();
		//3/5
		f2.print();
		//4/5
		fraction f4 = fraction.add(f1, f3);
		f1.print();
		f3.print();
		f4.print();
	}

}
