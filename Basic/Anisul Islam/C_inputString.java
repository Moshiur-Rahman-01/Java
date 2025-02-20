import java.util.Scanner;
public class C_inputString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name;
        name = input.nextLine();
        System.out.println("Welcome "+name);
    }
}
