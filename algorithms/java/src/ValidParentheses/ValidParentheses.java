package ValidParentheses;

import java.util.Stack;

public class ValidParentheses {

    public static boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {

            char c = s.charAt(i);
            if (c == '(' || c == '[' || c == '{')
                stack.push(c);
            else {

                if (stack.isEmpty())
                    return false;

                Character topCharacter = stack.pop();
                if (c == ')' && topCharacter != '(')
                    return false;
                if (c == ']' && topCharacter != '[')
                    return false;
                if (c == '}' && topCharacter != '{')
                    return false;
            }
        }
        return stack.isEmpty();
    }

}
