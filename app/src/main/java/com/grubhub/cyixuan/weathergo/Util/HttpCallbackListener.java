package com.grubhub.cyixuan.weathergo.Util;

/**
 * Created by cyixuan on 2/8/17.
 */

public interface HttpCallbackListener {
    void onFinish(String response);

    void onError(Exception e);
}
