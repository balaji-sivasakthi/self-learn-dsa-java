package Basics.Math.Divisor;

import java.util.Scanner;

public class Solution2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        for (int i = 1; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                System.out.println(i);
                if (i != number / i) System.out.println(number / i);
            }
        }
        /*
         *     Time Complexity O(sqrt(N))
         *     Space Complexity O(1)
         * */
    }
}
