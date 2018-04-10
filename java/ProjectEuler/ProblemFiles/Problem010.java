public class Problem010 {
	
	public static void main(String[] args) {
        long sum = 0;
        
        //From numbers 1 to 2999999, add primes to sum.
        for(int i = 1; i < 2000000; i++) {
            if(isPrime(i)) {
                sum += i;
            }
        }
        System.out.println("The sum of primes under 2000000 is " + sum);
    }
    
    //Problem 7, 10
    //Check if number is prime.
    public boolean isPrime(int p) {
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