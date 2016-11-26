package utils;

public class Math {

	public static int factorial(int n){
		if (n==0) { return 1; }
		return n * factorial(n-1);
	}
	
	public static int loopfactorial(int n) {
		int num = 1;
		if (n==0) { return 1;}
		for (int i=1 ; i<=n; i++) {
			num = num*i;
		}
		return num; 
		
	}		
	}