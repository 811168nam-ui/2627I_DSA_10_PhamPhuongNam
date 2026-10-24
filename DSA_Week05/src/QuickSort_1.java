import javax.xml.transform.Result;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuickSort_1 {
    public static int[] Quicksort(int[] array){
        int[] result = new int[array.length];
        int left = 0;
        int right = array.length-1;

        for (int i = 1; i < array.length; i++){
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
        return result;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] array = new int[n];

        for (int i = 0; i < n; i++){
            array[i] = scanner.nextInt();
        }

        int[] result = Quicksort(array);

        for (int i: result){
            System.out.print(i + " ");
        }


    }
}
