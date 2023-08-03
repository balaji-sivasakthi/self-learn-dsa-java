package Basics.Recursion;

import java.util.Scanner;

public class PrintNumbersUsingRecursion {
    public static void printNumbers(int first, int last ) {
        // Base Condition
        if(first>last) return;
        System.out.println(first);
        printNumbers(first+1, last);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int last = scanner.nextInt();
        printNumbers(0, last);
        /*
        *  Time Complexity : O(N)
        *  Space Complexity: O(N)
        * */
    }
}