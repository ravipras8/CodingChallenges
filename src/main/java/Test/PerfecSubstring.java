package Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PerfecSubstring {
    public static void main(String[] args) {
        String st = "aabbccc";
        int k = 2;
        System.out.println(perfect(st, k));
    }

    public static int perfect(String st, int k) {
        int count = 0;
        for (int i = 0; i < st.length(); i++) {
            for (int j = st.length(); j > i; j--) {
                String sub = st.substring(i, j);
                if (sub.length() > k && check(sub, k)) {
                    System.out.println(sub);
                    count++;
                }
            }
        }
        return count;
    }

    public static boolean check(String st, int k) {
        Map<Character, Integer> map = new HashMap<>();
        // Stream<Character> charsStream = st.chars().mapToObj(c-> (char) c);
        // Map<Character, Long> output = charsStream.collect(Collectors.groupingBy(ch -> ch, Collectors.counting()));
        // Map<Character, Long> output = st.chars().mapToObj(c-> (char) c).collect(Collectors.groupingBy(ch -> ch, Collectors.counting()));
        for (int i = 0; i < st.length(); i++) {
            Character c = st.charAt(i);
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        return map.values().iterator().next() == k &&  new HashSet<>(map.values()).size() == 1;
    }
}