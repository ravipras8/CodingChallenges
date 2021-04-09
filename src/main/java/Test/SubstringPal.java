package Test;

public class SubstringPal {
    public static void main(String[] args) {
        String st= "abaaba";
        char[] arr = st.toCharArray();
        // System.out.println(String.join("", arr));
        int count =0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j <= arr.length; j++) {
                String temp = st.substring(i,j);
                System.out.print(temp+",");
                if(temp.length() >1){
                    StringBuilder sb = new StringBuilder(temp);
                    sb.reverse();
                    if(sb.toString().compareTo(temp) == 0){
                        count ++;
                    }
                }
            }
        }
        System.out.println();
        System.out.println(count);
    }
}