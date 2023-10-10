package Basics.Recursion.Palindrome;

public class Solution {
    static boolean isPalindrome(String str, int r, int l) {
        if (str.charAt(r) != str.charAt(l)) {
            return false;
        }
        if (r > l) {
            return true;
        }
        return isPalindrome(str, r + 1, l - 1);
    }

    public static void main(String[] args) {
        String temp = "mam";
        if (isPalindrome(temp, 0, temp.length() - 1)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }
    }
}
