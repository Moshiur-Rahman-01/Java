import java.util.Scanner;
public class B_inputUser {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;
        System.out.print("Enter any number: ");
        number = input.nextInt();
        System.out.println("Number = "+number);

        double num;
        System.out.print("Enter any double value: ");
        num = input.nextDouble();
        System.out.println(num);
    }
}
