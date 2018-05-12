import java.math.BigInteger;

public class Problem025 {

    public static void main(String []args){
        
        //Assign starting values to fibonacci sequence
        //and tracking variables for loop
        BigInteger a = BigInteger.valueOf(1);
        BigInteger b = BigInteger.valueOf(1);
        BigInteger temp = BigInteger.valueOf(0);
        int numberLength = 0;
        int index = 1;
        
        while(numberLength < 1000) {
            //Compute next fibonacci number
            temp = b;
            b = a.add(b);
            a = temp;
            
            //index starts at 1, tracks value of a.
            numberLength = a.toString().length();
            index++;
        }
        
        //Print index of first 1000 digit fibonacci number
        System.out.println(index);
    }
}