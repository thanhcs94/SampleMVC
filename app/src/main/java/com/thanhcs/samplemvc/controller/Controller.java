package com.thanhcs.samplemvc.controller;

import android.app.Application;

import com.thanhcs.samplemvc.models.ModelCart;
import com.thanhcs.samplemvc.models.ModelProducts;

import java.util.ArrayList;

/**
 * Created by ThanhCS94 on 3/2/17.
 * I'm HIDING. Don't waste your time to find me.
 */

public class Controller extends Application {

    private ArrayList<ModelProducts> myProducts = new ArrayList<ModelProducts>();
    private ModelCart myCart = new ModelCart();


    public ModelProducts getProducts(int pPosition) {
        return myProducts.get(pPosition);
    }

    public void setProducts(ModelProducts Products) {
        myProducts.add(Products);

    }

    public ModelCart getCart() {
        return myCart;

    }

    public int getProductsArraylistSize() {
        return myProducts.size();
    }

}