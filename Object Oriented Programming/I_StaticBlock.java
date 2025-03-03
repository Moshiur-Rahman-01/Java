public class I_StaticBlock {
    static int id;
    static String name;

    static{
        id = 101;
        name = "Anis";
    }

    static void display(){
        System.out.println("id : " + id);
        System.out.println("name : " + name);
    }

    public static void main(String[] args) {
        I_StaticBlock.display();
    }
}
