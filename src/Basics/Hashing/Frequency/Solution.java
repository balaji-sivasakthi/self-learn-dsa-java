package Basics.Hashing.Frequency;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    static  void usingHashMap(int[] arr){
        System.out.println("Using Hashmap");
        Map<Integer, Integer> map = new HashMap<>();
        for(int e: arr){
            if(map.containsKey(e)){
                map.put(e, map.get(e)+1);
            }else{
                map.put(e,1);
            }
        }
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            System.out.println(entry.getKey()+" "+ entry.getValue());
        }
        /*
        *       Time Complexity:-   O(N)
        *       Space Complexity:-  O(N)
        * */
    }
    static void usingArray(int[] arr){
        System.out.println("Using Array");
        int size = arr.length;
        boolean[] visited = new boolean[size];
        for(int i  = 0; i < size; i++){
            if(visited[i]){
                continue;
            }
            int count = 1;
            for(int j = i+1; j < size; j++){
                if(arr[i]==arr[j]){
                    visited[j] = true;
                    count++;
                }
            }
            System.out.println(arr[i]+" "+count);
        }
        /*
        *       Time Complexity :- O(N*N)
        *       Space Complexity:- O(N)
        * */
    }
    public static void main(String[] args) {
        int[] arr = new int[] {1, 1, 5, 6, 5, 8};
        usingArray(arr);
        usingHashMap(arr);
    }
}
