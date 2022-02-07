package ro.fasttrackit.curs16.homework.exercise2;

import java.util.Objects;

public class Clothes implements ShopItem{

    private final Category category;
    private final String name;
    private final int price;

    public Clothes(String name, Category category, int price){
        this.category = category;
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
        return "Clothes{" +
                "category=" + category +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Clothes clothes = (Clothes) o;
        return price == clothes.price && category == clothes.category && Objects.equals(name, clothes.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(category, name, price);
    }
}
