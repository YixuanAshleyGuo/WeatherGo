package com.grubhub.cyixuan.weathergo.Adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.grubhub.cyixuan.weathergo.Fragment.ConditionFragment;
import com.grubhub.cyixuan.weathergo.Fragment.ForecastFragment;
import com.grubhub.cyixuan.weathergo.Fragment.HourlyFragment;
import com.grubhub.cyixuan.weathergo.Fragment.UpdateableFragment;

/**
 * Created by cyixuan on 2/8/17.
 * this is the pager adapter of the fragment, it takes care of the tab swipe feature
 */

public class PagerAdapter extends FragmentStatePagerAdapter {
    int mNumOfTabs;
    private Fragment [] mFragment;
    public PagerAdapter(FragmentManager fm, int NumOfTabs) {
        super(fm);
        this.mNumOfTabs = NumOfTabs;
        mFragment = new Fragment[3];
        mFragment[0] = new ConditionFragment();
        mFragment[1] = new ForecastFragment();
        mFragment[2] = new HourlyFragment();
    }

    @Override
    public Fragment getItem(int position) {
        if(position < 0 || position >= mNumOfTabs){
            return null;
        }
        return mFragment[position];
        /*switch (position){
            case 0:
                ConditionFragment condition_tab = new ConditionFragment();
                return condition_tab;
            case 1:
                ForecastFragment forecast_tab = new ForecastFragment();
                return forecast_tab;
            case 2:
                HourlyFragment hourly_tab = new HourlyFragment();
                return hourly_tab;
            default:
                return null;
        }*/
    }

    @Override
    public int getCount() {
        return mNumOfTabs;
    }

    @Override
    public int getItemPosition(Object object) {
        if (object instanceof UpdateableFragment) {
            ((UpdateableFragment) object).update();
        }
        return super.getItemPosition(object);
    }
}
