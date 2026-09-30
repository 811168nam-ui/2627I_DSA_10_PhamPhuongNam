public class LinkedStack{

    private class Node{
        String item;
        Node next;
    };

    Node first = null;

    public void push(String item){
        Node old_first = first;
        first = new Node();
        first.item = item;
        first.next = old_first;

    };

    public String pop(){
        String item = first.item;
        first = first.next;
        return item;
    };

    public void printStack(){

        Node current = first;

        while (current != null){
            System.out.print(current.item + "---> " );
            current = current.next;
        }
        System.out.println("Null");
    }

    public static void main(String[] args){
        LinkedStack stack = new LinkedStack();
        stack.push("alo");
        stack.push("ok");
        stack.push("Xinloi");
        stack.printStack();
        System.out.println(stack.pop());
        stack.printStack();
        System.out.println(stack.pop());
        stack.printStack();
    }
};
