public class Problem004 {
	
	/*
    * Compute the largest palindrome that is a product of numbers under 1000 
    */
    public static void main(String[] args) {
        
        int max = 0;
        for(int i = 100; i < 1000; i++) {
            for(int j = 100; j < 1000; j++) {
                if(isPalindrome(i * j)) {
                    if(i*j > max) {
                        max = i*j;
                    }
                }
            }
        }
        
        System.out.println("The largest palindrome that is a product of two 3 digit numbers is " + max);
    }

    //Checks if a number is a palindrome and returns appropriate boolean value
    public static boolean isPalindrome(Integer number) {
        
        String str = number.toString();
        String strReverse = "";
        //Traverse str in reverse order and append each char to strReverse
        for(int i = str.length()-1; i > -1; i--) {
            strReverse += str.charAt(i);
        }
        if(str.equals(strReverse)){
            return true;
        } else {
            return false;
        }
    }
}