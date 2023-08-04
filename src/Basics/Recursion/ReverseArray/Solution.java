package Basics.Recursion.ReverseArray;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Solution {
    public static void reverseArray(int[] arr, int i, int j){
        if(i<j){
            swap(arr, i, j);
            reverseArray(arr,i+1, j-1);
        }else{
            return;
        }
    }
    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 4, 6};
        reverseArray(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
        /*
        *   Time Complexity  :- O(N)
        *   Space Complexity :- O(1)
        * */
    }
}
