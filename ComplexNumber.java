package ObjectOrientedProgramming;

public class ComplexNumber {
	
	private int Real;
	private int Imaginary;
	public ComplexNumber(int Real, int Imaginary) {
		this.Real= Real;
		this.Imaginary= Imaginary;
	}
	
	public int getReal() {
		return Real;
	}
	
	public int getImaginary() {
		return Imaginary;
	}
	
	public void setReal(int r) {
		this.Real = r;
	}
	
	
	public void setImaginary(int i) {
		this.Imaginary = i;
	}
	
	public void add(ComplexNumber c2) {
		this.Real = this.Real+c2.Real;
		this.Imaginary = this.Imaginary+c2.Imaginary;
	}
	
	public void multiply(ComplexNumber c2)
    {
      int r = this.Real*c2.Real-this.Imaginary*c2.Imaginary;          
      this.Imaginary=this.Real*c2.Imaginary+this.Imaginary*c2.Real;
      this.Real =r;
     
    }
	
	public void print() {
		System.out.println(Real + "+" + Imaginary +"i");
	}
	

//	public static ComplexNumber add(ComplexNumber c1, ComplexNumber c2) {
//		int nr = c1.Real+c2.Real;
//		int ni = c1.Imaginary+c2.Imaginary;
//		ComplexNumber c = new ComplexNumber(nr, ni);
//		return c;
//	}
	
	
}

