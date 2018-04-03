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
public class Problem6To10 {
    
    /**
    * Compute the difference of the square of sums and sum of squares of the first 1-- natural numbers.
    */
    public void computeProblem6() {
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
    
    /**
    * Find the 10001st prime
    * @author weber_000
    */
    public void computeProblem7() {
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
    
    /**
    *The four adjacent digits in the 1000-digit number that have the greatest product are 9 × 9 × 8 × 9 = 5832.

    73167176531330624919225119674426574742355349194934
    96983520312774506326239578318016984801869478851843
    85861560789112949495459501737958331952853208805511
    12540698747158523863050715693290963295227443043557
    66896648950445244523161731856403098711121722383113
    62229893423380308135336276614282806444486645238749
    30358907296290491560440772390713810515859307960866
    70172427121883998797908792274921901699720888093776
    65727333001053367881220235421809751254540594752243
    52584907711670556013604839586446706324415722155397
    53697817977846174064955149290862569321978468622482
    83972241375657056057490261407972968652414535100474
    82166370484403199890008895243450658541227588666881
    16427171479924442928230863465674813919123162824586
    17866458359124566529476545682848912883142607690042
    24219022671055626321111109370544217506941658960408
    07198403850962455444362981230987879927244284909188
    84580156166097919133875499200524063689912560717606
    05886116467109405077541002256983155200055935729725
    71636269561882670428252483600823257530420752963450

    Find the thirteen adjacent digits in the 1000-digit number that have the greatest product. What is the value of this product?
     */
    public void computeProblem8() {
        //Create string representing number.
        String numStr = "73167176531330624919225119674426574742355349194934\n" +
            "96983520312774506326239578318016984801869478851843\n" +
            "85861560789112949495459501737958331952853208805511\n" +
            "12540698747158523863050715693290963295227443043557\n" +
            "66896648950445244523161731856403098711121722383113\n" +
            "62229893423380308135336276614282806444486645238749\n" +
            "30358907296290491560440772390713810515859307960866\n" +
            "70172427121883998797908792274921901699720888093776\n" +
            "65727333001053367881220235421809751254540594752243\n" +
            "52584907711670556013604839586446706324415722155397\n" +
            "53697817977846174064955149290862569321978468622482\n" +
            "83972241375657056057490261407972968652414535100474\n" +
            "82166370484403199890008895243450658541227588666881\n" +
            "16427171479924442928230863465674813919123162824586\n" +
            "17866458359124566529476545682848912883142607690042\n" +
            "24219022671055626321111109370544217506941658960408\n" +
            "07198403850962455444362981230987879927244284909188\n" +
            "84580156166097919133875499200524063689912560717606\n" +
            "05886116467109405077541002256983155200055935729725\n" +
            "71636269561882670428252483600823257530420752963450";
        
        //remove newlines
        numStr = numStr.replace("\n", "");
        
        //convert String to int array for easier computing
        int[] numArray = new int[numStr.length()];
        for(int i = 0; i < numArray.length; i++) {
            numArray[i] = Character.getNumericValue(numStr.charAt(i));
        }
        
        int maxProduct = 0;
        int startIndex = 0;
        //For each 13 digit string, compute product of digits.  
        //If this product is greater than the current max product,
        //set the max product to this product
        for(int i = 0; i < numArray.length-13 + 1; i++) {
            int thirteenDigitProduct = 1;
            for(int j = 0; j < 13; j++) {
                int data = numArray[i + j];
                thirteenDigitProduct *= numArray[i + j];
            }
            if(thirteenDigitProduct > maxProduct) {
                maxProduct = thirteenDigitProduct;
                startIndex = i;
            }
        }
        
        System.out.println("The largest 13 digit product is " + maxProduct + ", starting at index " + startIndex);
    }
    
    /**
    * A Pythagorean triplet is a set of three natural numbers, a greater than b greater than c, for which,
    *
    * a2 + b2 = c2
    * For example, 32 + 42 = 9 + 16 = 25 = 52.
    *
    * There exists exactly one Pythagorean triplet for which a + b + c = 1000.
    * Find the product abc.
    */
    public void computeProblem9() {
        //The sum of a, b, and c is 1000
        int sum = 1000;
        
        //a must be less than or equal sum/3
        for(int a = 1; a < sum/3; a++) {
            
            //b must be greater than a and less than sum/2
            for(int b = a + 1; b < sum/2; b++) {
                
                //c is the remaining number needed to reach sum.  
                //Check if a, b, and c form a pythagorean triple.
                //If so, print their produce.
                int c = sum - a - b;
                if(a*a + b*b == c*c) {
                    System.out.println("The product is " + a*b*c + " for the integers a=" + a + ", b=" + b + ", and c=" + c);
                }
            }
        }
    }
    public void computeProblem10() {
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
