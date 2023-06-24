package Recursion;

public class factorial {
	
	public static int fact(int n) {
		// Base Case
		if(n==0) {
			return 1;
		}
		
		//
		int SmallerAns = fact (n-1);
		return n * SmallerAns;
	}
	
	public static void main(String[] args) {
		int n = 6;
		int ans = fact(n);
		System.out.println(ans);

	}

}
