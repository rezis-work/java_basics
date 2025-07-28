package objects;

public class HomeAreaCalculator {

    public static void main(String[] args) {

        Rectangle room1 = new Rectangle();
        room1.setLength(50);
        room1.setWidth(25);
        double areOfRoom1 = room1.calculateArea();

        Rectangle room2 = new Rectangle(30, 75);
        double areOfRoom2 = room2.calculateArea();

        double totalArea = areOfRoom1 + areOfRoom2;

        System.out.println("Area of both rooms: " + totalArea);
    }
}
