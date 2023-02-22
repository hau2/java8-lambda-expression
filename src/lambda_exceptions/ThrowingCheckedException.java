package lambda_exceptions;

import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ThrowingCheckedException {

    static void writeToFile(Integer integer) throws IOException {
        // logic to write to file which throws IOException
        throw new EOFException();
    }

    static <T> Consumer<T> throwingConsumerWrapper(ThrowingConsumer<T, Exception> throwingConsumer) {

        return i -> {
            try {
                throwingConsumer.accept(i);
            } catch (Exception ex) {
                throw new RuntimeException(ex);
            }
        };
    }

    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(3, 9, 7, 0, 10, 20);
//        integers.forEach(i -> writeToFile(i));

//        List<Integer> integers1 = Arrays.asList(3, 9, 7, 0, 10, 20);
//        integers1.forEach(i -> {
//            try {
//                writeToFile(i);
//            } catch (IOException e) {
//                throw new RuntimeException(e);
//            }
//        });

        List<Integer> integers2 = Arrays.asList(3, 9, 7, 0, 10, 20);
        integers2.forEach(throwingConsumerWrapper(i -> writeToFile(i)));

    }
}
