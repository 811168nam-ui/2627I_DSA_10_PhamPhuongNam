import java.util.Scanner;

public class IntroToChallenges {
    public static int BinarySearch(int[] arr, int n){

        int left = 0;
        int right = arr.length;
        int mid = (left + right)/2;

        while ((left != right) && n != arr[mid]){
            if (n < arr[mid]){
                right = mid;
            }
            else if (n > arr[mid]){
                left = mid;
            }
            mid = (left + right)/2;
        }
        return mid;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int V_num = scanner.nextInt();
        int length_num = scanner.nextInt();

        int[] array = new int[length_num];

        for (int i = 0; i < length_num; i++){
            array[i] = scanner.nextInt();
        }
        System.out.println(BinarySearch(array,V_num));
    }
}