import java.math.BigInteger;

public class Problem057 {

     public static void main(String []args){
        int count = 0;
        BigInteger a = BigInteger.valueOf(1);
        BigInteger b = BigInteger.valueOf(1);
        BigInteger tmp = BigInteger.valueOf(0);
        
        //This is similar to a fibonacci sequence
        //with the recurrence relation
        //a_n+1 = a_n+2*b_n and b_n+1=a_n+b_n
        for(int i = 1; i < 1000; i++) {
            tmp = a;
            a = a.add(b.multiply(BigInteger.valueOf(2)));
            b = tmp.add(b);

            //If numerator is longer than denominator, add 1 to count.
            if(a.toString().length() > b.toString().length()) {
                count++;
            }
        }
        System.out.println(count);
     }
}