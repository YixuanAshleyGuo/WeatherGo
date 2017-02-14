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

import com.grubhub.cyixuan.weathergo.Adapter.ForecastAdapter;
import com.grubhub.cyixuan.weathergo.R;

import static com.grubhub.cyixuan.weathergo.WeatherMainActivity.conditionWeather;
import static com.grubhub.cyixuan.weathergo.WeatherMainActivity.forecastWeather;

/**
 * Created by cyixuan on 2/8/17.
 * this is the forecast fragment, it shows the future three days weather forecast
 */

public class ForecastFragment extends Fragment implements UpdateableFragment{
    private View forecast_view;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        forecast_view = inflater.inflate(R.layout.forecast_tab_fragment, container, false);
        return forecast_view;
    }

    @Override
    public void update() {
        try {
            TextView start_time = (TextView)forecast_view.findViewById(R.id.forecast_title);

            String forecast_title = "3 Days Weather Forecast at "
                    + conditionWeather.getCurrentObservation().getDisplayLocation().getFull();
            start_time.setText(forecast_title);

            ListView lv = (ListView) forecast_view.findViewById(R.id.forecast_list_view);
            ForecastAdapter forecastAdapter = new ForecastAdapter(
                    getActivity(),
                    R.layout.forecast_and_hourly_info_list,
                    forecastWeather.forecastdaySimpleList);
            lv.setAdapter(forecastAdapter);
            Log.v("SHOWWEATHER", (String) start_time.getText());
        }
        catch (Exception e){
//            start_time.setText(R.string.error_msg);
            Toast.makeText(getContext(),R.string.error_msg,Toast.LENGTH_LONG).show();
            e.printStackTrace();
        }

    }
}
