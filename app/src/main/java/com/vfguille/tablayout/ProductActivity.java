package com.vfguille.tablayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;
import com.vfguille.ProductFragmentAdapter;

public class ProductActivity extends AppCompatActivity {
    private Toolbar toolbar;
    private ViewPager viewPager;
    private TabLayout tabLayout;
    private ProductFragmentAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product);

        toolbar = findViewById(R.id.toolbar);
        viewPager = findViewById(R.id.viewpager);
        tabLayout = findViewById(R.id.tablayout);
        adapter = new ProductFragmentAdapter(getSupportFragmentManager());
        viewPager.setAdapter(adapter);

        setSupportActionBar(toolbar);
        toolbar.setTitle(R.string.app_name);

        tabLayout.setupWithViewPager(viewPager);


    }
}
