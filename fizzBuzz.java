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
     * Complete the 'fizzBuzz' function below.
     *
     * The function accepts INTEGER n as parameter.
     */
     
    //Fizzbuzz Function to print out based on mulitples of 3 or 5
    public static void fizzBuzz(int n) {
        for (int i=1; i<n+1; i++){
            //Check if multiples of both 3 and 5
            if (i%3==0 && i%5==0){
            System.out.printf("FizzBuzz\n");
            //Check for Fizz (multiples of 3)
            } else if (i%3==0){
            System.out.printf("Fizz\n");
            //Check for Buzz (multiples of 5)
            } else if (i%5==0){
            System.out.printf("Buzz\n");
            //Print integer if it has no Fizz or Buzz
            } else System.out.printf("%d\n", i);
        }
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        Result.fizzBuzz(n);

        bufferedReader.close();
    }
}
