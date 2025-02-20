public class C_Example {
    public static void main(String[] args) {
        int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
        for (int i = 0; i < myNumbers.length; ++i) {
            for(int j = 0; j < myNumbers[i].length; ++j) {
                System.out.print(myNumbers[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println(myNumbers.length); 
        System.out.println(myNumbers[0].length);
    }
}
