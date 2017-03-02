package com.thanhcs.samplemvc.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.thanhcs.samplemvc.R;
import com.thanhcs.samplemvc.controller.Controller;

public class SecondActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });

        TextView showCartContent    = (TextView) findViewById(R.id.tv_show_cart);
        final Button thirdBtn       = (Button) findViewById(R.id.btn_third);

        //Get Global Controller Class object (see application tag in AndroidManifest.xml)
        final Controller aController = (Controller) getApplicationContext();

        // Get Cart Size
        final int cartSize = aController.getCart().getCartSize();

        String showString = "";

        /******** Show Cart Products on screen - Start ********/

        if(cartSize >0)
        {
            for(int i=0;i<cartSize;i++)
            {
                //Get product details
                String pName    = aController.getCart().getProducts(i).getProductName();
                int pPrice      = aController.getCart().getProducts(i).getProductPrice();
                String pDisc    = aController.getCart().getProducts(i).getProductDesc();

                showString += "Product Name : "+pName +" Pr ice : "+pPrice+ " Discription : "+pDisc+ "$\n";
            }
        }
        else
            showString = "Shopping cart is empty.";

        showCartContent.setText(showString);

        /******** Show Cart Products on screen - End ********/

        thirdBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(cartSize >0)
                {
                    Intent i = new Intent(getBaseContext(), ThirdActivity.class);
                    startActivity(i);
                }
                else
                    Toast.makeText(getApplicationContext(),
                            "Shopping cart is empty.",
                            Toast.LENGTH_LONG).show();
            }
        });

    }

    @Override
    protected void onDestroy() {

        super.onDestroy();

    }
}