package Basics.Recursion.PrintNto1;

import java.util.Scanner;

public class Solution {
    public static void printNumbers(int num) {
        if (num == 0) return;
        System.out.println(num);
        printNumbers(num - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        printNumbers(num);
        /*
         *  Time Complexity : O(N)
         *  Space Complexity: O(N)
         * */
    }

}
