import java.math.BigInteger;

public class Problem020 {

    public static void main(String[] args){

        //Compute factorial of 100.
        BigInteger result = factorial(BigInteger.valueOf(100));

        //Turn result into string.
        String resultString = result.toString();
        int digitSum = 0;

        //For each digit in 100!, parse string/digit
        //into a number and add it to the total.
        for(int i = 0; i < resultString.length(); i++) {
            digitSum += Integer.parseInt(resultString.substring(i, i+1));
        }

        //Print resulting digit sum.
        System.out.println(digitSum);
    }

        //Compute factorial of BigInteger n.
        public static BigInteger factorial(BigInteger n) {
            if(n.compareTo(BigInteger.valueOf(1)) == 0) {
                return n;
            } else {
                return n.multiply(factorial(BigInteger.valueOf(n.intValue() - 1)));
            }
        }
}