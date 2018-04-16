import java.math.BigInteger;

//Find the sum of the digits of 2^1000
public class Problem016 {
	
	public static void main(String[] args) {
        
        BigInteger number = BigInteger.valueOf(1);
        BigInteger TWO = BigInteger.valueOf(2);
        long digitSum = 0;

        //Multiply number by 2 1000 times
        for(int i = 0; i < 1000; i++) {
            number = number.multiply(TWO);
        }
        //For each digit in number, add it to digitSum
        for(char digit : number.toString().toCharArray()) {
            digitSum += Long.parseLong(""+digit);
        }
        System.out.println(digitSum);
        
	}
}