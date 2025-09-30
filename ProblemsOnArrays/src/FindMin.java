public class FindMin {
    public static void main(String[] args) {
        int[] arr = {12, 47, 5, 89, 34, 23, 90, 11};
        int min = arr[0];
        for (int i : arr) {
            if (min > i ) {
                min = i;
            }
        }
        System.out.println("The minimum number in the array is " + min);
    }
}
