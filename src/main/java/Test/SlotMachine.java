package Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SlotMachine {

    public static void main(String[] args) {
        // 4
        // 137, 364, 115, 724 = op-14
        // "712", "246", "365", "312" = op-15
        List<String> input = Arrays.asList(new String[] { "712", "246", "365", "312" });
        int n = 4, sum = 0;
        List<String> temp = input;
        for (int i = 0; i < n; i++) {
            sum += highOfAll(temp);
            temp = removeHigh(temp);
        }
        System.out.println(sum);
    }

    public static List<String> removeHigh(List<String> input) {
        List<String> list = new ArrayList<>();
        for (String string : input) {
            if (string.length() > 0) {
                int max = high(string);
                list.add(new StringBuilder(string).deleteCharAt(string.indexOf(String.valueOf(max))).toString());
            }
        }
        return list;
    }

    public static int highOfAll(List<String> input) {
        int max = 0;
        for (String string : input) {
            max = Math.max(max, high(string));
        }
        return max;
    }

    public static int high(String s) {
        int max = 0;
        for (int i = 0; i < s.length(); i++) {
            max = Math.max(max, Character.getNumericValue(s.charAt(i)));
        }
        return max;
    }

}