import java.util.Scanner;
import java.util.Stack;

public class QueueTwoStack {
    Stack<Integer> stack_1 = new Stack<>();
    Stack<Integer> stack_2 = new Stack<>();

    public void Enqueue(int x){

            stack_1.push(x); // cứ có enqueue là push hết vào stack1 không quan tâm stack2 có hay ko có phần tử.
    }
    public static void Move(Stack<Integer> stack1, Stack<Integer> stack2){

        while (!stack1.isEmpty()){

            stack2.push(stack1.pop());
        }

    }
    public void Dequeue(){

        if (stack_2.isEmpty()){

            Move(stack_1,stack_2); // pop đến khi nào hết phần tử trong stack2 thì move phần tử từ stack1 qua.
        }

        stack_2.pop();

    }
    public void Print(){

        if (stack_2.isEmpty()){

            Move(stack_1,stack_2);//nếu stack2 bị Dequeue hết thì lấy phần từ từ stack1 qua thì mới print được
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
