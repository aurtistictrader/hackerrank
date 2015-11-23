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
        
        int firstDiagSum = 0;
        int secondDiagSum = 0;
        
        for (int i = 0; i < numInputs; i++) {
            for (int j = 0; j < numInputs; j++) {
                int nextInput = input.nextInt();
                if (i == j) {
                    firstDiagSum += nextInput;
                }
                if (numInputs - i - 1 == j) {
                    secondDiagSum += nextInput;
                }
            }
        }
        
        if (firstDiagSum > secondDiagSum) {
            System.out.println(firstDiagSum - secondDiagSum);
        } else {
            System.out.println(secondDiagSum - firstDiagSum);
        }
    }
}