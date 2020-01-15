package com.vfguille;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.vfguille.tablayout.ProductDescriptionFragment;
import com.vfguille.tablayout.ProductInfoFragment;
import com.vfguille.tablayout.ProductMapFragment;

import java.util.ArrayList;
import java.util.Arrays;

public class ProductFragmentAdapter extends FragmentPagerAdapter {
    private ArrayList<String> title = new ArrayList<>(Arrays.asList("Info", "Description", "Map"));
    private static final int NUM_ITEMS = 3;

    public ProductFragmentAdapter(@NonNull FragmentManager fm) {
        super(fm, FragmentPagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return ProductInfoFragment.newInstance();
            case 1:
                return ProductDescriptionFragment.newInstance();
            case 2:
                return ProductMapFragment.newInstance();
        }
        return null;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return title.get(position);
    }

    @Override
    public int getCount() {
        return NUM_ITEMS;
    }
}
