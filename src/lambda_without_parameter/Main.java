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
        Animal cat = new Animal() {
            @Override
            public void makeSound() {
                System.out.println("Cat: Meow");
            }
        };
        cat.makeSound(); // "Cat: Meow"

        Animal dog = new Animal() {
            @Override
            public void makeSound() {
                System.out.println("Dog: Woof Woof!");
            }
        };
        dog.makeSound(); // "Dog: Woof Woof!"

        Animal chicken = new Animal() {
            @Override
            public void makeSound() {
                System.out.println("Chicken: Cluck-Cluck!");
            }
        };
        chicken.makeSound(); // "Chicken: Cluck-Cluck!"



        Animal cat1 = () -> System.out.println("Cat: Meow");
        cat1.makeSound(); // "Cat: Meow"

        Animal dog1 = () -> System.out.println("Dog: Woof Woof!");
        dog1.makeSound(); // "Dog: Woof Woof!"

        Animal chicken1 = () -> System.out.println("Chicken: Cluck-Cluck!");
        chicken1.makeSound(); // "Chicken: Cluck-Cluck!"
    }
}
