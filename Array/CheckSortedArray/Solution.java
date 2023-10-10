package Array.CheckSortedArray;

public class Solution {
    public static boolean isSorted(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] > arr[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 32, 90, 67};
        System.out.println("Is array is sorted? " + isSorted(arr));
        /*
         *      Time Complexity  :- O(N)
         *      Space Complexity :- O(1)
         */
    }
}
