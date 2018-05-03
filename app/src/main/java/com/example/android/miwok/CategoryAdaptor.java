package com.example.android.miwok;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by rajwahalqurashi on 2018-04-25.
 */

public class CategoryAdaptor extends FragmentPagerAdapter {

    public CategoryAdaptor(FragmentManager fm){
        super(fm);
    }
    @Override
    public Fragment getItem(int position){
        if(position==0){
            return new NumbersActivity();
        } else if(position==1){
            return new FamilyFragment();
        } else if(position==2){
            return new ColorFragment();
        }else {
            return PhrasesFragment();
        }
    }
    @Override
    public int getCount(){
        return 4;
    }
}
