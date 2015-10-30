import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static int[][] matrix = new int[6][6];
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
       
        
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                matrix[i][j] = input.nextInt(); // row, column here
            }
        }
        
        int highestSum = -82;
        
        
        for (int i = 1; i < 5; i++) {
            for (int j = 1; j < 5; j++) {
                int nextSum = getSurroundingSum(i, j);
                if (nextSum > highestSum) {
                    highestSum = nextSum;
                }
            }
        }
        
        System.out.println(highestSum);  
    }
    
    public static int getSurroundingSum(int row, int column) {
        int total = 0;
        
        total += matrix[row-1][column-1];
        total += matrix[row-1][column];
        total += matrix[row-1][column+1];
        //total += matrix[row][column-1];
        total += matrix[row][column];
        //total += matrix[row][column+1];
        total += matrix[row+1][column-1];
        total += matrix[row+1][column];
        total += matrix[row+1][column+1];
        
        return total;
    }
}