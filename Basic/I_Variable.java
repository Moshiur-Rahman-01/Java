public class I_Variable {
    public static void main(String[] args) {
        String name = "Moshiur Rahman";
        System.out.println(name);

        int myNum = 15;
        System.out.println(myNum);

        int mynum;
        mynum = 150;
        System.out.println(mynum);

        int Num = 15;
        Num = 20;  // Num is now 20
        System.out.println(Num);

        final int yNum = 15;
        //yNum = 20; // will generate an error
        System.out.println(yNum);
    }
}
