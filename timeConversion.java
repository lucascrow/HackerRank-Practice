import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'timeConversion' function below.

     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String timeConversion(String s) {
    //Extracts the first two characters from the input string s, which represent the hours portion of the time
    String a = s.substring(0, 2);
    
    //Declares an integer variable hour to store the hour value after conversion
    int hour;
    
    // Check if the time is in the afternoon (PM) and not equal to 12
    if (s.charAt(8) == 'P' && !a.equals("12")) {
        
        //Converts the extracted hours string a to an integer, adds 12 to it (to convert it to the 24-hour format), and stores the result in hour
        hour = Integer.parseInt(a) + 12;
        
        //Converts the updated hour back to a string and assigns it to a.
        a = Integer.toString(hour);
    }
    // Check if the time is midnight (12 AM)
    else if (a.equals("12") && s.charAt(8) == 'A') {
        a = "00";
    }
    //Returns the converted time string; it concatenates the modified a (hours) with the rest of the original string s, starting from the 3rd character (minutes) to the 8th character (seconds)
    return a + s.substring(2, 8);
    }
    
    /*String newTime = s;
        
        if (s.contains("AM"))
        {
            for (int i = 0; i < s.length()-2; i++)
            {
                newTime.charAt(i) = s.charAt(i);
            }
            
        } /*else for (int i = 0; i < s.length()-2; i++) {
  
            switch (s.charAt(i)) {
            case 1:  i = '';
                     break;
            case 2:  monthString = "February";
                     break;
            case 3:  monthString = "March";
                     break;
            case 4:  monthString = "April";
                     break;
            case 5:  monthString = "May";
                     break;
            case 6:  monthString = "June";
                     break;
            case 7:  monthString = "July";
                     break;
            case 8:  monthString = "August";
                     break;
            case 9:  monthString = "September";
                     break;
            case 10: monthString = "October";
                     break;
            case 11: monthString = "November";
                     break;
            case 12: monthString = "December";
                     break;
            default: monthString = "Invalid month";
                     break;
                // Insert the string to be inserted
                // into the new string
                newString += stringToBeInserted;
            }
            
            newTime += s.charAt(i);

        }
    System.out.println("%s" + newTime);
    return newTime;
    }*/
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = Result.timeConversion(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
