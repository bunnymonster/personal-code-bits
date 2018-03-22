/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectproblems;

/**
 * Compute the sum of even fibbonaci numbers below 4000000.
 * @author weber_000
 */
public class ProblemTwo {
    
    public void compute() {
        
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
}
