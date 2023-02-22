package funtional_interfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        // Consumer
        Consumer<String> c1 = s -> System.out.println(s + " Hau");
        Consumer<String> c2 = s -> System.out.println(s + " Huong Dan Java");
        c1.andThen(c2).accept("Hello");

        // BiConsumer
        BiConsumer<String, String> bc = (a, b) -> System.out.println("Hello: " + a + ", hello: " + b);
        bc.accept("Hau", "Huong Dan Java");

        // Predicate
        List<String> name = Arrays.asList("Khanh", "Quan", "Khang");
        Predicate<String> p1 = s -> s.startsWith("K");
        Predicate<String> p2 = s -> s.endsWith("g");
        name.stream()
                .filter(p1.and(p2))
                .forEach(System.out::println);

        List<String> name1 = Arrays.asList("Khanh", "Quan", "Khang");
        Predicate<String> p3 = s -> s.startsWith("K");
        name1.stream()
                .filter(p3.negate())
                .forEach(System.out::println);

        // Function
        Function<String, Integer> f = (s) -> s.length();
        List<String> names = Arrays.asList("Khanh", "Quan", "Khang");
        names.stream()
                .map(f)
                .forEach(System.out::println);


        Function<String, String> f1 = s -> s.substring(0, 2);
        Function<String, String> f2 = s -> s.toUpperCase();
        List<String> names1 = Arrays.asList("Khanh", "Quan", "Khang");
        names1.stream()
                .map(f1.compose(f2))
                .forEach(System.out::println);
    }
}
