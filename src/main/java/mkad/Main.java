package mkad;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * MKAD

 The length of the Moscow Ring Road (MKAD) is 109 kilometers.
    Biker Vasya starts from the zero kilometer of MKAD and drives with a speed of V kilometers per hour.
    On which mark will he stop after T hours?

 Input data format

 The program gets integers V and T as input.
    If V > 0, then Vasya moves in a positive direction along MKAD, if the value of V < 0 – in the negative direction.
    0 ≤ T ≤ 1000, -1000 ≤ V ≤ 1000.

 Output data format

 The program should output an integer from 0 to 108 - the mark on which Vasya stops.
 */
public class Main {
    public static void main(String[] args) {
        int[] input = parseArgsToString();
        if (input.length != 0) {
            int howLong = Math.abs(input[0]*input[1]);
            if (input[1] < 0) {
                System.out.println((109 - howLong % 109) & 109);
            }
            else if (input[1] == 0) {
                System.out.println(0);
            }
            else {
                System.out.println(howLong % 109);
            }
        }


    }

    private static int[] parseArgsToString() {
        try (BufferedReader br =
                     new BufferedReader(new InputStreamReader(System.in))) {
            String[] strings = new String[2];
            System.out.println("Enter speed of Vasya, -1000 ≤ T ≤ 1000, hours");
            System.out.println("If V > 0, then Vasya moves in a positive direction along MKAD, if the value of V < 0 – in the negative direction.");
            if ((strings[0] = br.readLine()) == null) {
                System.out.println("Not correct input");
                return new int[0];
            }
            else {
                System.out.println("Enter duration of the ride, 0 ≤ T ≤ 1000, hours");
                if ((strings[1] = br.readLine()) == null) {
                    System.out.println("Not correct input");
                    return new int[0];
                }
                else{
                    if (isInteger(strings[0]) && isInteger(strings[1])) {
                        int[] out = new int[2];
                        out[1] = Integer.parseInt(strings[0]);
                        out[0] = Integer.parseInt(strings[1]);
                        return out;
                    }
                    else {
                        System.out.println("Not correct input");
                        return new int[0];
                    }
                }
            }
        }
        catch (IOException e) {
            System.out.println("Not correct input.");
            return new int[0];
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

}
