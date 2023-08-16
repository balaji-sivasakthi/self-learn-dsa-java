package Array.FindSecondLargestNumber;

import java.util.Arrays;

public class Solution {
    public static int findSecondLargestNumber(int[] arr){
        Arrays.sort(arr);
        int slargest = arr[arr.length-1];
        for(int i = arr.length-2; i >= 0; i--){
            if(slargest != arr[i]){
                slargest = arr[i];
                break;
            }
        }
        return slargest;
    }
    public static void main(String[] args) {
        int[] arr = new int[] {2, 53, 52, 52};
        System.out.println("Second Largest Element :- "+ findSecondLargestNumber(arr));
        /*
         *      Time Complexity   :- O(N + NLogN)
         *      Space Complexity  :- O(1)
         */
    }
}
