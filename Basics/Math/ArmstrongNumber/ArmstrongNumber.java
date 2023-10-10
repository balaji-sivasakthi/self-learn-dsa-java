package Basics.Math.ArmstrongNumber;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int digits = (int) Math.floor(Math.log10(number) + 1);
        int sum = 0;
        int temp = number;
        while (number != 0) {
            sum += Math.pow(number % 10, digits);
            number = number / 10;
        }
        System.out.println("Is this number is Armstrong?" + (sum == temp));
        /*
         *       Time Complexity  O(log(N))
         *       Space Complexity O(1)
         * */
    }
}
