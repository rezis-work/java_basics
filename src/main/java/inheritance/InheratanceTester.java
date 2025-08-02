package inheritance;

import objects.Rectangle;

public class InheratanceTester {
    public static void main(String[] args) {
//        Person person = new Person();
//        Employee employee = new Employee();

        Square square = new Square();
        square.setLength(20);
        System.out.println(square.calculatePerimeter());

        Rectangle rectangle = new Rectangle();

        rectangle.print();

        square.print("square");
    }
}
