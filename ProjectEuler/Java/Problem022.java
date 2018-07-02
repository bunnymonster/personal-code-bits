import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Arrays;


public class Problem022 {

    public static void main(String []args){
        try {
            
            String tempString = "";
            File f =  new File("ProblemAdditionalFiles/p022_names.txt");
            BufferedReader b = new BufferedReader(new FileReader(f));
            String readLine = "";
            long total = 0;
            //Put Names into temp string, names.txt  is one line long.
            while((readLine = b.readLine()) != null) {
                tempString = readLine;
            }
            //Get rid of quotes, and split string on commas.
            //Then sort string array
            tempString = tempString.replace("\"","");
            String[] names = tempString.split(",");
            Arrays.sort(names);
            
            //For each name define a wordSum as 0;
            //This will hold the given word's sum
            for(int i = 0; i < names.length; i++) {
                long wordSum = 0;
                //For each word, add its char value-64 to the wordSum
                //The chars are uppercase, so we can get letter numbers by 
                //subtracting 64 from each char's integer value
                for(int j = 0; j < names[i].length(); j++) {
                    wordSum += (names[i].charAt(j)-64);
                }
                //multiply the name's word sum by its position in the list 
                //and add to total.
                total += wordSum*(i+1);
            }
            System.out.println(total);
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}