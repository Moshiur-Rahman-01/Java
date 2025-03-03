// static keyword er kaj....
public class F_Student {
    String name;
    int id;
    static String universityName = "Islamic University";

    F_Student(String n, int i){
        name = n;
        id = i;
    }

    void displayInformation(){
        System.out.println("Name : " + name);
        System.out.println("Id : " + id);
        System.out.println("University Name : " + universityName);
    }

    public static void main(String[] args) {
        F_Student obj1 = new F_Student("Moshiur Rahman", 2118005);
        obj1.displayInformation();

        System.out.println();

        F_Student obj2 = new F_Student("Riad", 2118004);
        obj2.displayInformation();
    }
}
