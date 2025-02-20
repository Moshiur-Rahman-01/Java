import java.util.ArrayList;

public class E_isEmpty {
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

        // kono element thakle false dekhabe...
        System.out.println("ArrayList empty : " + number.isEmpty());

        number.clear();
        System.out.println("ArrayList empty : " + number.isEmpty());
    }
}
