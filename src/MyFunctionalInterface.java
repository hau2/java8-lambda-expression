@FunctionalInterface
public interface MyFunctionalInterface {

    public void execute();

    public default void print(String text) {
        System.out.println(text);
    }
}
