package Searching;

class BinarySearch {
    public static void main(String[] args) {
        int[] arr = new int[]{10, 50, 3, 29, 4, 37};
        int result = search(arr, 50);
        if (result != -1) {
            System.out.println("Element found at the index " + result);
        } else {
            System.out.println("Element not found");
        }
    }

    public static int search(int[] arr, int target) {
        int low = 0;
        int high = arr.length;
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (target == arr[mid]) {
                return mid;
            }
            if (arr[mid] > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }
}