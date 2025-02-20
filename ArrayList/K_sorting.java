import java.util.ArrayList;
import java.util.Collections;

public class K_sorting {
    public static void main(String[] args) {
        ArrayList<Integer> number = new ArrayList<>();

        number.add(20);
        number.add(-3);
        number.add(18);
        number.add(92);
        number.add(2);
        number.add(0);

        System.out.println("Before sorting: "+number);

        Collections.sort(number);
        System.out.println("after sorting in ascending: "+number);

        Collections.sort(number,Collections.reverseOrder());
        System.out.println("after sorting in descending: " + number);
    }
}
