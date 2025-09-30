import java.util.Scanner;
public class Count {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {6, 7, 3, 3, 4};
        System.out.println("Enter the number you want to count: ");
        int target = sc.nextInt();
        boolean found = false;
        int count = 0;
        for (int i : arr) {
            if (i == target) {
                count++;
                found = true;
            }
        }
        if (found) {
            System.out.println("The number " + target + " has appeared " + count + " times in the array");
        }
        else {
            System.out.println("The number " + target + " is not present in the array.");
        }
    }
}
