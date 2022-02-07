package ro.fasttrackit.curs16.homework.exercise2;

import java.util.Objects;

public class Fruits implements ShopItem{

    private final Category category;
    private final String name;
    private final int price;

    public Fruits(String name, Category category, int price){
        this.category=category;
        this.name=name;
        this.price= price;
    }

    @Override
    public String name() {
        return name;
    }

    @Override
    public int price() {
        return price;
    }

    @Override
    public Category category() {
        return category;
    }

    @Override
    public String toString() {
        return "Fruits{" +
                "category=" + category +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Fruits fruits = (Fruits) o;
        return price == fruits.price && category == fruits.category && Objects.equals(name, fruits.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(category, name, price);
    }
}
