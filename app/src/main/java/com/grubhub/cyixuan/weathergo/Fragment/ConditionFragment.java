package com.grubhub.cyixuan.weathergo.Fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.grubhub.cyixuan.weathergo.Adapter.ConditionAdapter;
import com.grubhub.cyixuan.weathergo.R;
import com.grubhub.cyixuan.weathergo.Util.ImgLoaderTask;


import static com.grubhub.cyixuan.weathergo.WeatherMainActivity.conditionListInfo;
import static com.grubhub.cyixuan.weathergo.WeatherMainActivity.conditionWeather;

/**
 * Created by cyixuan on 2/8/17.
 * this is the condition fragment, it shows the current weather report
 */

public class ConditionFragment extends Fragment implements UpdateableFragment{
    private View condition_view;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        condition_view = inflater.inflate(R.layout.condition_tab_fragment, container, false);
        return condition_view;
    }

    @Override
    public void update() {
        try {
            TextView title = (TextView) condition_view.findViewById(R.id.condition_title);

            /*update the condition fragment view*/
            title.setText("Current weather condition overview");

            TextView weather = (TextView) condition_view.findViewById(R.id.condition_weather);
            TextView location = (TextView)condition_view.findViewById(R.id.condition_location);
            TextView temperature = (TextView)condition_view.findViewById(R.id.condition_temperature);
            ImageView imageView = (ImageView)condition_view.findViewById(R.id.condition_img);
            /*set the header display, icon, weather, location, temperature info*/

            String weather_info = conditionWeather.getCurrentObservation().getWeather();
            weather.setText(weather_info);
            String location_info = conditionWeather.getCurrentObservation().getDisplayLocation().getFull();
            location.setText(location_info);
            String temperature_info = conditionWeather.getCurrentObservation().getTemperatureString();
            temperature.setText(temperature_info);
            String icon_url = conditionWeather.getCurrentObservation().getIconUrl();
            ImgLoaderTask imgLoaderTask = new ImgLoaderTask(imageView);
            imgLoaderTask.execute(icon_url);

            /*set the main view of condition*/
            ListView lv = (ListView)condition_view.findViewById(R.id.condition_list_view);

            Log.v("SHOWWEATHER","show condition weather of: "+ location.getText());

            ConditionAdapter conditionAdapter = new ConditionAdapter(
                    getActivity(),
                    R.layout.condition_info_list,
                    conditionListInfo);
            lv.setAdapter(conditionAdapter);
        }
        catch (Exception e){
//            title.setText(R.string.error_msg);
            e.printStackTrace();
        }

    }
}
