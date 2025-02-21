// Introduction to OOP | class, object
public class A_Teacher {
    String name, gender;
    int phone;

    public static void main(String[] args) {
        // teacher 1
        A_Teacher teacher1 = new A_Teacher(); // obeject create and declare...

        teacher1.name = "Moshiur Rahman";
        teacher1.gender = "Male";
        teacher1.phone = 1994183034;

        System.out.println("Name : " + teacher1.name);
        System.out.println("Gender : " + teacher1.gender);
        System.out.println("Phone : " + teacher1.phone);


        System.out.println();
        // teacher 2
        A_Teacher teacher2 = new A_Teacher(); // obeject create and declare...

        teacher2.name = "Riad";
        teacher2.gender = "Male";
        teacher2.phone = 1994183034;

        System.out.println("Name : " + teacher2.name);
        System.out.println("Gender : " + teacher2.gender);
        System.out.println("Phone : " + teacher2.phone);
    }
}
