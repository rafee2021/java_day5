package algorithm;

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

public class candleSolution {

	/*class Result {

	    /*
	     * Complete the 'birthdayCakeCandles' function below.
	     *
	     * The function is expected to return an INTEGER.
	     * The function accepts INTEGER_ARRAY candles as parameter.
	     */
	/*

	    public static int birthdayCakeCandles(List<Integer> candles) {
	    
	        //counts number of tall candles
	        int n = 0;
	        //holds tallest candle
	        int tall = 0;
	        
	        for (int i = 0; i < candles.size(); i++) {
	            int num = candles.get(i);
	            if (num > tall) {
	                tall = num;
	                n = 1;
	            } else if (tall == num) {
	                n++;
	            }
	            
	        }
	        
	        return n;

	    }

	} */

/*
	public class Solution {
	    public static void main(String[] args) throws IOException {
	        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
	        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

	        int candlesCount = Integer.parseInt(bufferedReader.readLine().trim());

	        List<Integer> candles = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
	            .map(Integer::parseInt)
	            .collect(toList());

	        int result = Result.birthdayCakeCandles(candles);

	        bufferedWriter.write(String.valueOf(result));
	        bufferedWriter.newLine();

	        bufferedReader.close();
	        bufferedWriter.close();
	    }
	}*/

}
