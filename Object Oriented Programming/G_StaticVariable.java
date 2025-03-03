// static part-2
public class G_StaticVariable {
    String universityName1 = "Islamic University";
    static String universityName2 = "Islamic University";


    public static void main(String[] args) {
        G_StaticVariable obj1 = new G_StaticVariable();
        System.out.println("University Name: "+obj1.universityName1);

        // static use korle class er nam dhore access nite hobee....
        System.out.println("University Name: "+ G_StaticVariable.universityName2);
    }
}
