import java.util.Scanner;
public class IsSortedInAscending {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        System.out.println("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        boolean isSorted = true;
        System.out.println("Enter " + n + " elemenst: ");
        //reading all elements.
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        //the checking part
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                isSorted = false;
                break;
            }
        }
        if (isSorted) {
            System.out.println("Array is sorted in ascending order.");
        }
        else {
            System.out.println("Array is not sorted.");
        }
    sc.close();
    }
}
