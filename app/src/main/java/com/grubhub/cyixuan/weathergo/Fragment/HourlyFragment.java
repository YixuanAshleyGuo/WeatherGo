package com.grubhub.cyixuan.weathergo.Fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.grubhub.cyixuan.weathergo.Adapter.HourlyAdapter;
import com.grubhub.cyixuan.weathergo.R;
import com.grubhub.cyixuan.weathergo.WeatherMainActivity;

import static com.grubhub.cyixuan.weathergo.WeatherMainActivity.conditionWeather;

/**
 * Created by cyixuan on 2/8/17.
 * this is the hourly fragment, it shows the hourly weather forecast
 */

public class HourlyFragment extends Fragment implements UpdateableFragment{
    private View hourly_view;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        hourly_view = inflater.inflate(R.layout.hourly_tab_fragment, container, false);
        return hourly_view;
    }

    @Override
    public void update() {
        try {
            TextView start_time = (TextView) hourly_view.findViewById(R.id.hourly_title);

            String hourly_title = "Hourly Weather Prediction at "+conditionWeather.getCurrentObservation().getDisplayLocation().getFull();
            start_time.setText(hourly_title);

            ListView lv = (ListView)hourly_view.findViewById(R.id.hourly_list_view);
            HourlyAdapter hourlyAdapter = new HourlyAdapter(
                    getActivity(),
                    R.layout.forecast_and_hourly_info_list,
                    WeatherMainActivity.hourlyWeather.hourlyForecastList);
            lv.setAdapter(hourlyAdapter);

            Log.v("SHOWWEATHER", (String) start_time.getText());
        }
        catch (Exception e){
//            start_time.setText(R.string.error_msg);
            Toast.makeText(getContext(),R.string.error_msg,Toast.LENGTH_LONG).show();
            e.printStackTrace();
        }
    }
}
