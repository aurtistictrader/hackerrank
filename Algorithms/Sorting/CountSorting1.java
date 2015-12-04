import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        
        int[] array = new int[100];
        for (int i = 0; i < 100; i++) {
            array[i] = 0;
        }
        for (int i = 0; i < size; i++) {
            int next = input.nextInt();
            array[next]++;
        }
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
    }
}