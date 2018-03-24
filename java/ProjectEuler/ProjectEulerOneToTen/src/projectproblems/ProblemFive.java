/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectproblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Print smallest common multiple of numbers 1 to 20.
 * @author weber_000
 */
public class ProblemFive {
    
    public void compute() {
        
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
}
