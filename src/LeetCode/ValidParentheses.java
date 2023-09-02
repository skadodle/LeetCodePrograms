package LeetCode;

import java.util.Stack;

public class ValidParentheses {
    public static boolean isValid(String s) {
        while(s.contains("{}") || s.contains("()") || s.contains("[]"))
            for (String brackets : new String[]{"()", "{}", "[]"})
                s = s.replace(brackets, "");

        return s.isEmpty();
    }

    public static boolean isValidStack(String s) {
        Stack<Character> stack = new Stack<>();
        for (char symbol : s.toCharArray()) {
            if (symbol == ')' && stack.peek() == '(')
                stack.pop();
            else if (symbol == '}' && stack.peek() == '{')
                stack.pop();
            else if (symbol == ']' && stack.peek() == '[')
                stack.pop();
            else {
                stack.push(symbol);
            }
        }
        return stack.isEmpty();
    }
}
