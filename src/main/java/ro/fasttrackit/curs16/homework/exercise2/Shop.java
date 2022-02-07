package ro.fasttrackit.curs16.homework.exercise2;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class Shop<T extends ShopItem> {

    private final List<T> shops;

    public Shop(List<T> shops){
        this.shops=shops== null
                ? new ArrayList<>()
                : new ArrayList<>(shops);;
    }
    public void addItem(T item){
        this.shops.add(item);
    }
    public List<T> getShops(){
        return new ArrayList<>(shops);
    }
    public List<T> findByCategory(Category cat) {
        List<T> result = new ArrayList<>();
        if (cat != null) {

            for (T shop : shops) {
                if (shop.category().equals(cat)) {
                    result.add(shop);
                }
            }
        }else {
            result.addAll(this.shops);
        }
        return result;
    }

    public List<T> findWithLowerPrice(int maxPrice){
        List<T> result = new ArrayList<>();
        if(maxPrice >0){
            for(T shop : shops){
                if(shop.price()<maxPrice){
                    result.add(shop);
                }
            }
        }else{
            result.addAll(this.shops);
        }
        return result;
    }

    /*public Optional<T> findByName(String name){
        Optional<T> result = new ArrayList<>();
        if(name.isPresent.())
    }*/

}
