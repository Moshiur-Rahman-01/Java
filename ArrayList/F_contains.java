import java.util.ArrayList;

public class F_contains {
    public static void main(String[] args) {
        ArrayList<Integer> number = new ArrayList<Integer>();
        System.out.println("size = " + number.size());

        // adding elements...
        number.add(10);
        number.add(20);
        number.add(30);
        number.add(3, 40);

        System.out.println(number);
        System.out.println("size = " + number.size());

        // kono element ache kina check kore...
        System.out.println("ArrayList e ache kina : " + number.contains(30));

        System.out.println("ArrayList e ache kina : " + number.contains(15));
    }
}
