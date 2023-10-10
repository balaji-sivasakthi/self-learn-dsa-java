package Array.FindLargestNumber;

import java.util.Arrays;

public class Solution2 {
    public static int findLargestNumber(int[] arr){
        Arrays.sort(arr);
        return arr[arr.length-1];
    }
    public static void main(String[] args) {
        int[] arr = new int[] { 2, 5, 67, 24};
        System.out.println("Max element : "+findLargestNumber(arr));
        /*
         *      Time Complexity   :- O(NlogN)
         *      Space Complexity  :- O(1)
         */
    }
}
