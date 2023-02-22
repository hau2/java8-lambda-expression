package lambda_without_parameter;

public class Main {
    class Cat implements Animal {
        @Override
        public void makeSound() {System.out.println("Cat: Meow");}
    }

    class Dog implements Animal {
        @Override
        public void makeSound() {System.out.println("Dog: Woof Woof!");}
    }

    class Chicken implements Animal {
        @Override
        public void makeSound() {System.out.println("Chicken: Cluck-Cluck!");}
    }

    public static void main(String[] args) {
        Animal cat = () -> System.out.println("Cat: Meow");
        cat.makeSound(); // "Cat: Meow"

        Animal dog = () -> System.out.println("Dog: Woof Woof!");
        dog.makeSound(); // "Dog: Woof Woof!"

        Animal chicken = () -> System.out.println("Chicken: Cluck-Cluck!");
        chicken.makeSound(); // "Chicken: Cluck-Cluck!"
    }
}
