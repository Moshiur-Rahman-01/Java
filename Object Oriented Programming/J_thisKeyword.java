// instance variable r local variable same holee this keyword use korte hoi...
public class J_thisKeyword {
    double height, width, depth; // instance variable...

    J_thisKeyword(double height, double width, double depth){
        this.height = height;
        this.width = width;
        this.depth = depth;
    }

    void display(){
        double vol = height*width*depth;
        System.out.println("Volume is : " + vol);
    }

    public static void main(String[] args) {
        J_thisKeyword obj1 = new J_thisKeyword(10,20,30);
        obj1.display();
    }
}
