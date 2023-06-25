package ObjectOrientedProgramming;

public class fraction {
	private int Numerator;
	private int Denominator;
	public fraction(int Numerator, int Denominator) {
		this.Numerator= Numerator;
		if(Denominator == 0) {
			System.out.println("Error");
		}
		this.Denominator= Denominator;
		simplify();
	}
	
	private void simplify() {
		int gcd = 1;
		int smaller = Math.min(Numerator, Denominator);
		for(int i = 2 ; i<=smaller; i++) {
			if(Numerator % i ==0 && Denominator % i == 0) {
				gcd = i;
			}
		}
		Numerator = Numerator/gcd;
		Denominator= Denominator/gcd;
		
	}
		public int getNumerator() {
			return Numerator;
			}
		public int getDenominator() {
			return Denominator;
		}
		public void setNumerator(int n) {
					this.Numerator = n;
					simplify();
				}
		
		public void setDenominator(int d) {
			if(d==0) {
				System.out.println("Error");
			}
			this.Denominator = d;
			simplify();
		}
		public void print() {
			if(Denominator==1) {
				System.out.println(Numerator);
			}
			else {
				System.out.println(Numerator + "/" + Denominator);
			}
		}
		
		public static fraction add(fraction f1, fraction f2) {
			int newNum = f1.Numerator*f2.Denominator +f2.Numerator+f1.Denominator;
			int newDem = f1.Denominator*f2.Denominator;
			fraction f = new fraction(newNum, newDem);
			return f;
			
		}
		public void add(fraction f2) {
			this.Numerator = this.Numerator*f2.Denominator + this.Denominator * f2.Numerator;
			this.Denominator = this.Denominator*f2.Denominator;
			simplify();
		}
		
		public void multiply(fraction f2) {
			this.Numerator=this.Numerator*f2.Numerator;
			this.Denominator=this.Denominator*f2.Denominator;
			simplify();
		}
			
}
