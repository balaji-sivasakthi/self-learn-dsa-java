package Sorting.BubbleSort;

import Utils.DSAUtils;

import java.util.Arrays;

public class Solution {
    public static void bubbleSort(int[] arr) {
        for (int j = 0; j < arr.length - 1; j++) {
            boolean flag = false;
            for (int i = 0; i < arr.length - j - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    DSAUtils.swap(arr, i, i + 1);
                    flag = true;
                }
            }
            if (!flag) break;
        }
    }
    public static void recursiveBubbleSort(int[] arr, int n){
        if(n == 1){
            return;
        }
        for(int i = 0; i < n - 1; i++){
            int count = 0;
            if(arr[i] > arr[i+1]){
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
                count++;
            }
            if(count == 0){
                return;
            }
        }
        recursiveBubbleSort(arr, n-1);
    }
    public static void main(String[] args) {
        int[] arr = new int[]{65, 55, 45, 33};
//      bubbleSort(arr);
        recursiveBubbleSort(arr, arr.length);
        System.out.println(Arrays.toString(arr));
        /*
         *       Time Complexity  :- O(N^2)
         *       Space Complexity :- O(1)
         * */
    }
}
