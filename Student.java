package ObjectOrientedProgramming;

public class Student {
	public String name;
	//Access Modifiers
	//Default (Kuch nhi likho, can be accessible in same package)
	//public (put public int se pahele it will be accessible everywhere even in other package 
	//import karne ki zroorat nahi hogi)
	//private(put private int se pahele taaki woh kahi aur access naa ho paae, 
	//it will only be accessed with opening and closing curly brackets)
	private int rollNum;
	
	
	private static int numStudents;
	
	public static int getnumStudents() {
		return numStudents;
	}
	
	 //Contructor
	public Student(String n, int rn) {
		name = n;
		rollNum= rn;
		numStudents++;
	}
	public void print() {
		System.out.println( name + ": " + rollNum);
	}
	
	
	
	public void setrollNum(int rn) {
		if(rn<=0) {
			return;
		}
		rollNum = rn;
	}
	public int getrollNum() {
		return rollNum;
	}
	//Key words
	//Final : It is use to finalize the value for example if we use 
	//private int final rollNum so we cannot change the rollnumber afterwards it will be final
	
	//This: This keyword is use if some value of name is same for ex there is a function where we use 
	//name and rollNum so local varialble is wriiten as this.name = name and this.rollNum = rollNum
	//RHS is Global Variable while LHS is Local variable

}
