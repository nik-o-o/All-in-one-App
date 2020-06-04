package com.example.niku.the_project;

import android.content.Intent;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PageEight extends AppCompatActivity implements SensorEventListener{

    Button b1,b2;
    MediaPlayer mp;
    SensorManager sm;
    Sensor s;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page_eight);

        mp=(MediaPlayer.create(this, R.raw.bb));
        sm=(SensorManager)getSystemService(SENSOR_SERVICE);
        s=sm.getDefaultSensor(Sensor.TYPE_LIGHT);
        sm.registerListener(this,s,SensorManager.SENSOR_DELAY_NORMAL);
        b1 = (Button)findViewById(R.id.button24);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(PageEight.this, PageSeven.class);
                startActivity(i);
                finish();
            }
        });
        b2 = (Button)findViewById(R.id.button25);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp.stop();
                Intent i2 = new Intent(PageEight.this, PageSeven.class);
                startActivity(i2);
                finish();
            }
        });

    }

    @Override
    public void onSensorChanged(SensorEvent sensorEvent) {
        if (sensorEvent.values[0]>4)
        {
            mp.start();
        }
        else
        {
            mp.pause();
        }
    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int i) {

    }
}
