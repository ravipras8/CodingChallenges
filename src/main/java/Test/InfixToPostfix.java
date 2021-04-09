package Test;

import java.util.Stack;

public class InfixToPostfix {
    public static void main(String[] args) {
        String exp = "a+b*(c^d-e)^(f+g*h)-i"; 
        System.out.println(infixToPostfix("x^y/(5*z)+2")); 
        // abcd^e-fgh*+^*+i-
    }
    public static int prec(Character c){
        switch (c) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^': 
                return 3;
            default:
                return -1;
        }
    }
    public static String infixToPostfix(String exp){
        StringBuilder sb = new StringBuilder("");
        Stack<Character> st = new Stack<>();
        for(int i=0; i< exp.length(); i++){
            Character c = exp.charAt(i);
            if(Character.isLetterOrDigit(c)){
                sb.append(c);
            } else if(c == '('){
                st.push(c);
            } else if(c==')'){
                while(!st.isEmpty() && st.peek() !='('){
                    sb.append(st.pop());
                }
                if(!st.isEmpty())
                st.pop();
            } else{
                while(!st.isEmpty() && prec(c) <= prec(st.peek())){
                    sb.append(st.pop());
                }
                st.push(c);
            }
        }
        while(!st.isEmpty()){
            if(st.peek() == '(') return "Invalid exp";
            sb.append(st.pop());
        }
        return sb.toString();
    }
}