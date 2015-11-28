import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String s = in.next();
        int k = in.nextInt();
        char[] charArray = s.toCharArray();
        for (int i = 0; i < n; i++) {
            int asciiChar = (int)charArray[i];
            if (asciiChar >= 65 && asciiChar <= 90) {
                int newChar = asciiChar + k;
                while (newChar > 90) {
                    newChar -= 26;
                }
                System.out.print((char) (newChar));
            } else if (asciiChar >= 97 && asciiChar <= 122) {
                int newChar = asciiChar + k;
                while (newChar > 122) {
                    newChar -= 26;
                }
                System.out.print((char) (newChar));
            } else {
                System.out.print(charArray[i]);
            }
        }
        System.out.println();
    }
}
