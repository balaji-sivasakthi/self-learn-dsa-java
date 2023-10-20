package Array.PascalTriangle2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public static  List<Integer> getRow(int rowIndex){
        List<Integer> list = new ArrayList<>();
        long ans = 1;
        list.add((int)ans);
        for(int i=0; i < rowIndex; i++)
        {
            ans *= (rowIndex-i);
            ans /= (i+1);
            list.add((int)ans);
        }
        return list;
    }
    public static void main(String[] args) {
        System.out.println(getRow(4));
    }
}
