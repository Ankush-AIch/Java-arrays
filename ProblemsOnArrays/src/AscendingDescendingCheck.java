import java.util.Scanner;
public class AscendingDescendingCheck {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = in.nextInt();
        int[] arr = new int[n];
        boolean isAscending = true;
        boolean isDescending = true;

        //for-loop for checking the array.
        System.out.println("Enter " + n + " elements of the desired array: ");
        for (int i = 0; i < arr.length ; i++) {
            arr[i] = in.nextInt();
        }

        //if the array is in ascending order.
        for (int i = 0; i < n - 1 ; i++) {
            if (arr[i] > arr[i+1]){
                isAscending = false;
                break;
            }
            }
        //if array is in descending order.
        for (int i = 0; i < n - 1 ; i++) {
            if (arr[i] < arr[i+1]) {
                isDescending = false;
                break;
            }
        }

        //now the printing part
        if (isAscending) {
            System.out.println("The array is in ascending order.");
        }
        else if (isDescending) {
            System.out.println("The array is in descending order.");
        }
        else {
            System.out.println("The given array is not sorted.");
        }
    }
}
