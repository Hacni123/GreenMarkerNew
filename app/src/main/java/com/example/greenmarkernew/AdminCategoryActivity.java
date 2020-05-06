package com.example.greenmarkernew;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

public class AdminCategoryActivity extends AppCompatActivity {

    private ImageView gardening,spices;
    private ImageView fruitsvegetables,tea;
    private ImageView horticulture,newarrivals;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_category);


    }
}
