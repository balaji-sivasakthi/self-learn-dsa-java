package Basics.Recursion.Factorial;

import java.util.Scanner;

public class Solution {
    public static int factorial(int number) {
        if (number == 0) return 1;
        return number * factorial(number - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.println("Factorial of the number is " + factorial(num));
        /*
         *   Time Complexity  :- O(N)
         *   Space Complexity :- O(N)
         * */
    }
}
