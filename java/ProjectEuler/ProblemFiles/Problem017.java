public class Problem017 {

     public static void main(String []args){
        
        int wordSum = 0;
        for(int i = 1; i <= 1000; i++) {
            wordSum += getNumberWordLength(i);
        }
        System.out.println(wordSum);
     }
     
     public static int getNumberWordLength(int n) {
        //Declare arrays storing lengths of number words
        //twentyLength stores lengths of numbers 0 to 19
        int[] twentyLength = {0,3,3,5,4,4,3,5,5,4,3,6,6,8,8,7,7,9,8,8};
        //tensLength stores lengths of 20, 30, 40, ... 80, 90
        int[] tensLength = {6,6,5,5,5,7,6,6};
        int hundredLength = 7;
        int wordLength = 0;
        
        //if n is 1000 return length of "one thousand".
        if(n == 1000) {
           return 11;
        }
        
        //Break input n into hundreds place, tens place and ones place.
        int hundredsPlace = (n - (n % 100))/100;
        n = (n % 100);
        int tensPlace = (n - (n % 10))/10;
        n = (n % 10);
        int onesPlace = n;
        
        //Add length of hundreds place.
        if(hundredsPlace > 0 && hundredsPlace < 10) {
            wordLength += twentyLength[hundredsPlace] + hundredLength;
            //If number doesnt end in 00, add "and".
            if(tensPlace > 0 || onesPlace > 0) {
                wordLength += 3;
            }
        }
        
        //Last two digits are a number greater or equal to 20
        if(tensPlace > 1) {
            wordLength += tensLength[tensPlace - 2];
            wordLength += twentyLength[onesPlace];
        } 
        //Else last two digits are either Xteen or 0 and digit.
        else {
            wordLength += twentyLength[tensPlace*10 + onesPlace];
        }
        
        return wordLength;
     }
}