package digitalwatches;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 *
 Digital watches display time in the h:mm:ss format (from 0:00:00 to 23:59:59),
    i.e. first goes the number of hours, then goes the two-digit number of minutes,
    followed by the two-digit number of seconds.
    If necessary, number of minutes and seconds are filled by zeroes to a two-digit number.

 N seconds passed from the beginning of the day. Output what the watches will display.

 Input data format:
 Given the natural number N on input, not exceeding 10^7 (10000000).
 */
public class Main {

    public static void main(String[] args) {
        String s;
        int n;

        System.out.println("Enter N seconds passed from the beginning of the day.");

        try (BufferedReader br =
                     new BufferedReader(new InputStreamReader(System.in))) {
            if ((s = br.readLine()) != null) {
                if (!isInteger(s)
                        || (n = Integer.parseInt(s)) < 0) {
                    System.out.println("Not correct input.");
                }
                else {
                    int hour = n/60/60;
                    int min = (n - hour * 60 * 60) / 60;
                    int sec = n - hour * 60 * 60 - min * 60;
                    hour %= 24;
                    printTime(hour, min, sec);
                }
            }
        }
        catch (IOException e) {
            System.out.println("Not correct input.");
        }
    }

    private static boolean isInteger(String s) {
        return isInteger(s,10);
    }

    private static boolean isInteger(String s, int radix) {
        if (s.isEmpty())
            return false;
        for (int i = 0; i < s.length(); i++) {
            if (i == 0 && s.charAt(i) == '-') {
                if (s.length() == 1)
                    return false;
                else
                    continue;
            }
            if (Character.digit(s.charAt(i),radix) < 0)
                return false;
        }
        return true;
    }

    private static void printTime(int h, int m, int s) {
        StringBuilder sb = new StringBuilder(String.valueOf(h)).append(":");
        if (m < 10) {
            sb.append(0).append(m).append(":");
        }
        else {
            sb.append(m).append(":");
        }
        if (s < 10) {
            sb.append(0).append(s);
        }
        else {
            sb.append(s);
        }
        System.out.println(sb);
    }
}
