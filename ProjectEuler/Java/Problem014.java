public class Problem014 {
	
	public static void main(String[] args) {
        
        //For 1 to 1000000 compute collatz sequence length.
        //If sequence length of integer k is greater than max,
        //set max to the sequence length of k.
        int maxLength = 1;
        int collatzLength = 1;
        for(int i = 1; i <= 1000000; i++) {
            collatzLength = collatzSequence(i);
            if(maxLength < collatzLength) {
                maxLength = collatzLength;
            }
        }
        System.out.println(maxLength);
    }
     
    //Compute collatz sequence length for given n.
    //Collatz sequence defined as follows:
    //n -> n/2 if n even
    //n -> 3*n+1 if n odd.
    public static int collatzSequence(int n) {
    
        int sequenceLen = 1;
        long value = n;
        while(value != 1) {
            if(value % 2 == 0) {
                value = value/2;
            } else {
                value = 3*value + 1;
            }
            sequenceLen++;
        }
        return sequenceLen;
    }
}