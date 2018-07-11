public class Problem033 {

    public static void main(String []args){
        
        int numerator = 1;
        int denominator = 1;
        
        //For a from 1 to 9
        for(int a=1; a<=9;a++) {
            //b  =a+1 to 9, since a < b
            for(int b=a+1;b<=9;b++) {
                //Other digit can be anything from 1 to 9
                for(int i=1;i<=9;i++) {
                    //Cross Product equality of fractions
                    if(9*a*b == 10*a*i-b*i || 9*a*b == 10*b*i-a*i) {
                        numerator *= a;
                        denominator *= b;
                    }
                }
            }
        }
        //Reduce the denominator of fraction.
        int result = denominator /= gcd(numerator, denominator);
        System.out.println(result);
    }
    
    //GCD Calculation via Euclid's algorithm
    public static int gcd(int a, int b) {
        if(a > b) {
            if(a % b == 0) {
                return b;
            } else {
                return gcd(b, a % b);
            }
        } else if(a == b) {
            return a;
        } else {
            if(b % a == 0) {
                return a;
            } else {
                return gcd(a, b % a);
            }
        }
    }
}