package com.grubhub.cyixuan.weathergo;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


/**
 * Created by cyixuan on 2/10/17.
 */

public class SettingActivity extends BaseDrawerActivity{
    EditText editText;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getLayoutInflater().inflate(R.layout.zip_input_main, mFrameLayout);
        setTitle("Settings page");
        editText = (EditText)findViewById (R.id.zip_input);
        button = (Button) findViewById(R.id.zip_button);
        button.setOnClickListener(new View.OnClickListener(){

            /**
             * Called when a view has been clicked.
             *
             * @param v The view that was clicked.
             */
            @Override
            public void onClick(View v) {
                String zipcode = editText.getText().toString();
                if(zipcode.length() != 5){
                    Toast.makeText(SettingActivity.this,getString(R.string.askfor_zip_code), Toast.LENGTH_LONG).show();
                }
                else{
                    SharedPreferences.Editor editor= getSharedPreferences("ZIP", Context.MODE_PRIVATE).edit();
                    editor.putString("zipcode",zipcode);
                    editor.apply();
                    /*Navigate the page to main page*/
                    startActivity(new Intent(getApplicationContext(),WeatherMainActivity.class));
                }
            }
        });
    }

    @Override
    protected void onResume() {
        super.onResume();
        mNavigationView.getMenu().getItem(1).setChecked(true);
    }
}
