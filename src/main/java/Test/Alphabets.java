package Test;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.regex.Pattern;

public class Alphabets {
    public static void main(String[] args) {
        HashMap<Character, Integer> map = new HashMap<>();
        int i = 1;
        for (char ch = 'a'; ch <= 'z'; ch++) {
            map.put(ch, i++);
            System.out.println((int) ch);
        }
        // for (Entry<Character, Integer> string : map.entrySet()) {
        //     System.out.println(string.getKey() + ":" + string.getValue());
        // }
        String st = "ravi.";
        System.out.println(Pattern.matches("[a-zA-Z\\s]*[!,.?]+", st));
    }
}