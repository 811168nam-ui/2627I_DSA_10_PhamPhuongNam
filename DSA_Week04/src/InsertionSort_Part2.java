import java.util.Scanner;

public class InsertionSort_Part2 {
    public static void insertion(int n, int[] arr){

        for (int k = 1; k < n; k++ ){

            int target = arr[k];

            int i = k - 1;

            while (i >= 0 && arr[i] > target){

                arr[i + 1] = arr[i];

                i--;
            }
            arr[i + 1] = target;

            Print(arr);
        }

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
