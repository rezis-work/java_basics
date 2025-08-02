package abstraction;

public class ShapeTester {

    public static void main(String[] args) {
        Shape rectangle = new Rectangle(20, 10);
        rectangle.print();
        System.out.println(rectangle.calculateArea());
    }
}
