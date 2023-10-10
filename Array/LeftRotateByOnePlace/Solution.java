package Array.LeftRotateByOnePlace;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 35, 67, 88};
        int temp = arr[0];
        for (int i = 1; i < arr.length; i++) {
            arr[i - 1] = arr[i];
        }
        arr[arr.length - 1] = temp;
        System.out.println(Arrays.toString(arr));
        /*
         *   Time Complexity :- O(N)
         *   Space Complexity:- O(1)
         * */
    }
}
