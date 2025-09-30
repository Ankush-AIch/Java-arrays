import java.util.Scanner;
public class Avg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {10, 20, 30, 40, 50};
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        System.out.println("The average element in the array is " + sum/arr.length);
    }
}
