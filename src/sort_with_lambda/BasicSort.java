package sort_with_lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class BasicSort {

    public static void main(String[] args) {
        List<Human> humans = Arrays.asList(
                new Human("Nguyen Van Foo", 10),
                new Human("Nguyen Van Bar", 10)
        );

        // sort without lambda
        Collections.sort(humans, new Comparator<Human>() {
            @Override
            public int compare(Human h1, Human h2) {
                return h1.getName().compareTo(h2.getName());
            }
        });

        // sort with lambda
        humans.sort((Human h1, Human h2) -> h1.getName().compareTo(h2.getName()));

        // sort with lambda No Type Definitions
        humans.sort((h1, h2) -> h1.getName().compareTo(h2.getName()));

        // sort with method reference
        humans.sort(Human::compareByNameThenAge);

        // Sort With Multiple Conditions
        humans.sort(
                Comparator.comparing(Human::getName).thenComparing(Human::getAge)
        );

        List<String> letters = Arrays.asList("B", "A", "C");

        List<String> reverseSortedLetters = letters.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());

        // Sorting a List in Reverse With Stream.sorted()
        Comparator<Human> reverseNameComparator =
                (h1, h2) -> h2.getName().compareTo(h1.getName());

        List<Human> reverseSortedHumans = humans.stream().sorted(reverseNameComparator)
                .collect(Collectors.toList());
    }
}
