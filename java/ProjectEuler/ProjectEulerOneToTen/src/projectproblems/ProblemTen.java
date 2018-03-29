/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectproblems;

/**
 * The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
 *
 * Find the sum of all the primes below two million.
 * @author weber_000
 */
public class ProblemTen {
    
    public void compute() {
        
        long sum = 0;
        
        //From numbers 1 to 2999999, add primes to sum.
        for(long i = 1; i < 2000000; i++) {
            if(isPrime(i)) {
                sum += i;
            }
        }
        System.out.println("The sum of primes under 2000000 is " + sum);
    }
    
    public boolean isPrime(long prime) {
        if(prime < 2) {return false;}
        if(prime == 2) {return true;}
        //For numbers from 2 to sqrt(prime)+1 check if prime mod that number is 0
        //If so, the number is not prime.
        for (long i = 2; i < Math.pow(prime, 0.5) + 1; i++) {
            if(prime % i == 0) {
                return false;
            }
        }
        return true;
    }
}
