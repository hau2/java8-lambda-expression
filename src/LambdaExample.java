interface Animal {
    void makeSound();
}

//class Cat implements Animal {
//
//    @Override
//    public void makeSound() {
//        System.out.println("Cat: Meow");
//    }
//}
//
//class Dog implements Animal {
//
//    @Override
//    public void makeSound() {
//        System.out.println("Dog: Woof Woof!");
//    }
//}
//
//class Chicken implements Animal {
//
//    @Override
//    public void makeSound() {
//        System.out.println("Chicken: Cluck-Cluck!");
//    }
//}

public class LambdaExample {

    public static void main(String[] args) {
        Animal cat = () -> System.out.println("Cat: Meow");
        cat.makeSound();

        Animal dog = () -> System.out.println("Dog: Woof Woof!");
        dog.makeSound();

        Animal chicken = () -> System.out.println("Chicken: Cluck-Cluck!");
        chicken.makeSound();

        print(cat);
        print(dog);
        print(chicken);

    }

    private static void print(Animal animal) {
        animal.makeSound();
    }
}
