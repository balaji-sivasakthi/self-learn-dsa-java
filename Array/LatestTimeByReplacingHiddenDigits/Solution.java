package Array.LatestTimeByReplacingHiddenDigits;

public class Solution {
    public static String maximumTime(String time) {
        if (time.charAt(0) == '?') {
            if (time.charAt(1) != '?' && time.charAt(1) - '0' > 3) {
                time = time.substring(0, 0) + '1' + time.substring(1);
            } else {
                time = time.substring(0, 0) + '2' + time.substring(1);
            }
        }
        if (time.charAt(1) == '?') {
            if (time.charAt(0) == '1' || time.charAt(0) == '0') {
                time = time.substring(0, 1) + '9' + time.substring(2);
            } else {
                time = time.substring(0, 1) + '3' + time.substring(2);
            }
        }
        if (time.charAt(3) == '?') {
            time = time.substring(0, 3) + '5' + time.substring(4);
        }
        if (time.charAt(4) == '?') {
            time = time.substring(0, 4) + '9';
        }
        return time;
    }
    public static void main(String[] args) {
        System.out.println(maximumTime("?5:?0"));
    }
}
