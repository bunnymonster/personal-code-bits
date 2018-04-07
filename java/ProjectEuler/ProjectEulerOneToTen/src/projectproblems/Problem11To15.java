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
public class Problem11To15 {
    
    /*In the 20×20 grid below, four numbers along a diagonal line have been marked in red.

    08 02 22 97 38 15 00 40 00 75 04 05 07 78 52 12 50 77 91 08
    49 49 99 40 17 81 18 57 60 87 17 40 98 43 69 48 04 56 62 00
    81 49 31 73 55 79 14 29 93 71 40 67 53 88 30 03 49 13 36 65
    52 70 95 23 04 60 11 42 69 24 68 56 01 32 56 71 37 02 36 91
    22 31 16 71 51 67 63 89 41 92 36 54 22 40 40 28 66 33 13 80
    24 47 32 60 99 03 45 02 44 75 33 53 78 36 84 20 35 17 12 50
    32 98 81 28 64 23 67 10 26 38 40 67 59 54 70 66 18 38 64 70
    67 26 20 68 02 62 12 20 95 63 94 39 63 08 40 91 66 49 94 21
    24 55 58 05 66 73 99 26 97 17 78 78 96 83 14 88 34 89 63 72
    21 36 23 09 75 00 76 44 20 45 35 14 00 61 33 97 34 31 33 95
    78 17 53 28 22 75 31 67 15 94 03 80 04 62 16 14 09 53 56 92
    16 39 05 42 96 35 31 47 55 58 88 24 00 17 54 24 36 29 85 57
    86 56 00 48 35 71 89 07 05 44 44 37 44 60 21 58 51 54 17 58
    19 80 81 68 05 94 47 69 28 73 92 13 86 52 17 77 04 89 55 40
    04 52 08 83 97 35 99 16 07 97 57 32 16 26 26 79 33 27 98 66
    88 36 68 87 57 62 20 72 03 46 33 67 46 55 12 32 63 93 53 69
    04 42 16 73 38 25 39 11 24 94 72 18 08 46 29 32 40 62 76 36
    20 69 36 41 72 30 23 88 34 62 99 69 82 67 59 85 74 04 36 16
    20 73 35 29 78 31 90 01 74 31 49 71 48 86 81 16 23 57 05 54
    01 70 54 71 83 51 54 69 16 92 33 48 61 43 52 01 89 19 67 48

    The product of these numbers is 26 × 63 × 78 × 14 = 1788696.

    What is the greatest product of four adjacent numbers in the same direction (up, down, left, right, or diagonally) in the 20×20 grid?*/
    public void computeProblem11() {
        int[][] gridArray = {{8,2,22,97,38,15,0,40,0,75,4,5,7,78,52,12,50,77,91,8},
        {49,49,99,40,17,81,18,57,60,87,17,40,98,43,69,48,4,56,62,0},
        {81,49,31,73,55,79,14,29,93,71,40,67,53,88,30,3,49,13,36,65},
        {52,70,95,23,4,60,11,42,69,24,68,56,1,32,56,71,37,2,36,91},
        {22,31,16,71,51,67,63,89,41,92,36,54,22,40,40,28,66,33,13,80},
        {24,47,32,60,99,3,45,2,44,75,33,53,78,36,84,20,35,17,12,50},
        {32,98,81,28,64,23,67,10,26,38,40,67,59,54,70,66,18,38,64,70},
        {67,26,20,68,2,62,12,20,95,63,94,39,63,8,40,91,66,49,94,21},
        {24,55,58,5,66,73,99,26,97,17,78,78,96,83,14,88,34,89,63,72},
        {21,36,23,9,75,0,76,44,20,45,35,14,0,61,33,97,34,31,33,95},
        {78,17,53,28,22,75,31,67,15,94,3,80,4,62,16,14,9,53,56,92},
        {16,39,5,42,96,35,31,47,55,58,88,24,0,17,54,24,36,29,85,57},
        {86,56,0,48,35,71,89,7,5,44,44,37,44,60,21,58,51,54,17,58},
        {19,80,81,68,5,94,47,69,28,73,92,13,86,52,17,77,4,89,55,40},
        {04,52,8,83,97,35,99,16,7,97,57,32,16,26,26,79,33,27,98,66},
        {88,36,68,87,57,62,20,72,3,46,33,67,46,55,12,32,63,93,53,69},
        {04,42,16,73,38,25,39,11,24,94,72,18,8,46,29,32,40,62,76,36},
        {20,69,36,41,72,30,23,88,34,62,99,69,82,67,59,85,74,4,36,16},
        {20,73,35,29,78,31,90,1,74,31,49,71,48,86,81,16,23,57,5,54},
        {01,70,54,71,83,51,54,69,16,92,33,48,61,43,52,1,89,19,67,48}};
        
        long maxProduct = 0;
        for(int i = 0; i< 20; i++) {
            for(int j = 0; j < 20; j++) {
                //Horizonal 4-tuples
                if(j < 17) {
                    maxProduct = findMaxProduct(gridArray,i,j,0,1,maxProduct);
                }
                //Vertical 4-tuples
                if(i < 17) {
                    maxProduct = findMaxProduct(gridArray,i,j,1,0,maxProduct);
                }
                //Left Diagonal 4-tuples
                if(i < 17 && j < 17) {
                    maxProduct = findMaxProduct(gridArray,i,j,1,1,maxProduct);
                }
                //Right Diagonal 4-tuples
                if(i < 17 && j > 3) {
                    maxProduct = findMaxProduct(gridArray,i,j,1,-1,maxProduct);
                }
            }
        }
        
        System.out.println("The max product in the grid is " + maxProduct);
    }
    
    /*The sequence of triangle numbers is generated by adding the natural numbers. So the 7th triangle number would be 1 + 2 + 3 + 4 + 5 + 6 + 7 = 28. The first ten terms would be:

    1, 3, 6, 10, 15, 21, 28, 36, 45, 55, ...

    Let us list the factors of the first seven triangle numbers:

     1: 1
     3: 1,3
     6: 1,2,3,6
    10: 1,2,5,10
    15: 1,3,5,15
    21: 1,3,7,21
    28: 1,2,4,7,14,28
    We can see that 28 is the first triangle number to have over five divisors.

    What is the value of the first triangle number to have over five hundred divisors?*/
    public void computeProblem12() {
        
        //First triangle number is 1
        long triangleNumber = 1;
        long increment = 2;
        
        //loop until countDivisors > 500
        while(countDivisors(triangleNumber) < 500) {
            triangleNumber += increment;
            increment++;
        }
        System.out.println(triangleNumber);
    }
    
    
    public void computeProblem14() {
        
        //For 1 to 1000000 compute collatz sequence length.
        //If sequence length of integer k is greater than max,
        //set max to the sequence length of k.
        int maxLength = 1;
        int collatzLength = 1;
        for(int i = 1; i <= 1000000; i++) {
            collatzLength = collatzSequence(i);
            if(maxLength < collatzLength) {
                maxLength = collatzLength;
            }
        }
        System.out.println(maxLength);
    }
    
    //Problem 11
    //Compute maxProduct for four consecutive numbers in array.
    public long findMaxProduct(int[][] array, int firstIndex, int secondIndex, int firstIndexDir, int secondIndexDir, long maxProduct) {
        
        long product = 1;
        for(int i = 0; i < 4; i++) {
            product *= array[firstIndex+i*firstIndexDir][secondIndex+i*secondIndexDir];
        }
        if(product > maxProduct) {
            return product;
        } else {
            return maxProduct;
        }
        
    }
    
    //Problem 12
    //Loop until sqrt(n) and add 2 for each pair of factors.
    public long countDivisors(long n) {
        
        long count = 0;
        long end = (long)Math.sqrt(n);
        for(int i = 1; i < end; i++) {
            if(n % i == 0) {
                count += 2;
            }
        }
        //if n is a perfect square, subtract 1 as we overcounted.
        if(end * end == n) {
            count--;
        }
        return count;
    }
    
    //Problem 14. compute collatz sequence length for given n.
    //Collatz sequence defined as follows:
    //n -> n/2 if n even
    //n -> 3*n+1 if n odd.
    public int collatzSequence(int n) {
    
        int sequenceLen = 1;
        long value = n;
        while(value != 1) {
            if(value % 2 == 0) {
                value = value/2;
            } else {
                value = 3*value + 1;
            }
            sequenceLen++;
        }
        return sequenceLen;
    }
}
