public class Problem040 {

    public static void main(String []args){
        System.out.println(champernowneDigit(1)*
        champernowneDigit(10)*
        champernowneDigit(100)*
        champernowneDigit(1000)*
        champernowneDigit(10000)*
        champernowneDigit(100000)*
        champernowneDigit(1000000));
    }
    
    //Get nth digit of champernowne constant
    public static int champernowneDigit(int n) {
        int count = 0;
        int number = 1;
        int digit = 0;
        //while count < n,
        //iterate through digits of numbers 1,2,3,... etc
        //when we get the nth digit in that sequence, return it.
        while(count <= n) {
            String numStr = String.valueOf(number);
            for(int i = 0; i < numStr.length(); i++) {
                count++;
                if(count == n) {
                    digit = Integer.parseInt(numStr.substring(i,i+1));
                }
            }
            number++;
        }
        return digit;
    }
}