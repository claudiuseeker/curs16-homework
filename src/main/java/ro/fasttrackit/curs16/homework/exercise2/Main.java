package ro.fasttrackit.curs16.homework.exercise2;

import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Clothes clothes1 = new Clothes("Bluza", Category.NEW, 15);
        Electronics electronics1= new Electronics("Frigider", Category.REFURBISHED, 500);
        Fruits fruits1= new Fruits("capsuna", Category.NEW,5);
        Shop<Clothes> clothesShop = new Shop<Clothes>(List.of(
                new Clothes("Pantaloni", Category.NEW,23),
                new Clothes("Geaca", Category.REFURBISHED,50),
                new Clothes("Pantofi", Category.ON_SALE,34)
        ));
        Shop<Electronics> electronicsShop = new Shop<Electronics>(List.of(
                new Electronics("Masina de spalat", Category.NEW, 1200),
                new Electronics("Televizor", Category.ON_SALE, 800),
                new Electronics("Camera video", Category.NEW, 450)
        ));
        Shop<Fruits> fruitsShop = new Shop<Fruits>(Collections.singletonList(fruits1));

        System.out.println(clothesShop.getShops());
        clothesShop.addItem(clothes1);
        System.out.println(clothesShop.getShops());
        System.out.println(clothesShop.findByCategory(Category.NEW));
        System.out.println(electronicsShop.getShops());
        electronicsShop.addItem(electronics1);
        System.out.println(electronicsShop.getShops());
        System.out.println(electronicsShop.findWithLowerPrice(1000));


    }
}
