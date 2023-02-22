package lambda_with_parameter.number_filter;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String [] a)  {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7);

        System.out.println("Print all numbers: ");
        evaluate(list, (n)->true);// test(n) luôn return true

        System.out.println("Print no numbers: ");
        evaluate(list, (n)->false);// test(n) luôn return false

        System.out.println("Print even numbers: ");
        evaluate(list, (n)-> n%2 == 0 );// test(n) return true nếu n chẵn

        System.out.println("Print odd numbers: ");
        evaluate(list, (n)-> n%2 == 1 );// test(n) return true nếu n  lẻ

        System.out.println("Print numbers greater than 5: ");
        evaluate(list, (n)-> n > 5 );// test(n) return true nếu n > 5

    }



    public static void evaluate(List<Integer> list, Predicate<Integer> predicate) {
        for(Integer n: list)  {
            if(predicate.test(n)) {
                System.out.println(n + " ");
            }

        }

    }
}
