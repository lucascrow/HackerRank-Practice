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
     * Complete the 'miniMaxSum' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void miniMaxSum(List<Integer> arr) {
    long minSum = 0;
    long maxSum = 0;
    //int length = arr.size();
    
    arr.sort(Comparator.naturalOrder());
    
    /*    for(int i = 0; i < length; i++)
    {
        System.out.printf("%d ", arr.get(i));
    }*/
    
    for(int i = 0; i < 4; i++)
    {
        minSum = minSum + arr.get(i);
    }
    
    for(int i = 1; i < 5; i++)
    {
        maxSum = maxSum + arr.get(i);
    }
    
    System.out.printf("%d %d", minSum, maxSum);
    
    
}

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        Result.miniMaxSum(arr);

        bufferedReader.close();
    }
}
