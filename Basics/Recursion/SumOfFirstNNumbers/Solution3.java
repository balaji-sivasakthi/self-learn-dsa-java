package Basics.Recursion.SumOfFirstNNumbers;

import java.util.Scanner;

public class Solution3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int result = number * (number + 1) / 2;
        System.out.println("Sum of the N Numbers " + result);
        /*
         *    Time  Complexity :- O(1)
         *    Space Complexity :- O(1)
         * */
    }
}
