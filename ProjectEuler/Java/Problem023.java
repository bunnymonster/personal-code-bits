import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;

public class Problem023 {

     public static void main(String []args){
        List<Long> abundant = new ArrayList<Long>();
        Set<Long> sums = new HashSet<Long>();
        long grandTotal = 0;
        
        //Find abundant numbers
        for(long i = 1; i < 28124; i++) {
            if(isAbundant(i)) {
                abundant.add(i);
            }
        }
        //Compute all sums of abundant numbers
        for(int a = 0; a < abundant.size(); a++) {
            for(int b = a; b < abundant.size(); b++) {
                sums.add(abundant.get(a)+abundant.get(b));
            }
        }
        //For all integers that could possibly not be
        //a sum of two abundant numbers, check if it is a sum.
        //If not, add to grand Total.
        for(long f = 1; f < 28124; f++) {
            if(!sums.contains(f)) {
                grandTotal += f;
            }
        }
        System.out.println(grandTotal);
     }
     
     /*
     * Compute abundant numbers as follows:
     * Find all divisors and sum them.
     * If the sum is greater than the number, return true.
     * Else return false.
     */
     public static boolean isAbundant(long num) {
         long sum = 0;
         for(int i = 1; i < num; i++) {
             if(num % i == 0) {
                 sum += i;
             }
         }
         if(sum > num) {
             return true;
         }
         return false;
     }
}