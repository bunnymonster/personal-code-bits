public class Problem003 {
    /**
    * Find the largest prime factor of 600851475143
    */
    public static void main(String[] args) {
        long seed = 600851475143L;
        long value = seed;
        long maxFactor = 1;
        
        outer:
        while(value != 1) {
            //Check if value is prime.  If value is prime, compare to max.
            for(long i = 2L; i < Math.sqrt(value); i++) {
                if(value % i == 0) {
                    if(maxFactor < i) {
                        maxFactor = i;
                    }
                    value /= i;
                    continue outer;
                }
            }
            //If this loop fails, then val is prime;
            if(maxFactor < value) {
                maxFactor = value;
            }
            value /= value;
        }
        
        System.out.println("The largets prime factor of 600851475143 is " + maxFactor);
    }
}