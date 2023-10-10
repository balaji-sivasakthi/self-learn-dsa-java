package Sorting.SelectionSort;

import Utils.DSAUtils;

import java.util.Arrays;

public class Solution {
    static void selectionSort(int[] arr, int size) {
        for (int i = 0; i < size - 2; i++) {
            int min = i;
            for (int j = i + 1; j < size - 1; j++) {
                if (arr[i] > arr[j]) {
                    min = j;
                }
            }
            DSAUtils.swap(arr, i, min);
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[]{2, 1, 67, 34, 89, 90};
        int size = arr.length;
        selectionSort(arr, size);
        System.out.println(Arrays.toString(arr));
        /*
         *       Time Complexity  :- O(N^2)
         *       Space Complexity :- O(1)
         * */
    }
}
