import javax.print.attribute.SetOfIntegerSyntax;
import java.time.temporal.Temporal;

public class ArrayStack {
    String[] strings;
    int N = 0;

    public ArrayStack(int capacity){
        strings = new String[capacity];
    }
    public void push(String s){
        strings[N++] = s;
    }
    public String pop(){
        String Temporal = strings[--N];
        strings[N] = null;
        return Temporal;
    }
    public void printStack(){
        for (int i = N - 1; i >= 0 ; i--){
            if (strings[i] != null){
                System.out.print(strings[i] + " ----->");
            }
        }
        System.out.println("Null");
    }
    public static void main(String[] args){
        ArrayStack stack = new ArrayStack(5);
        stack.push("hi");
        stack.push("ha");
        stack.push("hu");
        stack.printStack();
        System.out.println(stack.pop());
        stack.printStack();



    }
}
