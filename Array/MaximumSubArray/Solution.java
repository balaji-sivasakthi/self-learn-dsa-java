package Array.MaximumSubArray;

public class Solution {
    public static int maxSubArray(int[] arr){
        int size = arr.length;
        int max_so_for = Integer.MIN_VALUE;
        int max_ending = 0;
        for(int element : arr){
            max_ending = max_ending + element;
            if(max_so_for < max_ending){
                max_so_for = max_ending;
            }
            if(max_ending < 0){
                max_ending = 0;
            }
        }
        return max_so_for;
    }
    public static void main(String[] args) {
        int[] arr = new int[]{-2, -3, 4, -1, -2, 1, 5, -3};
        System.out.println(maxSubArray(arr));
    }
}
