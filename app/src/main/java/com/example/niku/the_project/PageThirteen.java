package com.example.niku.the_project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

public class PageThirteen extends AppCompatActivity {
    TextView t1;
    Button b1;
    RadioButton r1,r2,r3,r4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page_thirteen);

        t1=(TextView)findViewById(R.id.textView11);
        b1=(Button)findViewById(R.id.button31);
        r1=(RadioButton)findViewById(R.id.radioButton17);
        r2=(RadioButton)findViewById(R.id.radioButton18);
        r3=(RadioButton)findViewById(R.id.radioButton19);
        r4=(RadioButton)findViewById(R.id.radioButton20);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(r3.isChecked())
                {
                    ++PageNine.score;
                }
                else
                {
                    --PageNine.score;
                }
                Intent i=new Intent(PageThirteen.this, PageFourteen.class);
                startActivity(i);
                finish();
            }
        });
    }
}
