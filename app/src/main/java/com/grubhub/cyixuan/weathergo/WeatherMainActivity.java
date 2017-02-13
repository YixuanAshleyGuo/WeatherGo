package com.grubhub.cyixuan.weathergo;

import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AlertDialog;
import android.os.Bundle;
import android.text.InputType;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.common.api.GoogleApiClient;
import com.grubhub.cyixuan.weathergo.Adapter.PagerAdapter;
import com.grubhub.cyixuan.weathergo.Fragment.ConditionFragment;
import com.grubhub.cyixuan.weathergo.Fragment.ForecastFragment;
import com.grubhub.cyixuan.weathergo.Fragment.HourlyFragment;
import com.grubhub.cyixuan.weathergo.Network.HttpUtil;
import com.grubhub.cyixuan.weathergo.Util.HttpCallbackListener;
import com.grubhub.cyixuan.weathergo.Util.Utility;
import com.grubhub.cyixuan.weathergo.model.ConditionListInfo;
import com.grubhub.cyixuan.weathergo.model.ConditionWeather;
import com.grubhub.cyixuan.weathergo.model.ForecastWeather;
import com.grubhub.cyixuan.weathergo.model.HourlyWeather;

import java.util.ArrayList;
import java.util.List;

/**
 * this is the main activity of the application
 * the tabLayout is inspired by Mohit Gupt's example at http://www.truiton.com/2015/06/android-tabs-example-fragments-viewpager/
 */


public class WeatherMainActivity extends BaseDrawerActivity{

    public SharedPreferences sharedPreferences;
    public static ConditionWeather conditionWeather = new ConditionWeather();
    public static List<ConditionListInfo> conditionListInfo = new ArrayList<>();
    public static ForecastWeather forecastWeather = new ForecastWeather();
    public static HourlyWeather hourlyWeather = new HourlyWeather();
    private PagerAdapter mpagerAdapter = null;

//    private DrawerLayout mDrawerLayout;
//    private ActionBarDrawerToggle mDrawerToggle;

    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.nav_drawer_activity_main);
        getLayoutInflater().inflate(R.layout.activity_weather_main, mFrameLayout);
        setTitle("WeatherGo");
        ActionBar actionBar = getSupportActionBar();
       /* actionBar.setLogo(R.drawable.);
        actionBar.setDisplayUseLogoEnabled(true);
        actionBar.setDisplayShowHomeEnabled(true);*/
        init();
    }

    private void init() {

        displayWeather();

        sharedPreferences = getSharedPreferences("ZIP", Context.MODE_PRIVATE);
        String zipcode = sharedPreferences.getString("zipcode", "");
        if ("".equals(zipcode)) {
            ZipInput();
        }
        weatherQueryFromAPI(sharedPreferences.getString("zipcode", getString(R.string.default_zip_code)));
    }

    private void weatherQueryFromAPI(String zipcode) {
/* query the weather information from WUnderground API
* the query keyword is zipcode */
        Toast.makeText(WeatherMainActivity.this,getString(R.string.updating_weather_info),Toast.LENGTH_LONG).show();
        String url = "http://api.wunderground.com/api/{api_key}/{forecast_kind}/q/{zip_code}.json";
        url = url.replace("{api_key}", getString(R.string.weather_go_api_key));
        url = url.replace("{zip_code}", zipcode);
        weatherQueryFromAPIHelper(url,0);
        weatherQueryFromAPIHelper(url,1);
        weatherQueryFromAPIHelper(url,2);
//        mpagerAdapter.notifyDataSetChanged();
        Toast.makeText(WeatherMainActivity.this,getString(R.string.most_updated_weather_info),Toast.LENGTH_LONG).show();
    }

    private void weatherQueryFromAPIHelper(String url, final int weatherReportId) {
        switch (weatherReportId){
            case 0:
                url = url.replace("{forecast_kind}","conditions");
            case 1:
                url = url.replace("{forecast_kind}","forecast");
            case 2:
                url = url.replace("{forecast_kind}","hourly");
        }
        Log.v("URL",url);
        try {
            HttpUtil.sendHttpRequest(url, new HttpCallbackListener() {
                @Override
                public void onFinish(String response) {
//                    Log.v("SENDHTTPREQUEST", response);
                    boolean handleRes = Utility.handleWeatherResponse(WeatherMainActivity.this, response, weatherReportId);
                    if (handleRes){
                        runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                updateWeather(weatherReportId);
                            }
                        });
                    }
                    else{
                        Log.v("HANDLEWEATHER","the weather response NO."+weatherReportId+" cannot be processed");
                    }

                }

                @Override
                public void onError(Exception e) {
                    runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            Log.v("SENDHTTPREQUEST", getString(R.string.error_cannot_fetch_data));
                            Toast.makeText(WeatherMainActivity.this, getString(R.string.error_cannot_fetch_data), Toast.LENGTH_LONG).show();
                        }
                    });
                }
            });

        }
        catch (Exception e){
            e.printStackTrace();
        }

    }

    private void updateWeather(int weatherReportId) {
        Fragment currentFragment = (mpagerAdapter.getItem(weatherReportId));
        if(currentFragment instanceof ConditionFragment){
            ((ConditionFragment) currentFragment).update();
        }
        else if(currentFragment instanceof ForecastFragment){
            ((ForecastFragment) currentFragment).update();
        }
        else if(currentFragment instanceof HourlyFragment){
            ((HourlyFragment) currentFragment).update();
        }
    }


    public void ZipInput() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Zip code Input Dialog");
        final EditText zip_input = new EditText(this);
        zip_input.setInputType(InputType.TYPE_CLASS_NUMBER);
        builder.setView(zip_input);
        builder.setNeutralButton("Apply", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                SharedPreferences.Editor editor = sharedPreferences.edit();

                String zipcode = zip_input.getText().toString();
                if (zipcode.length() != 5) {
//                    handle for invalid zip code input
                    Toast.makeText(WeatherMainActivity.this, getString(R.string.askfor_zip_code), Toast.LENGTH_LONG).show();
                } else {
                    editor.putString("zipcode", zipcode);
                    editor.apply();
/* call the weather query function after getting valid zipcode information */
//                    weatherQueryFromAPI(sharedPreferences.getString("zipcode", Integer.valueOf(R.string.default_zip_code).toString()));
//                    displayWeather();

                    dialog.dismiss();
                }
            }
        });
        builder.show();
    }

    void displayWeather() {
//initiate tabLayout and add three tabs
        TabLayout tabLayout = (TabLayout) findViewById(R.id.tab_layout);
        tabLayout.addTab(tabLayout.newTab().setText("Current Condition"));
        tabLayout.addTab(tabLayout.newTab().setText("Three Day Forecast "));
        tabLayout.addTab(tabLayout.newTab().setText("Hourly Forecast"));
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);

        /* The main function for tab Layout:
        initiate the ViewPager, bind with the pager in main page,
        attach ViewPager to a page change listener of TabLayout,
        attach tabLayout to tab selected listener, when tab is changed,
            fill the ViewPager with corresponding fragment.
        */
        final ViewPager viewPager = (ViewPager) findViewById(R.id.pager);
        mpagerAdapter = new PagerAdapter(getSupportFragmentManager(), tabLayout.getTabCount());
        viewPager.setAdapter(mpagerAdapter);
//        set the number of pages that should be retained to either side of the current page in the view hierarchy in an idle state
        viewPager.setOffscreenPageLimit(tabLayout.getTabCount());
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
        tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.actionbar_buttons, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(mDrawerToggle.onOptionsItemSelected(item)){
            return true;
        }
        int id = item.getItemId();
        if(id == R.id.refresh_button) {
            weatherQueryFromAPI(sharedPreferences.getString("zipcode", getString(R.string.default_zip_code)));
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onResume() {
        super.onResume();
        mNavigationView.getMenu().getItem(0).setChecked(true);
    }
}
