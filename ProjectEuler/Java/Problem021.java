public class Problem021 {

    public static void main(String []args){
        long total = 0;
        for(long i = 1; i < 10000; i++) {
            if(isAmicable(i)) {
                total += i;
            }
        }

        System.out.println(total);
    }

    public static boolean isAmicable(long num) {
        long sum = 0;
        long sum2 = 0;

        //Calculate sum of first number's divisors
        for(long i = 1; i < num; i++) {
            if(num % i == 0) {
                sum += i;
            }
        }

        //Calculate the sum of the above total's divisors
        for(long i = 1; i < sum; i++) {
            if(sum % i == 0) {
                sum2 += i;
            }
        }
        
        //If the second sum is equal to the original number it is amicable
        //If the sum is equal to the second sum, then the number is perfect
        //So we exclude it.
        if(sum2 == num && sum != sum2) {
            return true;
        }
        return false;
    }
}