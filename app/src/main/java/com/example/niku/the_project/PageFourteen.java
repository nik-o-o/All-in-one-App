package com.example.niku.the_project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.TextView;

public class PageFourteen extends AppCompatActivity {
    TextView t1;
    Button b1,b2,b3,b4;
    WebView w1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page_fourteen);

        t1=(TextView)findViewById(R.id.textView12);
        w1=(WebView)findViewById(R.id.webView);
        b1=(Button)findViewById(R.id.button32);
        b2=(Button)findViewById(R.id.button33);
        b3=(Button)findViewById(R.id.button34);
        b4=(Button)findViewById(R.id.button35);

        t1.setText("Your Score is : "+PageNine.score);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(PageFourteen.this, PageThree.class);
                startActivity(i);
                finish();
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                w1.loadUrl("http://www.facebook.com");
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                w1.loadUrl("http://www.twitter.com");
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                w1.loadUrl("http://www.netcamp.in");
            }
        });
    }
}
