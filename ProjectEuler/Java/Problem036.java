public class Problem036 {

    public static void main(String []args){
        int sum = 0;
        for(int i = 1; i < 1000000; i += 2) {
            if(isPalindrome(Integer.toString(i, 10)) 
            && isPalindrome(Integer.toString(i, 2))) {
                sum += i;
            }
        }
        System.out.println("The sum of all numbers which are palindromes " +
        "in both base 2 and base 10 is " + sum);
    }
    
    //Checks if a number is a palindrome and returns appropriate boolean value
    public static boolean isPalindrome(String s) {
        
        String strReverse = "";
        //Traverse str in reverse order and append each char to strReverse
        for(int i = s.length()-1; i > -1; i--) {
            strReverse += s.charAt(i);
        }
        if(s.equals(strReverse)){
            return true;
        } else {
            return false;
        }
    }
}