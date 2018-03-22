/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectproblems;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

/**
 * Find the largest prime factor of 600851475143
 * @author weber_000
 */
public class ProblemThree {
    
    public void compute() {
        long seed = 600851475143L;
        long value = seed;
        List<Long> factors = new ArrayList<Long>();
        
        while(value != 1) {
            //Check if value is prime.  If value is prime, add last factor, set value to one, and print result.
            if(value == checkFactors(value, factors)) {
                factors.add(value);
                value /= value;
                System.out.println("The largets prime factor of 600851475143 is " + computeMax(factors));
            }
            value = checkFactors(value, factors);
        }
    }
    
    //Divide value by each number less than sqrt(val).
    //If we get an integer out, the number is a prime factor.
    //Divide by that prime factor and add it to the list
    public long checkFactors(long val, List<Long> fac) {
        for(long i = 2L; i < Math.sqrt(val); i++) {
            if(val % i == 0) {
                fac.add(i);
                val /= i;
                return val;
            }
        }
        //If this loop fails, then val is prime;
        return val;
    }
    
    //Compute max number in list.
    public long computeMax(List<Long> fac) {
        long max = 0;
        for(long f : fac) {
            if(max < f) {
                max = f;
            }
        }
        return max;
    }
}
