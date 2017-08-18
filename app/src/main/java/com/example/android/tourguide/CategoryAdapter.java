package com.example.android.tourguide;

import android.content.Context;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;


public class CategoryAdapter extends FragmentPagerAdapter {
    private Context mContext;


    public CategoryAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public android.support.v4.app.Fragment getItem(int position) {
        if (position == 0) {
            return new RestaurantsFragment();
        } else if (position == 1) {
            return new EntertainmentFragment();
        } else if (position == 2){
            return new ParksFragment();
        }else if (position == 3);
        return new SchoolsFragment();
        }


    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if(position ==0){
            return  mContext.getString(R.string.category_restaurants);
        }else if (position == 1) {
            return mContext.getString(R.string.category_entertainment);
        }else if (position == 2) {
            return mContext.getString(R.string.category_parks);
        }else if (position == 3);
        return mContext.getString(R.string.category_schools);
    }
}
