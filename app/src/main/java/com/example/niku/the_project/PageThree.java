package com.example.niku.the_project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class PageThree extends AppCompatActivity {
    Button b1,b2,b3,b4,b5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page_three);

        b1 = (Button)findViewById(R.id.button5);
        b2 = (Button)findViewById(R.id.button6);
        b3 = (Button)findViewById(R.id.button7);
        b4 = (Button)findViewById(R.id.button8);
        b5 = (Button)findViewById(R.id.button9);


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(PageThree.this, PageOne.class);
                startActivity(i);
                finish();
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i2 = new Intent(PageThree.this, PageFour.class);
                startActivity(i2);
                finish();
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i3 = new Intent(PageThree.this, PageFive.class);
                startActivity(i3);
                finish();
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i4 = new Intent(PageThree.this, PageSix.class);
                startActivity(i4);
                finish();
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i5 = new Intent(PageThree.this, PageSeven.class);
                startActivity(i5);
                finish();
            }
        });

    }
}
