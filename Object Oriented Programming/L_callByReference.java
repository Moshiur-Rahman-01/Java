public class L_callByReference {
    String name;
    void change(L_callByReference r2){
        r2.name = "Riad";
    }

    public static void main(String[] args) {
        L_callByReference r1 = new L_callByReference();
        r1.name = "Moshiur";
        System.out.println("before calling: " + r1.name);

        r1.change(r1);
        System.out.println("after calling: " + r1.name);
    }
}

// call by reference e value change hoye jai...
