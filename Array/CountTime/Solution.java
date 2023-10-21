package Array.CountTime;

import java.util.Arrays;

public class Solution {
    public static int countTime(String time) {
        int result = 1;
        String[] hm = time.split(":");
        String h = hm[0];
        String m = hm[1];

        if(h.charAt(0) == '?' && h.charAt(1)=='?') {
            result = result * 23;
        }else if(h.charAt(0)=='?'){
            int second = Integer.parseInt(h.charAt(1)+"");
            if(second < 4){
                result = result * 3;
            }else{
                result = result * 2;
            }
        }else if(h.charAt(1)=='?'){
            int first = Integer.parseInt(h.charAt(0)+"");
            // 01-23
            if(first < 2){
                result = result * 9;
            }else{
                result = result * 4;
            }
        }

        if(m.charAt(0) == '?' && m.charAt(1) == '?'){
            result = result * 59;
        }else if(m.charAt(0)=='?'){
            result = result*5;
        }else if(m.charAt(1)=='?'){
            if(Integer.parseInt(m.charAt(1)+"") < 6){
                result = result * 9;
            }
        }

        return result;
    }
    public static void main(String[] args) {
        System.out.println(countTime("?5:?0"));
    }
}
