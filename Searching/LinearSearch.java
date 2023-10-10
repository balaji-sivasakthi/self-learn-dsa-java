package Searching;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array");
        int size = scanner.nextInt();
        System.out.print("Enter the Elements");
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.print("Enter the target Value");
        int target = scanner.nextInt();
        Integer index = null;
        for (int i = 0; i < arr.length; ++i) {
            if (arr[i] == target) {
                index = i;
            }
        }
        if (index == null) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element Found at the index " + index);
        }
    }
}
