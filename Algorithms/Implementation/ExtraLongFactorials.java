import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        BigInteger value = new BigInteger("1"); 
        for (int i = 1; i <= n; i++) {
            BigInteger newVal = new BigInteger(Integer.toString(i));
            value = value.multiply(newVal);
        }
        
        System.out.println(value.toString());
    }
}
