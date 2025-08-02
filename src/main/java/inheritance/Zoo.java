package inheritance;

public class Zoo {
    public static void main(String[] args) {
        Dog rocky = new Dog();
        rocky.fetch();

        feed(rocky);

        rocky.makeSound();

        Animal sasha = new Dog();
        sasha.makeSound();
        feed(sasha);


        sasha = new Cat();
        feed(sasha);
        sasha.makeSound();

        Cat newCat = ((Cat)sasha); // using cating we can save in variable and then reuse it
        newCat.scratch();
        ((Cat)sasha).scratch(); // casting example
//        sasha.scartch(); we cant after casting
    }

    public static void feed(Animal animal) {
        if (animal instanceof Dog) {
            System.out.println("here's your dog food.");
        } else if (animal instanceof Cat) {
            System.out.println("here is your cat food.");
        } else {
            System.out.println("no food for you cuz its not animal");
        }
    }
}
