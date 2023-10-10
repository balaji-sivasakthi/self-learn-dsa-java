package Array.MoveAllZeroToRight;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 0, 2, 4, 0, 3};
        int k = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[k] = arr[i];
                k++;
            }
        }
        for (int j = k; j < arr.length; j++) {
            arr[j] = 0;
        }
        System.out.println(Arrays.toString(arr));
        /*
         *      Time Complexity  :- O(2N)
         *      Space Complexity :- O(1)
         * */
    }
}
