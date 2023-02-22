package lambda_with_parameter.fruit_filter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static List<Fruit> filterGreenFruits(List<Fruit> inventory) {
        List<Fruit> result = new ArrayList<>();
        for (Fruit fruit : inventory) {
            if ("green".equals(fruit.getColor())) {
                result.add(fruit);
            }
        }
        return result;
    }
    // Tìm kiếm theo màu sắc
    public static List<Fruit> filterFruitsByColor(List<Fruit> inventory, String color) {
        List<Fruit> result = new ArrayList<>();
        for (Fruit fruit : inventory) {
            if ( color.equals(fruit.getColor())) {
                result.add(fruit);
            }
        }
        return result;
    }

    // Tìm kiếm theo trọng lượng
    public static List<Fruit> filterFruitsByWeight(List<Fruit> inventory, int weight) {
        List<Fruit> result = new ArrayList<>();
        for (Fruit fruit: inventory){
            if ( fruit.getWeight() > weight ){
                result.add(fruit);
            }
        }
        return result;
    }

    // Tìm kiếm theo nhiều điều kiện
    public static <T> List<T> filter(List<T> list, Predicate<T> p) {
        List<T> result = new ArrayList<>();
        for (T e: list) {
            if(p.test(e)) {
                result.add(e);
            }
        }
        return result;
    }
    public static void main(String[] args) {

        List<Fruit> fruits = Arrays.asList(
                new Fruit("apple","red", 10),
                new Fruit("orange","yellow", 20),
                new Fruit("watermelon","red", 20)
        );

        // Cách 0:
        List<Fruit> redFruits0 = filterFruitsByColor(fruits, "red");

        // Cách 1: Tạo 1 interface và Sữ dụng lớp ẩn danh
        List<Fruit> redFruits1 = filter(fruits, new Predicate<Fruit>() {
            @Override
            public boolean test(Fruit fruit) {
                return "red".equals(fruit.getColor());
            }
        });

        // Cách 2: sữ dụng lambda
        // - Tìm kiếm các quả có màu đỏ
        List<Fruit> redFruits = filter(fruits, (Fruit fruit) -> "red".equals(fruit.getColor()));
        redFruits.forEach(fruit -> System.out.println(fruit.getName()));

        System.out.println("------------------------------");

        // - Tìm kiếm các quả có màu đỏ và khối lượng lớn hơn 10
        List<Fruit> redFruitsHasWeightGreaterThan10 = filter(fruits, (Fruit fruit) ->
                "red".equals(fruit.getColor()) && fruit.getWeight() > 10
        );
        redFruitsHasWeightGreaterThan10.forEach(fruit -> System.out.println(fruit.getName()));

    }
}