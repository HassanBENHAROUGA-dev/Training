import java.util.List;
import java.util.Stack;

public class ValidParenthese {

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(char c : s.toCharArray()){
            if(c == '(' || c == '{' || c == '['){
                stack.push(c);
            }else{
                if(stack.empty()) return false;
                char top = stack.pop();

                if(c == ')' && top != '(') return false;
                if(c == '}' && top != '{') return false;
                if(c == ']' && top != '[') return false;
            }
        }
        return stack.empty();
    }

    public static void main(String[] args) {
        ValidParenthese validParenthese = new ValidParenthese();
        String s = "([)";
        System.out.println(validParenthese.isValid(s));
    }
}
