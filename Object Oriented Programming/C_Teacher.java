// Parametrised method inside a class
public class C_Teacher {
    String name, gender;
    int phone;

    void setInformation(String n,String g, int p){
        name = n;
        gender = g;
        phone = p;
    }
    void displayInformation() {
        System.out.println("Name : " + name);
        System.out.println("Gender : " + gender);
        System.out.println("Phone : " + phone);
        System.out.println();
    }

    public static void main(String[] args) {
        // teacher 1
        C_Teacher teacher1 = new C_Teacher(); // obeject create and declare...
        teacher1.setInformation("Moshiur Rahman", "Male", 1994183034);
        teacher1.displayInformation();


        // teacher 2
        C_Teacher teacher2 = new C_Teacher(); // obeject create and declare...
        teacher2.setInformation("Riad", "Male", 1994183034);
        teacher2.displayInformation();
    }
}
