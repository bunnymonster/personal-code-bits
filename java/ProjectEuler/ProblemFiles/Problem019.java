public class Problem019 {

     public static void main(String[] args) {
         
        //Create array of month day counts for normal and leap years.
        int[] monthDaysNormalYear = {31,28,31,30,31,30,31,31,30,31,30,31};
        int[] monthDaysLeapYear = {31,29,31,30,31,30,31,31,30,31,30,31};
        
        //The day of week, 0=Sunday, 1=Monday, etc.
        //Given Jan 1 1900 was Monday, and there were
        //365 days in 1900, Jan 1, 1901 was a Tuesday.
        int dayOfWeek = 2;
        
        //Total Sundays that are First of the month
        int totalSundays = 0;
        
        //Modified leap year logic.
        //Since we only have 100 years, and 2000 is a leap year,
        //We only need to check whether the year is divisible by 4.
        for(int i = 1901; i < 2001; i++) {
            
            //For each month, add te number of days in it to dayOfWeek
            //To reach the next First of the month. Then check to see
            //if dayOfWeek is a Sunday, with value 0 mod 7.
            for(int month = 0; month < 12; month++) {
                if(i % 4 == 0) {
                    dayOfWeek +=monthDaysLeapYear[month];
                }  else {
                    dayOfWeek +=monthDaysNormalYear[month];
                }
                if(dayOfWeek % 7 == 0) {
                    totalSundays++;
                }
            }
        }
        
        System.out.println(totalSundays);
    }
    
}

