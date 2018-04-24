public class Problem028 {

     public static void main(String[] args){
        
        /* We have 3 variables.
        * sum is the total sum of diagonal sumbers so far.
        * dist is the distance between the current diagonal sumber
        * and the next.
        * count is the current sumber we are at in the square
        */
        
        long sum = 1;
        long dist = 2;
        long count = 1;
        
        /*
        * Do the following:
        * 
        * Add dist to count to reach the next diagonal sumber, then add count
        * to sum.  Repeat this step 4 times to add each diagonal sumber in
        * this layer of the square to the sum.  Then increase dist by 2 and
        * repeat.
        *
        * Do the above until count is one less than equal to the last value in 
        * the square: 1001*1001.  We do 1 less becuase sum is initalized to 1.
        */
        while(count < 1001*1001) {
            for(int i = 0; i < 4; i++) {
                count += dist;
                sum += count;
            }
            dist += 2;
        }
        
        //Print the answer
        System.out.println(sum);
     }
}