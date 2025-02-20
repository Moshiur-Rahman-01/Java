public class C_FormatSpecifier {
    public static void main(String[] args){
        boolean b = true;
        char c = 'a';
        short s = 32677;
        int i = 112434;
        float f = 10.3f;
        double d = 10.4489384;

        System.out.printf("Boolean b = %b\n",b);
        System.out.printf("Character c = %c\n",c);
        System.out.printf("Short s = %d\n",s);
        System.out.printf("Integer i = %d\n",i);
        System.out.printf("Float f = %.1f\n",f);
        System.out.printf("Double d = %.3f\n",d);
    }
}