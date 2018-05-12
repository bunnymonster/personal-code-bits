public class Problem007 {
	
	/**
    * Find the 10001st prime
    * @author weber_000
    */
    public static void main(String[] args) {
        //Compute and return nth prime.
    //Each time a prime is encountered add 1 to total number of primes.
    //When desired prime is reached return that prime.
 
        int numPrimes = 0;
        int prime = 1;
        while(numPrimes < 10001) {
            prime++;
            if(isPrime(prime)) {
                numPrimes++;
            }
        }
        System.out.println("The 10001st prime is "+prime);
    }

    //Problem 7, 10
    //Check if number is prime.
    public static boolean isPrime(int p) {
        //Smallest prime is 2
        if(p<2) {return false;}
        if(p==2) {return true;}
        //Check all numbers up to sqrt(p) if none divide p, then p is prime.
        for(int i = 2; i<Math.pow(p, 0.5) + 1; i++) {
            if(p % i == 0) {
                return false;
            }
        }
        return true;
    }
}