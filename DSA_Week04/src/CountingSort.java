import java.util.Scanner;

public class CountingSort {
    public static void Counting(int n, int array[]){

        int[] countarr = new int[100];

        for (int i: countarr){

            i = 0;
        }

        for (int i = 0; i < n; i++){

            countarr[array[i]] += 1;
        }

        for (int i: countarr){

            System.out.print(i + " ");
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        Counting(n,array);
    }
}
