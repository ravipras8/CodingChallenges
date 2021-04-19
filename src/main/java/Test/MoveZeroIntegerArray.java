package Test;

public class MoveZeroIntegerArray {

    public static void main(String[] args) {
        int arr[] = {1, 2, 0, 4, 6, 0, 9, 0, 4, 0, 3, 0, 9, 0, 1, 0, 3, 0};
        int current = arr.length - 1;
        for (int i = arr.length - 1 ; i >=0 ; i--) {
            if(arr[i]!= 0){
                arr[current--] = arr[i];
            }
        }
        while(current>=0){
            arr[current--] = 0;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+",");
        }
        String s ="Ravi";
        System.out.println();
        System.out.println(s.contains("k"));
    }

}