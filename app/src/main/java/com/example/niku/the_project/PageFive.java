package com.example.niku.the_project;

import android.content.Intent;
import android.graphics.Color;
import android.speech.tts.TextToSpeech;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Locale;

public class PageFive extends AppCompatActivity {
    Button b1, b2, b3, b4, b6, b7;
    EditText e1, e2;
    TextView t1;
    TextToSpeech t2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page_five);

        b1 = (Button)findViewById(R.id.button13);
        b2 = (Button)findViewById(R.id.button14);
        b3 = (Button)findViewById(R.id.button15);
        b4 = (Button)findViewById(R.id.button16);
        b6 = (Button)findViewById(R.id.button18);
        b7 = (Button)findViewById(R.id.button19);
        e1 = (EditText)findViewById(R.id.editText8);
        e2 = (EditText)findViewById(R.id.editText9);
        t1 = (TextView)findViewById(R.id.textView3);
        t2 = new TextToSpeech(this, new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int i) {
                t2.setLanguage(Locale.ENGLISH);
                t2.setSpeechRate(0.3f);
            }
        }
        );

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(PageFive.this, PageThree.class);
                startActivity(i);
                finish();
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b2.setBackgroundColor(Color.BLUE);
                String s1 = e1.getText().toString();
                String s2 = e2.getText().toString();
                Float i1 = Float.parseFloat(s1);
                Float i2 = Float.parseFloat(s2);
                Float i3 = i1 + i2;
                String s3 = Float.toString(i3);
                t1.setText(s3);
                Toast.makeText(PageFive.this, "The Result is " + s3, Toast.LENGTH_SHORT).show();
                t2.speak(s3, TextToSpeech.QUEUE_FLUSH, null);
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                b3.setBackgroundColor(Color.BLUE);
                String s1 = e1.getText().toString();
                String s2 = e2.getText().toString();
                Float i1 = Float.parseFloat(s1);
                Float i2 = Float.parseFloat(s2);
                Float i3 = i1 - i2;
                String s3 = Float.toString(i3);
                t1.setText(s3);
                Toast.makeText(PageFive.this, "The Result is " + s3, Toast.LENGTH_SHORT).show();
                t2.speak(s3, TextToSpeech.QUEUE_FLUSH, null);
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b4.setBackgroundColor(Color.BLUE);
                String s1 = e1.getText().toString();
                String s2 = e2.getText().toString();
                Float i1 = Float.parseFloat(s1);
                Float i2 = Float.parseFloat(s2);
                Float i3 = i1 * i2;
                String s3 = Float.toString(i3);
                t1.setText(s3);
                Toast.makeText(PageFive.this, "The Result is " + s3, Toast.LENGTH_SHORT).show();
                t2.speak(s3, TextToSpeech.QUEUE_FLUSH, null);
            }
        });

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b6.setBackgroundColor(Color.BLUE);
                String s1 = e1.getText().toString();
                String s2 = e2.getText().toString();
                Float i1 = Float.parseFloat(s1);
                Float i2 = Float.parseFloat(s2);
                Float i3 = i1 / i2;
                String s3 = Float.toString(i3);
                t1.setText(s3);
                Toast.makeText(PageFive.this, "The Result is " + s3, Toast.LENGTH_SHORT).show();
                t2.speak(s3, TextToSpeech.QUEUE_FLUSH, null);
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b2.setBackgroundColor(Color.WHITE);
                b3.setBackgroundColor(Color.WHITE);
                b4.setBackgroundColor(Color.WHITE);
                b6.setBackgroundColor(Color.WHITE);
                e1.equals("");
                e2.equals("");
                t1.setText("");

            }
        });
    }
}
