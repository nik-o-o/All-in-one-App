package com.example.niku.the_project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

public class PageNine extends AppCompatActivity {
    TextView t1;
    Button b1,b2;
    RadioButton r1,r2,r3,r4;
    static int score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page_nine);

        t1=(TextView)findViewById(R.id.textView7);
        b1=(Button)findViewById(R.id.button27);
        b2=(Button)findViewById(R.id.button26);
        r1=(RadioButton)findViewById(R.id.radioButton);
        r2=(RadioButton)findViewById(R.id.radioButton2);
        r3=(RadioButton)findViewById(R.id.radioButton3);
        r4=(RadioButton)findViewById(R.id.radioButton4);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                score = 0;
                if(r3.isChecked())
                {
                    ++score;
                }
                else
                {
                    --score;
                }
                Intent i=new Intent(PageNine.this, PageTen.class);
                startActivity(i);
                finish();
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i2 = new Intent(PageNine.this, PageSeven.class);
                startActivity(i2);
                finish();
            }
        });
    }
}
