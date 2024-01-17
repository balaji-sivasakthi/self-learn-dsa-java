package Sorting.QuickSort;

import Utils.DSAUtils;

import java.util.Arrays;

public class Solution {
    public static  int partition(int[] arr, int low, int high){
        int pivot = arr[high];
        int i = low - 1;
        for(int j = low; j < high; j++){
            if(arr[j] < pivot){
                i++;
                DSAUtils.swap(arr, i, j);
            }
        }
        DSAUtils.swap(arr, i+1, high);
        return i+1;
    }
    public static void quickSort(int[] arr, int low, int high) {
        if(low >= high) return;
        int p = partition(arr, low, high);
        quickSort(arr, 0, p - 1);
        quickSort(arr, p + 1, high);
    }

    public static void main(String[] args) {
        int[] arr = new int[]{ 23, 4, 53, 1, 2, 5, 7};
        quickSort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
