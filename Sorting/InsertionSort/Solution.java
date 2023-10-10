package Sorting.InsertionSort;

import java.util.Arrays;

public class Solution {
    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int value = arr[i];
            int hole = i;
            while (hole > 0 && arr[hole - 1] > value) {
                arr[hole] = arr[hole - 1];
                hole--;
            }
            arr[hole] = value;
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[]{43, 23, 67, 12};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
        /*
         *     Time Complexity :- O(N^2)
         *     Space Complexity:- O(1)
         * */
    }
}
