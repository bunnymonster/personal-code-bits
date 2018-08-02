/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testproject;

import java.util.List;
import java.util.ArrayList;
import java.util.BitSet;

public class TestProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String []args){
        System.out.println(primeSeive(100));
    }
    
    public static List<Integer> primeSeive(int n) {
        BitSet primes = new BitSet(n+1);
        List<Integer> primeList = new ArrayList<Integer>();
        
        primes.set(2,n);
        int lastPrimeBit = 2;
        while(lastPrimeBit != -1) {
            for(int i = 2; i <= n/lastPrimeBit; i++) {
                primes.clear(lastPrimeBit * i);
                
            }
            lastPrimeBit = primes.nextSetBit(lastPrimeBit + 1);
            
        }
        
        for(int i = 0; i <= n; i++) {
            if(primes.get(i)) {
                primeList.add(i);
            }
        }
        return primeList;
    }
    
}
