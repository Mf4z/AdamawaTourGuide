package com.example.adamawatourguide;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class CategoryAdapter extends FragmentPagerAdapter {

    /** Context of the app */
    private Context mContext;

    final int PAGE_COUNT = 3;

    public CategoryAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;

    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new AttractionsFragment();
        } else if (position == 1){
            return new HistoricalSitesFragment();
        } else {
            return new EventsFragment();
        }
    }


    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.top_attractions);
        } else if (position == 1) {
            return mContext.getString(R.string.historical_sites);
        } else {
            return mContext.getString(R.string.events);
        }
    }

    @Override
    public int getCount() {
        return PAGE_COUNT;
    }
}
