package lambda_with_parameter.fruit_filter;

public class Fruit {
    private String name;
    private String color;
    private int weight;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Fruit(String name, String color, int weight) {
        this.name = name;
        this.color = color;
        this.weight = weight;
    }
}
