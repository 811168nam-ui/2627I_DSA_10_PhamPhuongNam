import java.util.Scanner;
import java.util.Stack;

public class QueueTwoStack {
    Stack<Integer> stack_1 = new Stack<>();
    Stack<Integer> stack_2 = new Stack<>();

    public void Enqueue(int x){

            stack_1.push(x);
    }
    public static void Move(Stack<Integer> stack1, Stack<Integer> stack2){

        while (!stack1.isEmpty()){

            stack2.push(stack1.pop());
        }

    }
    public void Dequeue(){

        if (stack_2.isEmpty()){

            Move(stack_1,stack_2);
        }

        stack_2.pop();

    }
    public void Print(){

        if (stack_2.isEmpty()){

            Move(stack_1,stack_2);
        }

        System.out.println(stack_2.peek());
    }
    public static void main(String[] args){

        QueueTwoStack queueTwoStack = new QueueTwoStack();

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        scanner.nextLine();

        for (int i = 0; i < n; i++){

            int type  = scanner.nextInt();

            if (type == 1){

                int x = scanner.nextInt();

                queueTwoStack.Enqueue(x);
            } else if (type == 2) {

                queueTwoStack.Dequeue();

            } else if (type == 3) {

                queueTwoStack.Print();

            }

        }
        scanner.close();

    }
}
