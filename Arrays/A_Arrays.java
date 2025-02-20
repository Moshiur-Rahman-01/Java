public class A_Arrays {
    public static void main(String[] args) {
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        System.out.println(cars[0]);

        String[] Cars = {"Volvo", "BMW", "Ford", "Mazda"};
        Cars[0] = "Opel";
        System.out.println(Cars[0]);
    }
}
