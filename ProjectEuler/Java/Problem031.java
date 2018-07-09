public class Problem031 {

    public static void main(String []args) {
        
        //Initialize target, coinValues, and numberWays
        int target = 200;
        int[] coinValues = {1,2,5,10,20,50,100,200};
        int[] numberWays = new int[target+1];
        numberWays[0] = 1;
        
        //For each coin value Do the following:
            //For each number greater than or equal to coinValue
            //and less than target, set numberWays[j] to 
            //its current value plus numberWays[j - value of coin].
            
        //This works because for each number we start with 1 way to make change
        //with 1 pence, and for each successive coin, we can make change with 
        //the current number of ways, or we can take away the current coin and
        //add the number of ways to make change with the leftovers.
        for(int i = 0; i < coinValues.length; i++) {
            for(int j = coinValues[i]; j <= target; j++) {
                numberWays[j] += numberWays[j - coinValues[i]];
            }
        }
        System.out.println(numberWays[200]);
    }
}