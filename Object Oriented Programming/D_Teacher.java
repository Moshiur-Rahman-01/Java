// Constructor
// eder k overloading constructor o bola jete paree... 
// function nam sm thakbe kintu parameter gulo alada hote paree...
public class D_Teacher {
    String name, gender;
    int phone;

    // Default Constructor...
    D_Teacher(){
        System.out.println("Default Constructor...");
    }

    // Parameterized Constructor....
    D_Teacher(String n, String g, int p){
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
        D_Teacher teacher1 = new D_Teacher(); // obeject create and declare...
        teacher1.displayInformation();

        // teacher 2
        D_Teacher teacher2 = new D_Teacher("Riad", "Male", 1994183034); // obeject create and declare...
        teacher2.displayInformation();
    }
}
