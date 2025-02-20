import java.util.Scanner;

public class Assignment_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int id;
        String title,price,description,category;

        System.out.print("Enter your id: ");
        id = input.nextInt();
        System.out.println("Id = "+id);
        
        input.nextLine(); 

        System.out.print("Enter your title: ");
        title = input.nextLine();
        System.out.println("Title = "+title);

        System.out.print("Enter price: ");
        price = input.nextLine();
        System.out.println("Price = "+price);

        System.out.print("Enter description: ");
        description = input.nextLine();
        System.out.println("Description = "+description);

        System.out.print("Enter category: ");
        category = input.nextLine();
        System.out.println("Category = "+category);
    }
}
