package Array.FindSecondLargestNumber;

public class Solution3 {
    public static int findSecondLargestNumber(int[] arr){
        int largest = arr[0];
        int sLargest = -1;
        for(int i = 1; i < arr.length; i++){
            if(arr[i] > largest){
                sLargest = largest;
                largest = arr[i];
            }else if(arr[i] < largest && arr[i] > sLargest){
                sLargest = arr[i];
            }
        }
        return sLargest;
    }
    public static void main(String[] args) {
        int[] arr = new int[] {2, 4, 5, 66, 66};
        System.out.println("Second Largest Element :- "+ findSecondLargestNumber(arr));
        /*
         *      Time Complexity   :- O(N)
         *      Space Complexity  :- O(1)
         */
    }
}
