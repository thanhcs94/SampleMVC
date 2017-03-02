package com.thanhcs.samplemvc.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

import com.thanhcs.samplemvc.R;
import com.thanhcs.samplemvc.controller.Controller;

public class ThirdActivity extends AppCompatActivity {


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        TextView tvShowCartContent    = (TextView) findViewById(R.id.tv_show_cart);

        //Get Global Controller Class object (see application tag in AndroidManifest.xml)
        final Controller aController = (Controller) getApplicationContext();
        int cartSize = aController.getCart().getCartSize();
        String showString = "";

        /******** Show Cart Products on screen - Start ********/

        for(int i=0;i<cartSize;i++)
        {
            //Get product details
            String pName    = aController.getCart().getProducts(i).getProductName();
            int pPrice      = aController.getCart().getProducts(i).getProductPrice();
            String pDisc    = aController.getCart().getProducts(i).getProductDesc();
            showString += "Product Name : "+pName +" Pr ice : "+pPrice+ " Discription : "+pDisc+ "$\n";
        }
        tvShowCartContent.setText(showString);

        /******** Show Cart Products on screen - End ********/

    }
}
