import java.util.Arrays;

public class F_copyOf {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int[] copyNumbers = Arrays.copyOf(numbers, numbers.length); // অ্যারে কপি করা
        System.out.println(Arrays.toString(copyNumbers)); // আউটপুট: [1, 2, 3, 4, 5]
    }
}
