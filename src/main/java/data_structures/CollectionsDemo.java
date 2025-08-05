package data_structures;

import java.util.*;

public class CollectionsDemo {

    public static void main(String[] args) {
//        setDemo();
        listDemo();
//        queueDemo();
//        mapDemo();

    }
    public static void setDemo() {
        Set fruits = new HashSet();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("lemon");
        fruits.add("apple");

        var i = fruits.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }

//        System.out.println(fruits);
//
//        fruits.remove("lemon");
//
//        System.out.println("contains lemon? " + fruits.contains("lemon"));
//
//        System.out.println(fruits);
//
//        System.out.println("size: " + fruits.size());
//
//        Set moreFruit = Set.of("pear", "raisin", "cherry");
//
//        moreFruit.add("strawberry"); we cant do it after using Set.of()
//
//        System.out.println(moreFruit);
    }

    public static void listDemo() {
        List<String> fruits = new ArrayList<String>();

        fruits.add("apple");
        fruits.add("lemon");
        fruits.add("banana");
        fruits.add("orange");

        fruits.set(2, "cherry");
        fruits.add("lemon");

//        for (String fruit: fruits) {
//            System.out.println(fruit);
//        }

        fruits.forEach(System.out::println); // with shortcut -> method reference

        fruits.forEach(f -> {
            f = "fruit: " + f;
            System.out.println(f);
        });

//        fruits.remove("lemon"); removes first found
//        fruits.remove(3);

//        System.out.println("index 2: " + fruits.get(2));
//        System.out.println(fruits.indexOf("orange") + " is index of orange");
//        System.out.println("last index of lemon: " + fruits.lastIndexOf("lemon"));
//
//        System.out.println(fruits);
//
//        List moreFruit = List.of("cherry", "plum", "chiwi");
//
//        System.out.println(moreFruit);
//        System.out.println(moreFruit.toArray().length);
    }

    public static void queueDemo() {
        Queue fruits = new LinkedList();

        fruits.add("apple");
        fruits.add("lemon");
        fruits.add("banana");
        fruits.add("orange");
        fruits.add("lemon");

        var removed = fruits.remove();

        System.out.println("removed: " + removed.toString().toUpperCase());
        System.out.println("head of queue: " + fruits.peek());

        System.out.println(fruits);
    }

    public static void mapDemo() {
        Map<String, Integer> fruitCalories = new HashMap<String, Integer>();

        fruitCalories.put("apple", 95);
        fruitCalories.put("lemon", 20);
        fruitCalories.put("banana", 105);
        fruitCalories.put("orange", 45);
        fruitCalories.putIfAbsent("lemon", 17); // check and not overriding
        fruitCalories.remove("lemon");

//        for (Map.Entry<String, Integer> calorieInfo : fruitCalories.entrySet()) {
//            System.out.println(calorieInfo.getKey() + ": " + calorieInfo.getValue());
//        }

        fruitCalories.forEach((k, v) -> System.out.println(k + " calory is: " + v));


//        System.out.println(fruitCalories);
//        System.out.println("banana calories: " + fruitCalories.get("banana"));
//        System.out.println("contains orange? " + fruitCalories.containsKey("orange"));
//
//        Map immutableFruitCalories = Map.of("apple", 95, "banane", 20);
//
//        System.out.println(immutableFruitCalories);
    }
}
