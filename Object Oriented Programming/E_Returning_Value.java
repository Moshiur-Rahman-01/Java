// Returning value....
public class E_Returning_Value {
    int square(int value){
        return value*value;
    }

    public static void main(String[] args) {
        E_Returning_Value obj1 = new E_Returning_Value();
        int result = obj1.square(5);
        System.out.println(result);
    }
}
