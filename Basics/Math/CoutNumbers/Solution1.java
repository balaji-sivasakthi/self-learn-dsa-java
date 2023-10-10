package Basics.Math.CoutNumbers;

import java.util.Scanner;
public class Solution1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int digits = 0;
        while(number!=0){
            ++digits;
            number = number / 10;
        }
        System.out.println("Number of Digits "+ digits);

        /*
        *     Time Complexity =  O(N)
        *     Space Complexity = O(1)
        * */
    }
}
