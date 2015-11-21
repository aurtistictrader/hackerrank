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
        
        int acc = 0;
        
        for (int i = 0; i < numInputs; i++) {
            acc += input.nextInt();    
        }
        
        System.out.println(acc);
    }
}