import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

@FunctionalInterface
interface Addable {
    int add(int a, int b);
}

class AddableImpl implements Addable {
    @Override
    public int add(int a, int b) {
        return a + b;
    }
}

public class LambdaParameters {

    public static void main(String[] args) {
        Addable addition = (int a, int b) -> (a + b);
        System.out.println(addition.add(10, 20));


//        List<Integer> integers = Arrays.asList(3, 9, 7, 0, 10, 20);
//        integers.forEach(i -> {
//            try {
//                System.out.println(50 / i);
//            } catch (ArithmeticException e) {
//                System.err.println(
//                        "Arithmetic Exception occured : " + e.getMessage());
//            }
//        });

//        List<Integer> integers = Arrays.asList(3, 9, 7, 0, 10, 20);
//        integers.forEach(lambdaWrapper(i -> System.out.println(50 / i)));


    }
}
