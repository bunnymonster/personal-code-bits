public class Problem002 {
    /**
    * Compute the sum of even fibbonaci numbers below 4000000.
    */
    public static void main(String[] args) {
        
        int sum = 0;
        int fibOne = 1;
        int fibTwo = 2;
        
        while(fibOne < 4000000) {
            //if fibOne is even, add to sum
            if(fibOne % 2 == 0) {
                sum += fibOne;
            }
            //compute next fibbonaci number
            int temp = fibOne + fibTwo;
            fibOne = fibTwo;
            fibTwo = temp;        
        }
        
        System.out.println("The sum of the even fibbonaci numbers under 4000000 is " + sum);    
    }
}