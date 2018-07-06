public class Problem027 {

    public static void main(String []args){
        //highA and highB are to track the coefficients that produce
        //the leading polynomial.
        int maxPrimes = 0;
        int highA = 0;
        int highB = 0;
        for(int a = -1000; a < 1001; a++) {
            for(int b = -1000; b < 1001; b++) {
                int newMax = countPrimes(a,b);
                if(maxPrimes < newMax) {
                    maxPrimes = newMax;
                    highA = a;
                    highB = b;
                }
            }
        }
        System.out.println("The coefficents a="+highA+" , b="+highB+
            " produce a sequence of "+maxPrimes+" primes and have a product of"+
            highA*highB);
    }
    
    //while n^2+an+b is prime, increment prime count.
    public static int countPrimes(int a, int b) {
        int n=0;
        while(isPrime(Math.abs(n*n+a*n+b))) {
            n++;
        }
        return n;
    }
    
    //Find primes via mod all numbers less than sqrt(num)+1
    public static boolean isPrime(int num) {
        if(num < 2) {
            return false;
        }
        for(int i = 2; i < Math.pow(num,0.5)+1; i++) {
            if(num % i == 0) {
                return false;
            }
        }
        return true;
    }
}