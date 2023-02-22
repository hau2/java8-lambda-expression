package lambda_with_parameter.fruit_filter;

@FunctionalInterface
public interface Predicate<T>{
    boolean test(T t);
}