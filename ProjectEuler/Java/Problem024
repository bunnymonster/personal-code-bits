import java.util.List;
import java.util.ArrayList;

public class Problem024 {

     public static void main(String []args){
        List<String> digitList = new ArrayList<String>();
        String finalString = "";
        
        //numDigits determines number of digits to permute
        //position is lexicographic position.
        long position = 1000000;
        long numDigits = 10;
        
        //create digit list
        for(int i=0; i < numDigits; i++) {
            digitList.add(i+"");
        }
        
        //Set counter to 1 less than number of digits.
        //counter is used to determine the factorial of the remaining digits
        long counter = numDigits-1;

        //index of digit in symbol list
        long digitIndex = 0;

        //while we still have digits to be determined, loop
        while(counter > 0) {

            //while position is greater than 0,
            //repreatedly subtract counter! from it, incrementing index each time.
            //when counter! is greater than position,
            //we have found the position of the next digit.
            //Add symbol at that index to string and remove from list.
            while(position > 0) {
                if(factorial(counter) < position) {
                    position -= factorial(counter);
                    System.out.println(position);
                    digitIndex++;
                } else {
                    System.out.println(digitList.get((int)(digitIndex)));
                    finalString += digitList.get((int)(digitIndex));
                    digitList.remove((int)(digitIndex));
                    break;
                }
            }
            //reset digitIndex to 0 and decrement counter
            digitIndex = 0;
            counter--;   
        }
        //Add in last remaining symbol in digitList
        finalString += digitList.get(0);
        System.out.println(finalString);
     }
     
     public static long factorial(long num) {
         if(num == 1 || num == 0) {
             return 1;
         }
         return num*factorial(num-1);
     }
}