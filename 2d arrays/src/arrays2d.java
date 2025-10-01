import java.util.Scanner;
public class arrays2d {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
      int[][] arr = new int[2][3]; //declaring a 2d array.
        System.out.println("Enter the elements of the array.");

        //taking input
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                arr[row][col] = in.nextInt();
            }
        }
        //For the output.
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }
    }
}