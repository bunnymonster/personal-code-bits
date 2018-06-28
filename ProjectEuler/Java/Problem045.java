import java.util.List;
import java.util.ArrayList;
public class Problem045 {

    public static void main(String []args){
        List<Long> triangle = new ArrayList<Long>();
        List<Long> pentagon = new ArrayList<Long>();
        List<Long> hexagon = new ArrayList<Long>();
        int total = 0;
        long number = 1;
        long a = 0;
        long b = 0;
        long c = 0;
        //Check first 3, because 1 also works here.
        while(total < 3) {
            //Compute triangle, pentagonal, and hexagonal numbers and add them to the lists.
            a = number*(number+1)/2;
            b = number*(3*number-1)/2;
            c = number*(2*number-1);
            triangle.add(a);
            pentagon.add(b);
            hexagon.add(c);

            //Triangle List will contain the smallest numbers, so we will not miss any by checking against the triangle sequence.
            if(triangle.contains(a) && pentagon.contains(a) && hexagon.contains(a)) {
                total++;
                System.out.println(a);
            }
            number++;
        }
    }
}