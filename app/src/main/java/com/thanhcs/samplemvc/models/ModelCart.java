package com.thanhcs.samplemvc.models;

import java.util.ArrayList;

/**
 * Created by ThanhCS94 on 3/2/17.
 * I'm HIDING. Don't waste your time to find me.
 */

public class ModelCart {

    private ArrayList<ModelProducts> cartProducts = new ArrayList<ModelProducts>();

    public ModelProducts getProducts(int pPosition) {

        return cartProducts.get(pPosition);
    }

    public void setProducts(ModelProducts Products) {
        cartProducts.add(Products);
    }

    public int getCartSize() {
        return cartProducts.size();

    }

    public boolean checkProductInCart(ModelProducts aProduct) {
        return cartProducts.contains(aProduct);

    }

}