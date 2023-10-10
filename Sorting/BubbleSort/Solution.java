package Sorting.BubbleSort;

import Utils.DSAUtils;

import java.util.Arrays;

public class Solution {
    public static void bubbleSort(int[] arr){
        for(int j = 0; j < arr.length - 1; j++){
            boolean flag = false;
            for(int i = 0; i < arr.length - j - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    DSAUtils.swap(arr, i, i + 1);
                    flag = true;
                }
            }
            if(!flag) break;
        }
    }
    public static void main(String[] args) {
        int[] arr = new int[]{65, 55, 45,33};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
        /*
        *       Time Complexity  :- O(N^2)
        *       Space Complexity :- O(1)
        * */
    }
}
