/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectproblems;


/**
 *
 * @author weber_000
 */
public class Problem1To5 {
    
    /**
    * Conpute the sum of all multiples of 3 or 5 from 1 to 1000
    */
    public void computeProblem1() {
        int sum = 0;
        for(int i = 1; i < 1001; i++) {
            if(i % 3 == 0 || i % 5 == 0) {
                sum += i;
            }
        }
        System.out.println("The sum of multiples of 3 and 5 below 1000 is " + sum);
    }
    
    /**
    * Compute the sum of even fibbonaci numbers below 4000000.
    */
    public void computeProblem2() {
        
        int sum = 0;
        int fibOne = 1;
        int fibTwo = 2;
        
        while(fibOne < 4000000) {
            //if fibOne is even, add to sum
            if(fibOne % 2 == 0) {
                sum += fibOne;
            }
            //compute next fibbonaci number
            int temp = fibOne + fibTwo;
            fibOne = fibTwo;
            fibTwo = temp;        
        }
        
        System.out.println("The sum of the even fibbonaci numbers under 4000000 is " + sum);    
    }
    
    /**
    * Find the largest prime factor of 600851475143
    */
    public void computeProblem3() {
        long seed = 600851475143L;
        long value = seed;
        long maxFactor = 1;
        
        outer:
        while(value != 1) {
            //Check if value is prime.  If value is prime, compare to max.
            for(long i = 2L; i < Math.sqrt(value); i++) {
                if(value % i == 0) {
                    if(maxFactor < i) {
                        maxFactor = i;
                    }
                    value /= i;
                    continue outer;
                }
            }
            //If this loop fails, then val is prime;
            if(maxFactor < value) {
                maxFactor = value;
            }
            value /= value;
        }
        
        System.out.println("The largets prime factor of 600851475143 is " + maxFactor);
    }
    
    /*
    * Compute the largest palindrome that is a product of numbers under 1000 
    */
    public void computeProblem4() {
        
        int max = 0;
        for(int i = 100; i < 1000; i++) {
            for(int j = 100; j < 1000; j++) {
                if(isPalindrome(i * j)) {
                    if(i*j > max) {
                        max = i*j;
                    }
                }
            }
        }
        
        System.out.println("The largest palindrome that is a product of two 3 digit numbers is " + max);
    }
    
    /**
    * Print smallest common multiple of numbers 1 to 20.
    * @author weber_000
    */
    public void computeProblem5() {
        //Set lcm to 1
        int lcm = 1;
        for(int i = 1; i < 20; i++) {
            //For each number 1 through 20 do the following:
            //Set a variable called addend equal to lcm.
            //While lcm is not divisible by the number, add the addend to the lcm.
            int addend = lcm;
            while(lcm % i != 0) {
                lcm += addend;
            }
        }
        
        System.out.println("The smallest common multiple of 1 throuhg 20 is " + lcm);
    }
    
    //Problem 4
    //Checks if a number is a palindrome and returns appropriate boolean value
    public boolean isPalindrome(Integer number) {
        
        String str = number.toString();
        String strReverse = "";
        //Traverse str in reverse order and append each char to strReverse
        for(int i = str.length()-1; i > -1; i--) {
            strReverse += str.charAt(i);
        }
        if(str.equals(strReverse)){
            return true;
        } else {
            return false;
        }
    }
}
