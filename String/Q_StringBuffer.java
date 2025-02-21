public interface Q_StringBuffer {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Moshiur");
        System.out.println(sb);

        // append method...
        sb.append(" Rahman ");
        sb.append(24);
        
        System.out.println(sb);


        // reverse method...
        sb.reverse();
        System.out.println(sb);

        // ager moto ...
        sb.reverse();
        System.out.println(sb);

        // delete method..
        sb.delete(0, 8);
        System.out.println(sb);

        // length set koree kete newa...
        sb.setLength(6);
        System.out.println(sb);
    }
}
