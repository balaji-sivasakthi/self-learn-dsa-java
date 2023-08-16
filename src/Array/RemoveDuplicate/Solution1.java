package Array.RemoveDuplicate;

import java.util.HashSet;
import java.util.Set;

public class Solution1 {
    public static void main(String[] args) {
        int[] arr = new int[]{12, 3, 64, 78, 78};
        Set<Integer> set = new HashSet<>();
        for(int i : arr){
            set.add(i);
        }
        for(int i: set){
            System.out.println(i);
        }
        /*
        *       Time Complexity  :- O(logN+N)
        *       Space Complexity :- (1)
        * */
    }
}
