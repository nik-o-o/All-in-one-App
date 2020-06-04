package com.example.niku.the_project;

import android.content.Intent;
import android.graphics.Bitmap;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class PageSix extends AppCompatActivity {
    Button b1, b2;
    ImageView w1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page_six);

        b1=(Button)findViewById(R.id.button20);
        b2=(Button)findViewById(R.id.button17);
        w1=(ImageView)findViewById(R.id.imageView3);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(i,0);

            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i2 = new Intent(PageSix.this, PageThree.class);
                startActivity(i2);
                finish();
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        Bitmap bm=(Bitmap)data.getExtras().get("data");
        w1.setImageBitmap(bm);
    }
}

