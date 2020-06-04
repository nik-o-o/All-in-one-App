package com.example.niku.the_project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

public class PageTwelve extends AppCompatActivity {
    TextView t1;
    Button b1;
    RadioButton r1,r2,r3,r4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page_twelve);

        t1=(TextView)findViewById(R.id.textView10);
        b1=(Button)findViewById(R.id.button30);
        r1=(RadioButton)findViewById(R.id.radioButton13);
        r2=(RadioButton)findViewById(R.id.radioButton14);
        r3=(RadioButton)findViewById(R.id.radioButton15);
        r4=(RadioButton)findViewById(R.id.radioButton16);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(r4.isChecked())
                {
                    ++PageNine.score;
                }
                else
                {
                    --PageNine.score;
                }
                Intent i=new Intent(PageTwelve.this, PageThirteen.class);
                startActivity(i);
                finish();
            }
        });
    }
}
