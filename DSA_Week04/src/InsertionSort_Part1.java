import java.util.Scanner;

public class InsertionSort_Part1 {
    public static void insertion(int n, int[] arr){

        int target = arr[n-1];

        int i = n - 2;

        while (i >= 0 && arr[i] > target){

            arr[i + 1] = arr[i];

            Print(arr);

            i--;
        }
        arr[i + 1] = target;

        Print(arr);
    }
    public static void Print(int[] array){
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }


    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        insertion(n,array);

    }

}
