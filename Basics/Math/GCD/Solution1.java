package Basics.Math.GCD;

import java.util.Scanner;

public class Solution1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int result = 1;
        for(int i = 1; i <= Math.min(a, b); i++){
            if(a % i == 0 && b%i ==0){
                result = i;
            }
        }
        System.out.println("GCD of two number is " +result);

        /*
        *       Time Complexity  O(N)
        *       Space Complexity O(1)
        * */
    }
}
