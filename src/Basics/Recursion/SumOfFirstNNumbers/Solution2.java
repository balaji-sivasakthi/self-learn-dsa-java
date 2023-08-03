package Basics.Recursion.SumOfFirstNNumbers;

import java.util.Scanner;

public class Solution2 {
    public static int printNumbers(int num){
        if(num == 0) return 0;
        return num + printNumbers(num-1);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println("Sum of the N Numbers " + printNumbers(number));
        /*
        *      Time  Complexity :- O(N)
        *      Space Complexity :- O(N)
        * */
    }
}
