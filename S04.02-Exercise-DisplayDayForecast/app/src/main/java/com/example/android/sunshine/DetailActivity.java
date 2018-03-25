package com.example.android.sunshine;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    private static final String FORECAST_SHARE_HASHTAG = " #SunshineApp";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        TextView putWeatherDetail=(TextView)findViewById(R.id.display_weather_text);
        Intent recieve=getIntent();
        String data="";
        if(recieve.hasExtra(Intent.EXTRA_TEXT)){
            data=recieve.getExtras().get(Intent.EXTRA_TEXT).toString();
        }
        if(data!=""){
            putWeatherDetail.setText(data);
        }
        // COMPLETED (2) Display the weather forecast that was passed from MainActivity
    }
}