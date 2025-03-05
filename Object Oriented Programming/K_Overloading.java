public class K_Overloading {
    void add(int a, int b){
        System.out.println(a+b);
    }


    void add(double a, double b){
        System.out.println(a+b);
    }

    void add(int a, int b, int c){
        System.out.println(a+b+c);
    }

    void add(){
        System.out.println("Nothing to add");
    }

    public static void main(String[] args) {
        K_Overloading obj = new K_Overloading();
        obj.add();
        obj.add(5,6);
        obj.add(5.3,6.9);
        obj.add(4,5,6);
    }
}
