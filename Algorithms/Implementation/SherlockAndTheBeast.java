import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            
            if (n < 3) {
                System.out.println(-1);
            } else {
                outerloop:
                for (int i = n / 3; i >= 0; i--) {
                    for (int j = n / 5; j >= 0; j--) {
                        if (3 * i + 5 * j < n) {
                            break;
                        }
                        if (3 * i + 5 * j == n) {
                            printResult(3 * i, '5');
                            printResult(5 * j, '3');
                            System.out.println();
                            break outerloop;
                        }
                    }
                    if (i == 0) {
                        System.out.println(-1);
                    }
                }
            }
        }
    }
    
    private static void printResult(int length, char value) {
        char[] chars = new char[length];
        Arrays.fill(chars, value);
        String result = new String(chars);
        System.out.print(result);
    }
}
