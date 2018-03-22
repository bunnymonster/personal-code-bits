/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectproblems;

/**
 * Conpute the sum of all multiples of 3 or 5 from 1 to 1000
 * @author weber_000
 */
public class ProblemOne {
    
    public void compute() {
        int sum = 0;
        for(int i = 1; i < 1001; i++) {
            if(i % 3 == 0 || i % 5 == 0) {
                sum += i;
            }
        }
        System.out.println("The sum of multiples of 3 and 5 below 1000 is " + sum);
    }
}
