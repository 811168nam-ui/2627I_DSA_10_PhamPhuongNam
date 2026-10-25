import javax.sql.rowset.FilteredRowSet;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuickSort_2 {
    public static List<Integer> QuickSort(List<Integer> arr){

        if (arr.size() <= 1){
            return arr;
        }

        int pivot = arr.get(0);
        List<Integer> left = new ArrayList<>();
        List<Integer> right = new ArrayList<>();

        for (int i = 1; i < arr.size(); i++){
            if (arr.get(i) <= pivot){
                left.add(arr.get(i));
            }
            else{
                right.add(arr.get(i));
            }
        }
        List<Integer> sortedLeft = QuickSort(left);
        List<Integer> sortedRight = QuickSort(right);

        sortedLeft.add(pivot);
        sortedLeft.addAll(sortedRight);

        for (Integer integer: sortedLeft){
            System.out.print(integer + " ");
        }
        System.out.println();

        return sortedLeft;

    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        List<Integer> array = new ArrayList<>();

        for (int i = 0; i < n; i++){
            array.add(scanner.nextInt());
        }

        QuickSort(array);
    }
}
