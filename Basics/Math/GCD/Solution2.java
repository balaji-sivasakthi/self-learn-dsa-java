package Basics.Math.GCD;

import java.util.Scanner;

public class Solution2 {
    public static int gcd(int a, int b){
        if(b==0){
            return a;
        }
        return gcd(b,a%b);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println("GCD of two number is "+gcd(a, b));
        /*
        *   Time Complexity  O(logɸmin(a,b)), where ɸ is 1.61.
        *   Space Complexity O(1)
        * */
    }
}
