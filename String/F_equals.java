public class F_equals {
    public static void main(String[] args) {
        String s1 = "Moshiur Rahman";
        String s2 = "Moshiur Rahman";

        // Equal kina check korbe...
        if(s1 == s2){
            System.out.println("Equals");
        }
        else{
            System.out.println("Not equals");
        }

        System.out.println(s1.equals(s2));

        // boro choto kichu mone korbe na...
        String s3 = "Moshiur";
        String s4 = "moshiur";
        System.out.println(s3.equalsIgnoreCase(s4));
    }
}
