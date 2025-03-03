public class H_StaticMethod {
    void display1(){
        System.out.println("I am Moshiur.");
    }

    static void display2(){
        System.out.println("I am a student.");
    }

    public static void main(String[] args) {
        H_StaticMethod obj1 = new H_StaticMethod();
        obj1.display1();

        H_StaticMethod.display2();
    }
}
