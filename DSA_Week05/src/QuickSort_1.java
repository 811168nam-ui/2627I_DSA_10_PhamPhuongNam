import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuickSort_1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] array = new int[n];
        int[] result = new int[n];

        for (int i = 0; i < n; i++){
            array[i] = scanner.nextInt();
        }

        int left = 0;
        int right = n-1;

        for (int i = 1; i < n; i++){
            if (array[i] <= array[0]){
                result[left] = array[i];
                left++;
            }
            else if (array[i] > array[0]){
                result[right] = array[i];
                right--;
            }
        }
        result[left] = array[0];
        for (int i: result){
            System.out.print(i + " ");
        }


    }
}
