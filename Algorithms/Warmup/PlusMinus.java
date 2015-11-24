import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner input = new Scanner(System.in);
        
        int numInputs = input.nextInt();
        int numZeros = 0;
        int numPositive = 0;
        int numNegative = 0;
        
        for (int i = 0; i < numInputs; i++) {
            int nextInput = input.nextInt();
            if (nextInput == 0) {
                numZeros++;
            } else if (nextInput > 0) {
                numPositive++;
            } else {
                numNegative++;
            }
        }
        
        System.out.println((double) numPositive / numInputs);
        System.out.println((double) numNegative / numInputs);
        System.out.println((double) numZeros / numInputs);
        
    }
}