package com.thanhcs.samplemvc.models;

/**
 * Created by ThanhCS94 on 3/2/17.
 * I'm HIDING. Don't waste your time to find me.
 */

public class ModelProducts {

    private String productName;
    private String productDesc;
    private int productPrice;

    public ModelProducts(String productName,String productDesc,int productPrice)
    {
        this.productName  = productName;
        this.productDesc  = productDesc;
        this.productPrice = productPrice;
    }

    public String getProductName() {

        return productName;
    }

    public String getProductDesc() {

        return productDesc;
    }

    public int getProductPrice() {

        return productPrice;
    }
    @Override
    public String toString() {
        return "ModelProducts{" +
                "productName='" + productName + '\'' +
                ", productDesc='" + productDesc + '\'' +
                ", productPrice=" + productPrice +
                '}';
    }
}
