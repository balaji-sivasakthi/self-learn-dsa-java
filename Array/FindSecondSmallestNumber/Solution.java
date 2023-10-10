package Array.FindSecondSmallestNumber;

public class Solution {
    public static int findSecondSmallestNumber(int[] arr) {
        int smallest = arr[0];
        int sSmalest = Integer.MAX_VALUE;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < smallest) {
                sSmalest = smallest;
                smallest = arr[i];
            } else if (arr[i] > sSmalest && arr[i] != smallest) {
                sSmalest = arr[i];
            }
        }
        return smallest;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{4, 66, 4, 4, 5, 6};
        System.out.println(findSecondSmallestNumber(arr));
        /*
         *      Time Complexity :- O(N)
         *      Space Complexity:- O(1)
         * */
    }
}
