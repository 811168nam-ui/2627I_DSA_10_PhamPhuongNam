import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FindTheMedian {
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

        return sortedLeft;

    }
    public static int FindMed(List<Integer> arr){
        int MedIndex = arr.size() / 2;

        List<Integer> sortedArray = QuickSort(arr);

        return sortedArray.get(MedIndex);
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        List<Integer> array = new ArrayList<>();

        for (int i = 0; i < n; i++){
            array.add(scanner.nextInt());
        }
        System.out.println(FindMed(array));
    }
}
