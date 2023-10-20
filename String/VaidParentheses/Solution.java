package String.VaidParentheses;

import java.util.Stack;

public class Solution {
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(char ch : s.toCharArray()){
            if(ch == '{'){
                stack.push('}');
            }else if (ch == '('){
                stack.push(')');
            }else if (ch == '['){
                stack.push(']');
            }else if (stack.empty() || stack.pop() != ch){
                return  false;
            }
        }
        return stack.isEmpty();
    }
    public static void main(String[] args) {
        System.out.println(isValid("({[})"));

    }
}
