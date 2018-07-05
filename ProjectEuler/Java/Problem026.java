public class Problem026 {

     public static void main(String []args){
        long max = 0;
        int numWithPeriod = 0;
        for(int i=2;i<1000;i++) {
            int period = getPeriod(i);
            if(max < period) {
                max = period;
                numWithPeriod = i;
            }
        }
        System.out.println(numWithPeriod+" has period "+max);
     }
     
     public static int getPeriod(int i) {
        //Initialize count and mod to 1 and intial mod value resp.
        int count = 1;
        int mod = 10 % i;
        //If i is not divisible by 2 or 5, compute.
        //If i is divisible by 2 or 5, it's period is had in a smaller number
        if(i%2!=0 && i%5 !=0) {
            //While mod is not 1, multiply by 10 and mod with i, increment period.
            while(mod != 1) {
                mod = mod * 10;
                mod = mod % i;
                count++;
            }
        }
        return count;
   
     }
}