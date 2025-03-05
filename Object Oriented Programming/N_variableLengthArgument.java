public class N_variableLengthArgument {

    void add(int ... num){
        int sum = 0;
        for(int x : num){
            sum += x;
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        N_variableLengthArgument obj = new N_variableLengthArgument();
        obj.add(10,20);
        obj.add(10,20,30);
        obj.add(10,20,30,40);
    }
}