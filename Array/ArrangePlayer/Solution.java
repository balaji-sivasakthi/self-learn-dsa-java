package Array.ArrangePlayer;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void reverse(List<Integer> numSeq, int i , int j,  int size){
        if(i<j) {
            return;
        }
        int temp = numSeq.get(i);
        numSeq.set(i, numSeq.get(j));
        numSeq.set(j,temp);
        reverse(numSeq, i+1, j-1, size);
    }
    public static int getDifference(List<Integer> numSeq){
        int first  = 0;
        int second = 0;
        int size = numSeq.size();
        int result = 0;
        int i = 0;
        for(int score : numSeq){
            // check for players
            if(i%2==0){
                if(score %2==0){
                    reverse(numSeq, i+1 ,size,size);
                }
                first += score;
            }else{
                if(score %2==0){
                    reverse(numSeq, i+1, size,size);
                }
                second += score;
            }
            i++;
        }
        result = first - second;
        return result;
    }
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(6);
        list.add(2);
        list.add(3);
        list.add(5);
        System.out.println(getDifference(list));
    }
}
