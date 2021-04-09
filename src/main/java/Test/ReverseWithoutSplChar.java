package Test;

public class ReverseWithoutSplChar {
    public static void main(String[] args) {
        String st = "&abc$d#e&"; //&edc$b#a& //"abc$d#e"; //edc$b#a
        char arr[] = st.toCharArray();
        int i = 0, j= arr.length -1;
        while(i < j){
            if(Character.isLetterOrDigit(arr[i]) && Character.isLetterOrDigit(arr[j])){
                char temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;j--;
            } else if(!Character.isLetterOrDigit(arr[i])){
                i++;
            } else if(!Character.isLetterOrDigit(arr[j])){
                j--;
            } else{
                i++;j--;
            }
        }
        System.out.println(new String(arr));
    }
    
}