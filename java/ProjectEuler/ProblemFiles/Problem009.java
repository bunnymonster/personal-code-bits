public class Problem009 {
	
	/**
    * A Pythagorean triplet is a set of three natural numbers, a less than b less than c, for which,
    *
    * a^2 + b^2 = c^2
    * For example, 3^2 + 4^2 = 9 + 16 = 25 = 5^2.
    *
    * There exists exactly one Pythagorean triplet for which a + b + c = 1000.
    * Find the product abc.
    */
    public static void main(String[] args) {
        //The sum of a, b, and c is 1000
        int sum = 1000;
        
        //a must be less than or equal sum/3
        for(int a = 1; a < sum/3; a++) {
            
            //b must be greater than a and less than sum/2
            for(int b = a + 1; b < sum/2; b++) {
                
                //c is the remaining number needed to reach sum.  
                //Check if a, b, and c form a pythagorean triple.
                //If so, print their product.
                int c = sum - a - b;
                if(a*a + b*b == c*c) {
                    System.out.println("The product is " + a*b*c + " for the integers a=" + a + ", b=" + b + ", and c=" + c);
                }
            }
        }
    }
}