public class M_callByValue {
    void change(int i){
        i = 20;
    }

    public static void main(String[] args) {
        M_callByValue obj = new M_callByValue();
        int x = 10;
        System.out.println("x before call: " + x);

        obj.change(x);
        System.out.println("x after call: " + x);
    }
}
