package lambda_with_parameter.calculation;

public class Main {
    public static void main(String[] args) {
        Calculation addable = (int a, int b) -> (a + b);
        System.out.println(addable.execute(10, 20)); // 30

        Calculation subtraction = (int a, int b) -> (a + b);
        System.out.println(subtraction.execute(10, 20)); // -10

        Calculation multiplication = (int a, int b) -> (a * b);
        System.out.println(multiplication.execute(10, 20)); // 200
    }
}
