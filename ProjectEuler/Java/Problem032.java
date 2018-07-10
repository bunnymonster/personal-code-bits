import java.util.Set;
import java.util.HashSet;

public class Problem032 {

    public static void main(String []args){
        
        Set<Long> products = new HashSet<Long>();
        long total = 0;
        
        for(long a=2; a < 100; a++) {
            
            long begin = (a > 9) ? 123 : 1234;
            long end = (a > 9) ? 987 : 9876;
            
            for(long b = begin; b < end; b++) {
                long number = concat(a,concat(b,a*b));
                if(number > Math.pow(10,8) && number < Math.pow(10,9) &&
                isPandigitalProduct(number)) {
                    products.add(a*b);
                }
            }
        }
        
        for(Long sum : products) {
            total += sum;
        }
        System.out.println(total);
    }
    
    public static boolean isPandigitalProduct(long n) {
        //Register variable is a number representing 9 bits
        int register = 0;
        //Iterate through digits
        while(n>0) {
            //Set <digit-1>th rightmost bit to 1
            //eg the digit 2 turns 010000000 to 010000010
            register = register | (1 << (int)(n % 10) - 1);
            if(register == 0) {
                return true;
            }
            //get next digit
            n /= 10;
        }
        //If all 9 digits have appeared, 9 bits will be set giving
        //111111111 in binary, or 511 in decimal
        return register == 511;
    } 
    
    //Concatenate the two numbers x and y to x|y
    public static long concat(long x, long y) {
        long rhs = y;
        while(y > 0) {
            x *= 10;
            y /= 10;
        }
        return x + rhs;
    }
}