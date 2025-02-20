import java.util.Arrays;

public class E_sort {
    public static void main(String[] args) {
        int[] numbers = {10,-3,18,5,25};
        System.out.print("Before sort: ");
        for(int i=0; i<numbers.length; i++){
            System.out.print(numbers[i] + " ");
        }

        System.out.println();

        Arrays.sort(numbers);
        System.out.print("After sort: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }

        System.out.println();

        System.out.print("After sort: ");
        for (int i = numbers.length-1; i >=0 ; i--) {
            System.out.print(numbers[i] + " ");
        }
    }
}
