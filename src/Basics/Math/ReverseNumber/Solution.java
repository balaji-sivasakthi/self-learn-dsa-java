package Basics.Math.ReverseNumber;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int reverse = 0;
        int temp = number;
        while(number != 0){
            reverse = reverse*10 + number%10;
            number  = number/10;
        }
        System.out.println("Reverse of the number "+temp+" is "+reverse);
    }
}
