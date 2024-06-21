package com.i5.common;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    public final List<Product> items;

    public ShoppingCart() {
        items = new ArrayList<>();
    }

    public void addItem(Product item) {
        items.add(item);
    }

    public List<Product> getItems() {
        return items;
    }

}
