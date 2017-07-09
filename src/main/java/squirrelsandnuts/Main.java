package squirrelsandnuts;

import java.util.Scanner;

/**
 * Squirrels and nuts - 1

 N squirrels found K nuts and decided to divide them equally. Determine how many nuts each squirrel will get.

 Input data format

 There are two positive numbers N and K, each of them is not greater than 10000.
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N squirrels and K nuts");
        int n = sc.nextInt();
        int k = sc.nextInt();
        System.out.println(k / n);
    }
}
