package Test;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class JumpingClouds {
    public static void main(String[] args) {
        repeatStr("abc", 10);
    }

    public static void repeatStr(String st, int n) {
        int no = n / st.length();
        int rem = n % st.length();
        StringBuilder sb = new StringBuilder(st);
        for (int i = 0; i < no - 1; i++) {
            sb.append(st);
        }
        sb.append(st.substring(0, rem));
        System.out.println(sb.toString());
        Map<Character, Long> map = sb.chars().mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        map.forEach((key, value)-> System.out.println(key+":"+value));
                
    }

    public static void cloudJumps() {
        // 7
        // 0 0 1 0 0 1 0
        int n = 6;// 7;
        int jumps = 0;
        int[] arr = { 0, 0, 0, 0, 1, 0 }; // {0,1,0,0,0,1,0};//{0,0,1,0,0,1,0};
        for (int i = 0; i < n - 1;) {
            if (jumps == 0 && arr[i] == 0) {
                jumps++;
            }
            if ((i + 2) < n && arr[i + 2] == 0) {
                jumps++;
                i += 2;
            } else if (arr[i + 1] == 0) {
                jumps++;
                i++;
            }
        }
        System.out.println(jumps - 1);
    }
}