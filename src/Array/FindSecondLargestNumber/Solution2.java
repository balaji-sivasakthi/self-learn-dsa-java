package Array.FindSecondLargestNumber;

import java.util.Arrays;

public class Solution2 {
    public static int findSecondLargestNumber(int[] arr){
        int largest = arr[0];
        for(int i : arr){
            if(i > largest){
                largest = i;
            }
        }
        int slarget  = -1;
        for (int j : arr) {
            if (slarget < j && j < largest) {
                slarget = j;
            }
        }
        return slarget;
    }
    public static void main(String[] args) {
        int[] arr = new int[] {2, 4, 5, 66, 66};
        System.out.println("Second Largest Element :- "+ findSecondLargestNumber(arr));
        /*
         *      Time Complexity   :- O(2N)
         *      Space Complexity  :- O(1)
         */
    }
}
