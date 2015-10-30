import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner input = new Scanner(System.in);
        int numValues = input.nextInt();
        int[] intArray = new int[numValues];
        
        int count = 1;
        int value = input.nextInt();  
        while (input.hasNextInt()) {
            intArray[numValues - count] = value;
            value = input.nextInt();
            count++;
        }
        intArray[0] = value;
        
        for (int i = 0; i < numValues; i++) {
            if (i == numValues - 1) {
                            System.out.print(intArray[i]);

            } else {
                            System.out.print(intArray[i] + " ");

            }
        }
        
        
    }
}