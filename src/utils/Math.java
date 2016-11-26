package utils;

public class Math {

	public static long factorial(long n){
		if (n<=0) { return 1; }
		return n * factorial(n-1);
	}
	
	public static long loopfactorial(long n) {
		long num = 1;
		if (n<=0) { return 1;}
		for (long i=1 ; i<=n; i++) {
			num = num*i;
		}
		return num; 
		
	}		
	}