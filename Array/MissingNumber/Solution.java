package Array.MissingNumber;

public class Solution {
        public static int missingNumber(int[] nums) {
            int n = nums.length;
            int totalSum = n*(n+1)/2;
            int sum = 0;
            for (int num : nums) {
                sum += num;
            }
            return totalSum - sum;
        }

    public static void main(String[] args) {
        System.out.println(missingNumber(new int[]{0,1,3,4,5}));
    }
}
