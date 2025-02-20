public class D_indexOf {
    public static void main(String[] args) {
        String txt = "Please locate where 'locate' occurs!";
        
        // koto number index e ache check koree....
        System.out.println(txt.indexOf("locate"));

        System.out.println("first position of o = "+ txt.indexOf("o"));

        // ek e rokom hishab korbe kintu khujbe last theke...
        System.out.println("last position of o = "+txt.lastIndexOf("o"));
    }
}
