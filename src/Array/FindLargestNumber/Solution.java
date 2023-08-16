package Array.FindLargestNumber;

public class Solution {
    public static int findLargestNumber(int[] arr){
            int max = arr[0];
            for(int i  = 1; i < arr.length; i++){
                if(arr[i]>max){
                    max = arr[i];
                }
            }
            return max;
    }
    public static void main(String[] args) {
        int[] arr  = new int[]{3,64,6,73,2};
        System.out.println("Max element : "+findLargestNumber(arr));
        /*
         *      Time Complexity   :- O(N)
         *      Space Complexity :- O(1)
         */
    }
}
