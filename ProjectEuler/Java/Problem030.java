public class Problem030 {

     public static void main(String []args){
        int result = 0;
        
        //1 is not included as it is not a sum.
        //295245 = 5*9^5, the sum of the digits in 99999.
        //As 9^5 is a 5 digit number itself, 
        //this seems like a reasonable stopping point.
        for(int i=2; i< 295245; i++) {
            int sumOfPowers = 0;
            int number = i;
            while(number > 0) {
                int digit = number % 10;
                number /= 10;
                
                sumOfPowers += Math.pow(digit,5);
            }
            if(sumOfPowers == i) {
                result += i;
            }
        }
        System.out.println(result);
     }
}