import java.util.Scanner;
public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {10, 20, 58, 90, 34};
        int swap = 0;
        for (int i = 0; i <arr.length/2 ; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
        System.out.print("Reversed array: ");
            for (int i : arr){
                System.out.print(i + ", ");
            }
        System.out.println();
    }
}
