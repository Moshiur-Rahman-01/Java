public class P_split {
    public static void main(String[] args) {
        String s1 = "This is my country";

        // string theke array te convert korbe bivinno upaye...
        String[] s2 = s1.split("");
        for(String x : s2){
            System.out.println(x);
        }

        System.out.println();
        String[] s3 = s1.split(" ");
        for (String x : s3) {
            System.out.println(x);
        }
    }
}
