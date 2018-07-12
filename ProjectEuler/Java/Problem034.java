public class Problem034 {

    public static void main(String []args){
        //10 is a lower bound because it is the first number with more than 1
        //digit.
        //The upper bound is 9!*7 since 9!*8 and anything higher will be
        //less thanthe number formed from the corresponding number of 9's
        int grandTotal = 0;
        for(int n = 10; n < 2540161; n++) {
            if(isFactorialSum(n)) {
                grandTotal += n;
            }
        }
        System.out.println(grandTotal);
    }
    
    public static boolean isFactorialSum(int n) {
        //Hardcoded array of factorials of digits 0 - 9 so we
        //don't need to compute factorials millions of times.
        int[] factorials = {1,1,2,6,24,120,720,5040,40320,362880};
        int sum = 0;
        int tmp = n;
        //If the sum is ever greater than n, stop adding and return false.
        //Else add all factorials of digits into sum. return 
        while(n>0) {
            if(sum > tmp) {
                return false;
            }
            sum += factorials[(int)(n % 10)];
            n /= 10;
        }
        return sum == tmp;
    }
}