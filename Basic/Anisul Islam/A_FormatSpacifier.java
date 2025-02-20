public class A_FormatSpacifier {
    public static void main(String[] args) {
        boolean b = true;
        char c = 'a';
        short s = 32377;
        int i = 12655;
        float f = 10.3f;
        double d = 10.33;

        System.out.printf("boolean b = %b\n", b);
        System.out.printf("character c = %c\n", c);
        System.out.printf("short s = %d\n", s);
        System.out.printf("integer i = %d\n", i);
        System.out.printf("float f = %.2f\n", f);
        System.out.printf("double d = %f\n", d);
    }
}
