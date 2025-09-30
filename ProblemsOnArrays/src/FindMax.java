public class FindMax {
    public static void main(String[] args) {
        int[] arr = {12, 47, 5, 89, 34, 23, 90, 11};
        int max = arr[0];
        for (int i : arr){
            if (max < i){
              max = i;
            }
        }
        System.out.println("The maximum number is the array is " + max);
    }
}
