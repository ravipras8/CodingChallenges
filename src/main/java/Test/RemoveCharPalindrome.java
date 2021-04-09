package Test;

public class RemoveCharPalindrome {
    public static void main(String[] args) {
        String st ="abcdba";
        int l = 0, h= st.length()-1,count =0;
        while(l<h){
            if(st.charAt(l) == st.charAt(h)){
                l++; h--;
            }else {
                if(count == 0){
                    count ++;
                    if(isPal(st, l+1, h)){
                        System.out.println("pali");
                        return;
                    }else if(isPal(st, l, h-1)) {
                        System.out.println("pali");
                        return;
                    }
                }
                System.out.println("not");
                return;
            }
        }
    }

    static boolean isPal(String st, int l, int h){

        while(l < h){
            if(st.charAt(l) == st.charAt(h)){
                l++; h--;
            }else{
                return false;
            }
        }
        return  true;
    }

}