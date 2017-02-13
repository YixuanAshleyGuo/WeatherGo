package com.grubhub.cyixuan.weathergo.Util;

import android.content.Context;

import com.grubhub.cyixuan.weathergo.WeatherMainActivity;
import com.grubhub.cyixuan.weathergo.model.ConditionListInfo;
import com.grubhub.cyixuan.weathergo.model.ConditionWeather;
import com.grubhub.cyixuan.weathergo.model.CurrentObservation;
import com.grubhub.cyixuan.weathergo.model.DisplayLocation;
import com.grubhub.cyixuan.weathergo.model.FCTTIME;
import com.grubhub.cyixuan.weathergo.model.ForecastdaySimple;
import com.grubhub.cyixuan.weathergo.model.HourlyForecast;
import com.grubhub.cyixuan.weathergo.model.Image;
import com.grubhub.cyixuan.weathergo.model.ObservationLocation;
import com.grubhub.cyixuan.weathergo.model.WeatherReportUnit;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import static android.util.Log.v;
import static com.grubhub.cyixuan.weathergo.WeatherMainActivity.conditionListInfo;
import static com.grubhub.cyixuan.weathergo.WeatherMainActivity.forecastWeather;
import static com.grubhub.cyixuan.weathergo.WeatherMainActivity.hourlyWeather;

/**
 * Created by cyixuan on 2/8/17.
 * this function is the response parse function,
 * called after HttpUtil, transform the response text into well-format result
 * and later on present on the view
 */

public class Utility {
//    parse the weather information - JSON format data
    private static JSONObject jsonResponse;
    static final String ENGLISH_KEY = "english";
    static final String METRIC_KEY = "metric";
    static final String FAH_KEY = "fahrenheit";
    static final String CEL_KEY = "celsius";
    static final String IN_KEY = "in";
    static final String MM_KEY = "mm";
    static final String CM_KEY = "cm";
    static final String MPH_KEY = "mph";
    static final String KPH_KEY = "kph";


    public static boolean handleWeatherResponse(Context context, String response, int weatherReportId){
        v("UTILITY", "handleWeatherResponse function at "+weatherReportId);
        try{
            jsonResponse = new JSONObject(response);
            switch (weatherReportId){
                case 0:
                    return parseConditionWeather();
                case 1:
                    return parseForecastWeather();
                case 2:
                    return parseHourlyWeather();
                default:
                    return false;
            }
        }
        catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }
    private static boolean parseConditionWeather(){
        try {
            JSONObject current_observation = jsonResponse.getJSONObject("current_observation");
            JSONObject image = current_observation.getJSONObject("image");
            Image mImage = new Image(image.getString("url"),image.getString("title"),image.getString("link"));

            JSONObject display_location = current_observation.getJSONObject("display_location");
            DisplayLocation mDisplayLocation = new DisplayLocation(
                    display_location.getString("full"),
                    display_location.getString("city"),
                    display_location.getString("state"),
                    display_location.getString("state_name"),
                    display_location.getString("country"),
                    display_location.getString("country_iso3166"),
                    display_location.getString("zip"),
                    display_location.getString("latitude"),
                    display_location.getString("longitude"),
                    display_location.getString("elevation"));

            JSONObject observation_location = current_observation.getJSONObject("observation_location");
            ObservationLocation mObservationLocation = new ObservationLocation(
                    observation_location.getString("full"),
                    observation_location.getString("city"),
                    observation_location.getString("state"),
                    observation_location.getString("country"),
                    observation_location.getString("country_iso3166"),
                    observation_location.getString("latitude"),
                    observation_location.getString("longitude"),
                    observation_location.getString("elevation")
            );

            CurrentObservation currentObservation = new CurrentObservation();
            currentObservation.setImage(mImage);
            currentObservation.setDisplayLocation(mDisplayLocation);
            currentObservation.setObservationLocation(mObservationLocation);
            currentObservation.setObservationTime(current_observation.getString("observation_time"));
            currentObservation.setWeather(current_observation.getString("weather"));
            currentObservation.setTemperatureString(current_observation.getString("temperature_string"));
            currentObservation.setRelativeHumidity(current_observation.getString("relative_humidity"));
            currentObservation.setWindString(current_observation.getString("wind_string"));
            currentObservation.setPressureMb(current_observation.getString("pressure_mb"));
            currentObservation.setPressureIn(current_observation.getString("pressure_in"));
            currentObservation.setPressureTrend(current_observation.getString("pressure_trend"));
            currentObservation.setDewpointString(current_observation.getString("dewpoint_string"));
            currentObservation.setFeelslikeString(current_observation.getString("feelslike_string"));
            currentObservation.setVisibilityMi(current_observation.getString("visibility_mi"));
            currentObservation.setVisibilityKm(current_observation.getString("visibility_km"));
            currentObservation.setIcon(current_observation.getString("icon"));
            currentObservation.setIconUrl(current_observation.getString("icon_url"));

            conditionListInfo.clear();
            conditionListInfo.add(new ConditionListInfo("Feels like",current_observation.getString("feelslike_string")));
            conditionListInfo.add(new ConditionListInfo("Visibility",current_observation.getString("visibility_mi")+" mi/ "+current_observation.getString("visibility_km")+" km"));
            conditionListInfo.add(new ConditionListInfo("Relative Humidity",current_observation.getString("relative_humidity")));
            conditionListInfo.add(new ConditionListInfo("Wind",current_observation.getString("wind_string")));
            conditionListInfo.add(new ConditionListInfo("Pressure",current_observation.getString("pressure_mb")+" mb/ "+current_observation.getString("pressure_in")+" in, trend:"+current_observation.getString("pressure_trend")));
            conditionListInfo.add(new ConditionListInfo("Dewpoint",current_observation.getString("dewpoint_string")));
            conditionListInfo.add(new ConditionListInfo("Observation time",current_observation.getString("observation_time")));

            ConditionWeather conditionWeather = new ConditionWeather();
            conditionWeather.setCurrentObservation(currentObservation);
            WeatherMainActivity.conditionWeather = conditionWeather;

            v("UTILITY", "parseConditionWeather: "+currentObservation.getDisplayLocation().getFull()+" --has weather--"+current_observation.getString("weather"));
            return true;
        } catch (JSONException e) {
            e.printStackTrace();
            return false;
        }


    }
    private static boolean parseForecastWeather(){
        try{
            JSONObject forecast = jsonResponse.getJSONObject("forecast");
            JSONObject txt_forecast = forecast.getJSONObject("txt_forecast");
            JSONArray simple_forecastday = forecast.getJSONObject("simpleforecast").getJSONArray("forecastday");

            forecastWeather.setForecast_date(txt_forecast.getString("date"));
            /*iterate the simpleforecast field and get the further 3 days weather forecast*/
            for(int i = 0; i < simple_forecastday.length(); i++){
                JSONObject iforecast = (JSONObject) simple_forecastday.get(i);
                JSONObject date = iforecast.getJSONObject("date");
                FCTTIME fcttime = new FCTTIME(
                        date.getString("hour"),
                        date.getString("hour"),
                        date.getString("min"),
                        date.getString("sec"),
                        date.getString("year"),
                        date.getString("month"),
                        date.getString("monthname"),
                        date.getString("monthname_short"),
                        date.getString("day"),
                        date.getString("day"),
                        date.getString("yday"),
                        date.getString("isdst"),
                        date.getString("epoch"),
                        date.getString("pretty"),
                        "null",
                        date.getString("monthname"),
                        date.getString("monthname_short"),
                        date.getString("weekday"),
                        date.getString("weekday")+" Night",
                        date.getString("weekday_short"),
                        date.getString("weekday"),
                        date.getString("weekday")+" Night",
                        date.getString("ampm"),
                        date.getString("tz_short"),
                        ""
                );
                WeatherReportUnit temp_high = parseWeatherUnitHelper(iforecast,"high","F",FAH_KEY,"C",CEL_KEY);
                WeatherReportUnit temp_low = parseWeatherUnitHelper(iforecast,"low","F",FAH_KEY,"C",CEL_KEY);
                WeatherReportUnit qpf_allday = parseWeatherUnitHelper(iforecast,"qpf_allday","in",IN_KEY,"mm",MM_KEY);
                WeatherReportUnit qpf_day = parseWeatherUnitHelper(iforecast,"qpf_day","in",IN_KEY,"mm",MM_KEY);
                WeatherReportUnit qpf_night = parseWeatherUnitHelper(iforecast,"qpf_night","in",IN_KEY,"mm",MM_KEY);
                WeatherReportUnit snow_allday = parseWeatherUnitHelper(iforecast,"snow_allday","in",IN_KEY,"cm",CM_KEY);
                WeatherReportUnit snow_day = parseWeatherUnitHelper(iforecast,"snow_day","in",IN_KEY,"cm",CM_KEY);
                WeatherReportUnit snow_night = parseWeatherUnitHelper(iforecast,"snow_night","in",IN_KEY,"cm",CM_KEY);
                WeatherReportUnit wind_max = parseWeatherUnitHelper(iforecast,"maxwind","mph",MPH_KEY,"kph",KPH_KEY);
                WeatherReportUnit wind_dir_max = parseWeatherUnitHelper(iforecast,"maxwind","","dir","","degrees");
                WeatherReportUnit wind_ave = parseWeatherUnitHelper(iforecast,"avewind","mph",MPH_KEY,"kph",KPH_KEY);
                WeatherReportUnit wind_dir_ave = parseWeatherUnitHelper(iforecast,"avewind","","dir","","degrees");

                ForecastdaySimple forecastdaySimple = new ForecastdaySimple(
                        fcttime,
                        iforecast.getString("period"),
                        temp_high,
                        temp_low,
                        iforecast.getString("conditions"),
                        iforecast.getString("icon"),
                        iforecast.getString("icon_url"),
                        iforecast.getString("skyicon"),
                        iforecast.getString("pop"),
                        qpf_allday,
                        qpf_day,
                        qpf_night,
                        snow_allday,
                        snow_day,
                        snow_night,
                        wind_max,
                        wind_dir_max,
                        wind_ave,
                        wind_dir_ave,
                        iforecast.getString("avehumidity"),
                        iforecast.getString("maxhumidity"),
                        iforecast.getString("minhumidity")
                );
                forecastWeather.forecastdaySimpleList.add(forecastdaySimple);

            }
            v("UTILITY", "parseConditionWeather for : ----- 3 days forecast");

            return true;
        }
        catch (Exception e){
            e.printStackTrace();
            return false;
        }

    }


    private static boolean parseHourlyWeather(){
        try{
            JSONArray hourly_forecast = jsonResponse.getJSONArray("hourly_forecast");

            for(int i = 0 ; i < hourly_forecast.length(); i++) {
                JSONObject ihourly = (JSONObject) hourly_forecast.get(i);
                JSONObject fcttime_json = ihourly.getJSONObject("FCTTIME");
                FCTTIME fcttime = new FCTTIME(
                        fcttime_json.getString("hour"),
                        fcttime_json.getString("hour_padded"),
                        fcttime_json.getString("min"),
                        fcttime_json.getString("sec"),
                        fcttime_json.getString("year"),
                        fcttime_json.getString("mon"),
                        fcttime_json.getString("mon_padded"),
                        fcttime_json.getString("mon_abbrev"),
                        fcttime_json.getString("mday"),
                        fcttime_json.getString("mday_padded"),
                        fcttime_json.getString("yday"),
                        fcttime_json.getString("isdst"),
                        fcttime_json.getString("epoch"),
                        fcttime_json.getString("pretty"),
                        fcttime_json.getString("civil"),
                        fcttime_json.getString("month_name"),
                        fcttime_json.getString("month_name_abbrev"),
                        fcttime_json.getString("weekday_name"),
                        fcttime_json.getString("weekday_name_night"),
                        fcttime_json.getString("weekday_name_abbrev"),
                        fcttime_json.getString("weekday_name_unlang"),
                        fcttime_json.getString("weekday_name_night_unlang"),
                        fcttime_json.getString("ampm"),
                        fcttime_json.getString("tz"),
                        fcttime_json.getString("age")
                );

                WeatherReportUnit temp = parseWeatherUnitHelper(ihourly,"temp","F", ENGLISH_KEY,"C", METRIC_KEY);
                WeatherReportUnit dewpoint = parseWeatherUnitHelper(ihourly, "dewpoint","F", ENGLISH_KEY,"C", METRIC_KEY);
                WeatherReportUnit wspd = parseWeatherUnitHelper(ihourly, "wspd","MPH", ENGLISH_KEY,"KPH", METRIC_KEY);
                WeatherReportUnit wdir = parseWeatherUnitHelper(ihourly,"wdir","Direction","dir","Degrees","degrees");
                WeatherReportUnit windchill = parseWeatherUnitHelper(ihourly, "windchill","F", ENGLISH_KEY,"C", METRIC_KEY);
                WeatherReportUnit heatindex = parseWeatherUnitHelper(ihourly, "heatindex","F", ENGLISH_KEY,"C", METRIC_KEY);
                WeatherReportUnit feelslike = parseWeatherUnitHelper(ihourly, "feelslike","F", ENGLISH_KEY,"C", METRIC_KEY);
                WeatherReportUnit qpf = parseWeatherUnitHelper(ihourly, "qpf","in", ENGLISH_KEY,"mm", METRIC_KEY);
                WeatherReportUnit snow = parseWeatherUnitHelper(ihourly, "snow","in", ENGLISH_KEY,"cm", METRIC_KEY);
                WeatherReportUnit mslp = parseWeatherUnitHelper(ihourly, "mslp","in", ENGLISH_KEY,"mb", METRIC_KEY);

                HourlyForecast hourlyForecast = new HourlyForecast();
                hourlyForecast.setFcttime(fcttime);
                hourlyForecast.setTemp(temp);
                hourlyForecast.setDewpoint(dewpoint);
                hourlyForecast.setWspd(wspd);
                hourlyForecast.setWdir(wdir);
                hourlyForecast.setWindchill(windchill);
                hourlyForecast.setHeatindex(heatindex);
                hourlyForecast.setFeelslike(feelslike);
                hourlyForecast.setQpf(qpf);
                hourlyForecast.setSnow(snow);
                hourlyForecast.setMslp(mslp);
                hourlyForecast.setCondition(ihourly.getString("condition"));
                hourlyForecast.setIcon(ihourly.getString("icon"));
                hourlyForecast.setIcon_url(ihourly.getString("icon_url"));
                hourlyForecast.setFctcode(ihourly.getString("fctcode"));
                hourlyForecast.setSky(ihourly.getString("sky"));
                hourlyForecast.setWx(ihourly.getString("wx"));
                hourlyForecast.setUvi(ihourly.getString("uvi"));
                hourlyForecast.setHumidity(ihourly.getString("humidity"));
                hourlyForecast.setPop(ihourly.getString("pop"));

                hourlyWeather.hourlyForecastList.add(hourlyForecast);
            }
            v("UTILITY", "parseConditionWeather for : ----- hourly forecast");
            return true;
        }
        catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }

    private static WeatherReportUnit parseWeatherUnitHelper(JSONObject obj, String key, String english_name, String english_key, String metric_name, String metric_key){
        WeatherReportUnit res = new WeatherReportUnit();
        try {
            JSONObject temp_json = obj.getJSONObject(key);
            res.setEnglish_name(english_name);
            res.setEnglish(temp_json.getString(english_key));
            res.setMetric_name(metric_name);
            res.setMetric(temp_json.getString(metric_key));
        }
        catch (Exception e){
            e.printStackTrace();
        }
        finally {
            return res;
        }
    }
}
