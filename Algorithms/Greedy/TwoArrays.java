import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

import java.util.Arrays;
public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner input = new Scanner(System.in);
        
        int numCases = input.nextInt();
        for (int i = 0; i < numCases; i++) {
            for (int j = 0; j < 3; j++) {
                int n = input.nextInt();
                int value = input.nextInt();
                
                Integer[] arrayA = new Integer[n];
                for (int k = 0; k < n; k++) {
                    int element = input.nextInt();
                    arrayA[k] = element;
                }   
                
                Integer[] arrayB = new Integer[n];
                for (int k = 0; k < n; k++) {
                    int element = input.nextInt();
                    arrayB[k] = element;
                }   
                
                Arrays.sort(arrayA);
                Arrays.sort(arrayB, Collections.reverseOrder());
                
                boolean isPossible = true;
                for (int k = 0; k < n; k++) {
                    if (arrayA[k] + arrayB[k] < value) {
                        isPossible = false;
                        break;
                    }
                }
                
                if (isPossible == true) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
                
            } 
        }
    }
}