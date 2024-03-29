package ru.zhadaev.test.bellintegrator.Task4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class BasketImpl implements Basket {
    HashMap<String, Integer> products = new HashMap<>();

    @Override
    public void addProduct(String product, int quantity) {
        if (products.containsKey(product)) {
            products.replace(product, products.get(product) + quantity);
        } else {
            products.put(product, quantity);
        }
    }

    @Override
    public void removeProduct(String product) {
        products.remove(product);
    }

    @Override
    public void updateProductQuantity(String product, int quantity) {
        if (products.containsKey(product)) {
            products.replace(product, quantity);
        }
    }

    @Override
    public void clear() {
        products.clear();
    }

    @Override
    public List<String> getProducts() {
        return new ArrayList<>(products.keySet());
    }

    @Override
    public int getProductQuantity(String product) {
        if (products.containsKey(product)) {
            return products.get(product);
        }

        return 0;
    }
}
