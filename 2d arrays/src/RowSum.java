import java.util.Scanner;
public class RowSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] arr = new int[3][3];
        
        //taking input.
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arr[i][j] = in.nextInt();
            }
        }
      //calculating row sums.
        for (int i = 0; i < 3; i++) {
            int sum = 0;
            for (int j = 0; j < 3; j++) {
               sum += arr[i][j];
            }
            System.out.println("Rows " + (i + 1) + " sum = " + sum);
        }
    }
}