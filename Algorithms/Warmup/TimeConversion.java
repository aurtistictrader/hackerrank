import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner input = new Scanner(System.in);
        
        String dateInput = input.nextLine();
        String[] inputValues = dateInput.split(":", 3);
        String AMorPM = dateInput.substring(dateInput.length() - 2);
        
        if (AMorPM.equals("AM")) {
            if (inputValues[0].equals("12")) {
                System.out.println("00" + dateInput.substring(2, dateInput.length() - 2));
            } else {
                System.out.println(dateInput.substring(0, dateInput.length() - 2));
            }
        } else {
            if (inputValues[0].equals("12")) {
                System.out.println("12" + dateInput.substring(2, dateInput.length() - 2));
            } else {
                int hour = Integer.parseInt(inputValues[0]);
                int newHour = hour + 12;
                System.out.println(newHour + dateInput.substring(2, dateInput.length() - 2));
            }
        }
    }
}