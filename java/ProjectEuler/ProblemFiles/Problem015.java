public class Problem015 {
	
	/*
	* Compute the number of paths on 20x20 grid 
	* from the upper left to the lower right corners
	* where the only directions are right and down.
	*/
	public static void main(String[] args) {
		long value = factorial(20)/((long)Math.pow(factorial(10),2));
		System.out.println(value);
	}

	public static long factorial(int n) {
		if(n == 1) {
			return 1;
		} else {
			return n*factorial(n-1);
		}
	}
}