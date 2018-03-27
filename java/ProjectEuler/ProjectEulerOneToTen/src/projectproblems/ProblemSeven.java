/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectproblems;

import java.util.ArrayList;
import java.util.List;

/**
 * Find the 10001st prime
 * @author weber_000
 */
public class ProblemSeven {
    
    public void compute() {
        
        System.out.println("The 10001st prime is "+nthPrime(10001));
    }
    
    //Compute and return nth prime.
    //Each time a prime is encountered add 1 to total number of primes.
    //When desired prime is reached return that prime.
    public int nthPrime(int n) {   
        int numPrimes = 0;
        int prime = 1;
        while(numPrimes < n) {
            prime++;
            if(isPrime(prime)) {
                numPrimes++;
            }
        }
        return prime;
    }
    
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
