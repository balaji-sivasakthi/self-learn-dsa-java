package Sorting.MergeSort;

import java.util.Arrays;

public class Solution {
    public static int[] mergeSort(int[] arr){
        if(arr.length == 1) return  arr;
        int mid = arr.length/2;
        int[] left = Arrays.copyOfRange(arr,0, mid);
        int[] right = Arrays.copyOfRange(arr, mid, arr.length);
        return merge(mergeSort(left),mergeSort(right));
    }
    public static int[] merge(int[] left, int[] right){
        int[] mix = new int[left.length+right.length];
        int i = 0, j = 0, k = 0;
        while(i < left.length && j < right.length){
            if(left[i] < right[j]){
                mix[k] = left[i];
                i++;
            }else if(left[i] > right[j]){
                mix[k] = right[j];
                j++;
            }
            k++;
        }
        while(i < left.length){
            mix[k] = left[i];
            i++;
            k++;
        }
        while(j < right.length){
            mix[k] = right[j];
            j++;
            k++;
        }
        return mix;
    }
    public static void main(String[] args) {
        int[] arr = new int[]{23, 45, 65, 12, 34};
        System.out.println(Arrays.toString(mergeSort(arr)));
        /*
        *      Time Complexity :- O(nlogn)
        *      Space Complexity:- O(N)
        * */
    }
}
