public class ResizeArrayStack {
    String[] strings = new String[1];
    int N = 0;

    public void push(String s) {
        if (N == strings.length){
            resize(2*strings.length);
        }
        strings[N++] = s;
    }

    public String pop() {
        String Temporal = strings[--N];
        strings[N] = null;
        if (N > 0 && N == strings.length / 4){
            resize(strings.length/2);
        }
        return Temporal;
    }

    public void resize(int capacity){
        String[] copy = new String[capacity];
        for (int i = 0; i < N; i++){
            copy[i] = strings[i];
        }
        strings = copy;
    }

    public void printStack() {
        for (int i = N - 1; i >= 0; i--) {
            if (strings[i] != null) {
                System.out.print(strings[i] + " ----->");
            }
        }
        System.out.println("Null");
    }
    public static void main(String[] args){
        ResizeArrayStack stack = new ResizeArrayStack();
        stack.push("1");
        stack.push("2");
        stack.push("3");
        stack.printStack();
        stack.pop();
        stack.printStack();
    }
}