import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Stack;

public class BalancedBracket{

    public static String IsBalanced(String string){

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < string.length(); i++){
            char c = string.charAt(i);

            if (c == '(' || c == '[' || c == '{'){
                stack.push(c);
            } else if (c == ')' || c == ']' || c == '}') {
                if (stack.isEmpty()){
                    return "NO";
                }
                char top = stack.peek();
                if ((c == ')' && top == '(')
                || (c == '}' && top =='{')
                || (c == ']' && top == '[')){
                    stack.pop();
                } else {
                    return "NO";
                }
                
            }

        }
        if (stack.isEmpty()){
            return "YES";
        } else {
            return "NO";
        }
    }
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        scanner.nextLine();

        for (int i = 0; i < n; i++){

            String input = scanner.nextLine();

            System.out.println(IsBalanced(input));

        }
    }
}