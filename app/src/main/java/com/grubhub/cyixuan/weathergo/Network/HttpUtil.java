package com.grubhub.cyixuan.weathergo.Network;
import com.grubhub.cyixuan.weathergo.R;
import com.grubhub.cyixuan.weathergo.Util.HttpCallbackListener;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * Created by cyixuan on 2/8/17.
 * this is the network connection function,
 * WUnderground API request would call this function to connect the network and get response
 */

public class HttpUtil {
    public static void sendHttpRequest(final String address, final HttpCallbackListener listener){
        new Thread(new Runnable(){

            @Override
            public void run() {
                HttpURLConnection connection = null;
                try{
                    URL url = new URL(address);
                    connection = (HttpURLConnection) url.openConnection();
                    connection.setRequestMethod("GET");
                    connection.setConnectTimeout(8000);
                    connection.setReadTimeout(8000);
                    connection.connect();
                    InputStream inputStream = connection.getInputStream();
                    InputStreamReader inputStreamReader = new InputStreamReader(inputStream, "UTF-8");
                    BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
                    StringBuilder response = new StringBuilder();
                    String line;
                    while((line = bufferedReader.readLine())!= null){
                        response.append(line);
                    }
                    if(listener != null){
                        listener.onFinish(response.toString());
                    }
                }
                catch (Exception e) {
                    if(listener != null)
                    {
                        listener.onError(e);
                    }
                }
                finally {
                    if(connection != null){
                        connection.disconnect();
                    }
                }
            }
        }).start();
    }
}
