package Basics.Math.Divisor;

import java.util.Scanner;

public class Solution1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                System.out.println(i);
            }
        }
        /*
         *     Time Complexity O(N)
         *     Space Complexity O(1)
         * */
    }
}
