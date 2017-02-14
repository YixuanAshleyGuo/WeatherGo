package com.grubhub.cyixuan.weathergo.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.grubhub.cyixuan.weathergo.R;
import com.grubhub.cyixuan.weathergo.Util.ImgLoaderTask;
import com.grubhub.cyixuan.weathergo.model.FCTTIME;
import com.grubhub.cyixuan.weathergo.model.ForecastWeather;
import com.grubhub.cyixuan.weathergo.model.ForecastdaySimple;
import com.grubhub.cyixuan.weathergo.model.HourlyForecast;
import com.grubhub.cyixuan.weathergo.model.WeatherReportUnit;

import java.util.List;

/**
 * Created by cyixuan on 2/12/17.
 */

public class ForecastAdapter extends ArrayAdapter<ForecastdaySimple> {
    private int resourceId;
    private Context context;
    /**
     * Constructor
     *
     * @param context  The current context.
     * @param resource The resource ID for a layout file containing a TextView to use when
     *                 instantiating views.
     * @param objects  The objects to represent in the ListView.
     */
    public ForecastAdapter(Context context, int resource, List<ForecastdaySimple> objects) {
        super(context, resource, objects);
        this.context = context;
        this.resourceId = resource;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ForecastdaySimple ilist = getItem(position);
        View view = LayoutInflater.from(context).inflate(resourceId,null);
        ImageView imageView = (ImageView) view.findViewById(R.id.hourly_list_icon);
        ImgLoaderTask imgLoaderTask = new ImgLoaderTask(imageView);
        imgLoaderTask.execute(ilist.getIcon_url());

        TextView time_view = (TextView) view.findViewById(R.id.hourly_list_time);
        FCTTIME fcttime = ilist.getDate();
        time_view.setText(fcttime.getMon_abbrev()+" "+fcttime.getMday()+", "+fcttime.getYear());

        TextView temp_view = (TextView)view.findViewById(R.id.hourly_list_temp);
        WeatherReportUnit temp_high = ilist.getTemp_high();
        WeatherReportUnit temp_low = ilist.getTemp_low();
        temp_view.setText(temp_low.getEnglish()+" ~ "+temp_high.getEnglish()+" F; "+temp_low.getMetric()+" ~ "+temp_high.getMetric()+" C");

        TextView dewpoint_view = (TextView)view.findViewById(R.id.hourly_list_dewpoint);
        WeatherReportUnit qpf_allday = ilist.getQpf_allday();
        dewpoint_view.setText("QPF: "+qpf_allday.getEnglish()+" "+qpf_allday.getEnglish_name() +"/"+qpf_allday.getMetric()+" "+qpf_allday.getMetric_name());

        TextView condition_view = (TextView)view.findViewById(R.id.hourly_list_condition);
        condition_view.setText(ilist.getCondition());

        TextView wind_view = (TextView)view.findViewById(R.id.hourly_list_wind);
        WeatherReportUnit wspd = ilist.getWind_ave();
        WeatherReportUnit wdir = ilist.getWind_dir_ave();
        wind_view.setText("Wind from the "+wdir.getEnglish()+" at "+wspd.getEnglish()+" MPH/ "+wspd.getMetric()+ "KPH");

        TextView humidity_view = (TextView)view.findViewById(R.id.hourly_list_humidity);
        humidity_view.setText("Humidity: "+ilist.getHumidity_ave()+" %");
        return view;
    }
}
