package Array.ContainerWithMostWater;

public class Solution {
    public static int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxArea = 0;
        while(left < right){
            int currentArea = Math.min(height[left], height[right]) * (right - left);
            maxArea = Math.max(maxArea, currentArea);
            if(height[left] < height[right]){
                left++;
            }else{
                right--;
            }
        }
        return maxArea;
    }
    public static void main(String[] args) {
            int[] arr = new int[]{1,8,6,2,5,4,8,3,7};
            System.out.println(maxArea(arr));
    }
}
