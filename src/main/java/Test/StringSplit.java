package Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringSplit {

    public static void main(String[] args) {
        Node n= new Node(1);
        Map<Node,String> map = new HashMap<>();
        map.put(n, "value");
        n.data = 12;
        // Node n1= new Node(12);
        System.out.println(map.get(n));
        // String str = "Hi i am Ravi, and i am from 'Siemens, Technology', i have 8 years of exp";
        // regEx(str);
    }

    public static void regEx(String str){
        Pattern p = Pattern.compile("[^,]*(?=([^\']*\'[^\']*\')*[^\']*$)");
        Matcher m = p.matcher(str);
        while(m.find()){
            System.out.println(m.group());
        }
        // String[] st = str.split(",(?=([^\']*\'[^\']*\')*[^\']*$)");
        // System.out.println(st.length +":"+Arrays.toString(st));
    }

    public static void withoutReg(String str){
        List<String> list = new ArrayList<>();

        while(str.indexOf(",")>=0){
            int index = str.indexOf(",");
            int first = str.indexOf("'");
            int last =  str.indexOf("'",str.indexOf("'")+1);
            if(index > first && index < last){
                list.add(str.substring(0, last+1));
                str = str.substring(str.indexOf(",",last+1)+1, str.length());
            }else {
                list.add(str.substring(0, index));
                str = str.substring(index+1, str.length());
            }
        }
        list.add(str);
        for (String string : list) {
            System.out.println(string);
        }
    }
}