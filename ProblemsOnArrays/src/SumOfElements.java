public class SumOfElements {
    public static void main(String[] args) {
        int [] arr= {5, 23, 86, 90, 54, 67, 45, 89, 90};
        int sum = 0;
        for (int i : arr){
            sum += i;
        }
        System.out.println("The sum of the array is " + sum);

    }
}