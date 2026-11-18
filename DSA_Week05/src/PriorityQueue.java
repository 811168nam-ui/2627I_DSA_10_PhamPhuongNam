public class PriorityQueue {
    private int[] arr;
    private int size;

    public PriorityQueue(int K){
        this.arr = new int[K];
        this.size = 0;
    }

    public void insert(int value){
        if (size != arr.length){
            arr[size] = value;
            size ++;
        }
        else{
            System.out.println("Queue đã đầy");
        }
    }
    public int deleteMin(){
        if (size != 0){
           int minIndex = 0;
           for (int i = 0; i < size; i++ ){
               if (arr[i] < arr[minIndex]){
                   minIndex = i;
               }
           }
           int minValue = arr[minIndex];

           arr[minIndex] = arr[size-1];
           size--;

           return minValue;
        }
        else{
            System.out.println("Lỗi Queue không có phần tử nào");
            return -1;
        }
    }
    public static void main(String[] args){
        PriorityQueue priorityQueue = new PriorityQueue(10);
        priorityQueue.insert(5);
        priorityQueue.insert(4);
        priorityQueue.insert(2);
        priorityQueue.insert(10);
        priorityQueue.insert(7);

        System.out.println(priorityQueue.deleteMin());
        System.out.println(priorityQueue.deleteMin());
    }

}
