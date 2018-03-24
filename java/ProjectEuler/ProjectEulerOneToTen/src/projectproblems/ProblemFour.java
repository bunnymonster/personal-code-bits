/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectproblems;

import java.util.ArrayList;
import java.util.List;

/**
 * Find the largest palindrome made from the product of 2 3 digit numbers
 * @author weber_000
 */
public class ProblemFour {
    
    public void compute() {
    
        List<Integer> palindromeList = new ArrayList<Integer>();
        for(int i = 100; i < 1000; i++) {
            for(int j = 100; j < 1000; j++) {
                if(isPalindrome(i * j)) {
                    palindromeList.add(i * j);
                }
            }
        }
        
        int max = 0;
        for(Integer i : palindromeList) {
            if(i > max) {
                max = i;
            }
        }
        System.out.println("The largest palindrome that is a product of two 3 digit numbers is " + max);
    }
    
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
