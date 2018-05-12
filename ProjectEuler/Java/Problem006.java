public class Problem006 {
	
	/**
    * Compute the difference of the square of sums and sum of squares of the first 100 natural numbers.
    */
    public static void main(String[] args) {
        //1^2+2^2+...+100^2
        int sumOfSquares = 0;
        //(1+2+...+100)^2
        int sumOfNaturals = 0;

        for(int i = 1; i < 101; i++) {
            sumOfNaturals += i;
            sumOfSquares += i * i;
        }
        
        int result = sumOfNaturals * sumOfNaturals - sumOfSquares;
        
        System.out.println("The difference between the square of sums and sum of squares of the numbers 1 to 100 is " + result);
    }
}