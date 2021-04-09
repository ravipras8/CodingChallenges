package Test;

import java.util.Stack;

public class EvaluatePostfix {
    public static void main(String[] args) {
        System.out.println(evaluate("231*+9-"));
    }

    public static Integer evaluate(String exp) {
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < exp.length(); i++) {
            Character c = exp.charAt(i);
            if (Character.isDigit(c)) {
                st.push(Character.getNumericValue(c));
            } else {
                int val1 = st.pop();
                int val2 = st.pop();
                if (c == '+') {
                    st.push(val2 + val1);
                } else if (c == '-') {
                    st.push(val2 - val1);
                } else if (c == '*') {
                    st.push(val2 * val1);
                } else if (c == '/') {
                    st.push(val2 / val1);
                } else if (c == '^') {
                    st.push((int) Math.pow(val2, val1));
                }
            }
        }
        return st.pop();
    }
}