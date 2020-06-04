package com.example.niku.the_project;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PageFour extends AppCompatActivity {
    Button b1,b2,b3;
    MediaPlayer m1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page_four);
        b1 = (Button)findViewById(R.id.button10);
        b2 = (Button)findViewById(R.id.button11);
        b3 = (Button)findViewById(R.id.button12);
        m1 = MediaPlayer.create(this, R.raw.aa);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                m1.start();
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                m1.pause();
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(PageFour.this, PageThree.class);
                startActivity(i);
                finish();
            }
        });
    }
}
