package Array.RemoveDuplicate;

public class Solution2 {
    public static int removeDuplicate(int[] arr) {
        int i = 0;
        for (int j = 0; j < arr.length; j++) {
            if (arr[i] != arr[j]) {
                arr[i + 1] = arr[j];
                i++;
            }
        }
        return i + 1;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{23, 56, 36, 36};
        int n = removeDuplicate(arr);
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
        /*
         *       Time complexity :- O(N)
         *       Space Complexity:- O(1)
         * */
    }
}
