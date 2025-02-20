import java.util.ArrayList;

public class H_set_get {
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

        // kono element er index check kore...
        System.out.println("After setting index of 3 : " + number.set(3, 50));

        System.out.println("After setting of Array: " + number);

        System.out.println("After getting : " + number.get(3));
    }
}
