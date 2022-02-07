package ro.fasttrackit.curs16.homework.exercise2;

import java.util.Objects;

public class Electronics implements ShopItem{

    private final Category category;
    private final String name;
    private final int price;

    public Electronics(String name, Category category, int price){
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
        return "Electronics{" +
                "category=" + category +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Electronics that = (Electronics) o;
        return price == that.price && category == that.category && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(category, name, price);
    }
}
