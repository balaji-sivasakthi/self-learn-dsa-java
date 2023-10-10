package Basics.Recursion.SumOfFirstNNumbers;

import java.util.Scanner;

public class Solution1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println("Sum of First N numbers " + sum);
        /*
         *   Time Complexity  :- O(N)
         *   Space Complexity :- O(1)
         * */
    }
}
