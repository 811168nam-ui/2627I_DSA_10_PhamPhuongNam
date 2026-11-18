import java.util.Scanner;

public class Palindrome{

    public static void isPalindrome(String string){
        if (string.isEmpty()  || string.length() == 1){
            System.out.println("Yes");
        }
        else{
            String str = string.toLowerCase();
            int left = 0;
            int right = string.length() - 1;
            while ( left < right){
                if (str.charAt(left) != str.charAt(right)){
                    System.out.println("No");
                    return;
                }
                else{
                    left++;
                    right--;
                }
            }
            System.out.println("Yes");
        }
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        isPalindrome(s);
    }
}