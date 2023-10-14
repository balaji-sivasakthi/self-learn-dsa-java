package Utils;

import java.util.Arrays;

public class DSAUtils {
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void print2DArray(int[][] matrix){
            for (int[] i : matrix){
                System.out.println(Arrays.toString(i));
        }
    }
}
