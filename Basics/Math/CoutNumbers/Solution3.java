package Basics.Math.CoutNumbers;

import java.util.Scanner;

public class Solution3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int digits = (int) Math.floor(Math.log10(number) + 1);
        System.out.println("Number of Digits " + digits);
        /*
         *     Time Complexity =  O(1)
         *     Space Complexity = O(1)
         * */
    }
}
