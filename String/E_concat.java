public class E_concat {
    public static void main(String[] args) {
        String firstName = "John";
        String lastName = "Doe";
        System.out.println(firstName + " " + lastName);

        String firstname = "John ";
        String lastname = "Doe";
        System.out.println(firstname.concat(lastname));

        String x = "10";
        String y = "20";
        String z = x + y;
        System.out.println(z);

        String a = "10";
        int b = 20;
        String c = a + b;
        System.out.println(c);
    }
}
