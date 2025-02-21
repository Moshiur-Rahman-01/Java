// Introducing method inside a class
public class B_Teacher {
    String name, gender;
    int phone;

    void displayInformation(){
        System.out.println("Name : " + name);
        System.out.println("Gender : " + gender);
        System.out.println("Phone : " + phone);
    }
    public static void main(String[] args) {
        // teacher 1
        B_Teacher teacher1 = new B_Teacher(); // obeject create and declare...
        teacher1.name = "Moshiur Rahman";
        teacher1.gender = "Male";
        teacher1.phone = 1994183034;
        teacher1.displayInformation();
        
        System.out.println();
        
        // teacher 2
        B_Teacher teacher2 = new B_Teacher(); // obeject create and declare...
        teacher2.name = "Riad";
        teacher2.gender = "Male";
        teacher2.phone = 1994183034;
        teacher2.displayInformation();
    }
}
