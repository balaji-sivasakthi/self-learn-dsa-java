package Basics.Math.CheckPalindrome;

import java.util.Scanner;

public class CheckPalindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int temp = number;
        int reverse = 0;
        while (number != 0) {
            reverse = reverse * 10 + number % 10;
            number = number / 10;
        }
        System.out.println("Is this Palindrome? " + ((temp == reverse) ? "Yes" : "No"));
        /*
         *       Time Complexity   O(log N)
         *       Space Complexity  O(1)
         * */
    }
}
