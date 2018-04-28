import java.util.Set;
import java.util.HashSet;

public class Problem029 {

     public static void main(String []args){
        
        //Hashset does not insert duplicates.
        Set powers = new HashSet<Long>();
        
        
        //interate over all a^b with a,b ranging from 2 to 100
        //and add to hashset.
        for(int a = 2; a < 101; a++) {
            for(int b = 2; b < 101; b++) {
                powers.add(Math.pow(a,b));
            }
        }
        
        //Print size of hashset.
        System.out.println(powers.size());
    }
}