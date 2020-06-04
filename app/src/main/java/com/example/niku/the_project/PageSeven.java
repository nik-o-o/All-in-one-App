package com.example.niku.the_project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PageSeven extends AppCompatActivity {
    Button b1, b2, b3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page_seven);

        b1 = (Button)findViewById(R.id.button21);
        b3 = (Button)findViewById(R.id.button22);
        b2 = (Button)findViewById(R.id.button23);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(PageSeven.this, PageThree.class);
                startActivity(i);
                finish();
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i2 = new Intent(PageSeven.this, PageEight.class);
                startActivity(i2);
                finish();
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i3 = new Intent(PageSeven.this, PageNine.class);
                startActivity(i3);
                finish();
            }
        });

    }
}
