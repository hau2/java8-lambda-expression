package lambda_exceptions;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class HandlingUncheckedException {

    static Consumer<Integer> lambdaWrapper(Consumer<Integer> consumer) {
        return i -> {
            try {
                consumer.accept(i);
            } catch (ArithmeticException e) {
                System.err.println(
                        "Arithmetic Exception occured : " + e.getMessage());
            }
        };
    }

    static <T, E extends Exception> Consumer<T>
    consumerWrapper(Consumer<T> consumer, Class<E> clazz) {

        return i -> {
            try {
                consumer.accept(i);
            } catch (Exception ex) {
                try {
                    E exCast = clazz.cast(ex);
                    System.err.println(
                            "Exception occured : " + exCast.getMessage());
                } catch (ClassCastException ccEx) {
                    throw ex;
                }
            }
        };
    }


    public static void main(String[] args) {
//        List<Integer> integers = Arrays.asList(3, 9, 7, 6, 10, 20);
//        integers.forEach(i -> System.out.println(50 / i));



        List<Integer> integers = Arrays.asList(3, 9, 7, 0, 10, 20);
        integers.forEach(i -> {
            try {
                System.out.println(50 / i);
            } catch (ArithmeticException e) {
                System.err.println(
                        "Arithmetic Exception occured : " + e.getMessage());
            }
        });


        // using lambda wrapper for the lambda function
        List<Integer> integers2 = Arrays.asList(3, 9, 7, 0, 10, 20);
        integers2.forEach(lambdaWrapper(i -> System.out.println(50 / i)));

        // using consumerWrapper
        List<Integer> integers3 = Arrays.asList(3, 9, 7, 0, 10, 20);
        integers3.forEach(
                consumerWrapper(
                        i -> System.out.println(50 / i),
                        ArithmeticException.class));

    }
}
