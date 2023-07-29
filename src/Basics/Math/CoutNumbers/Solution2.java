package Basics.Math.CoutNumbers;

import java.util.Scanner;

public class Solution2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        String str = String.valueOf(number);
        System.out.println("Number of Digits"+str.length());
        /*
         *     Time Complexity =  o(1)
         *     Space Complexity = O(1)
         * */
    }
}
