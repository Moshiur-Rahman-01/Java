import java.util.ArrayList;

public class C_remove {
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

        // foreach loop..
        for (int x : number) {
            System.out.print(x + " ");
        }

        System.out.println();
        // after removing..
        number.remove(1);
        System.out.println("After removing: " + number);

        // after removing all...
        number.removeAll(number);
        System.out.println("After removing all : " + number);
    }
}
