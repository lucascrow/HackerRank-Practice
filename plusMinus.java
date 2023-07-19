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
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {
    int posCount = 0;
    int negCount = 0;
    int zerCount = 0;
    float ratio = 0;
    int length = arr.size();
    //java.util.ArrayList.size(arr);
    
    for(int i = 0; i < length; i++)
    {
        if(arr.get(i)>0)posCount++;
        else if(arr.get(i)<0)negCount++;
        else zerCount++;
    }
    ratio = (float)posCount/length;
    System.out.printf("%.6f\n", ratio);
    ratio = (float)negCount/length;
    System.out.printf("%.6f\n", ratio);
    ratio = (float)zerCount/length;
    System.out.printf("%.6f\n", ratio);
    }
    

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        Result.plusMinus(arr);

        bufferedReader.close();
    }
}
