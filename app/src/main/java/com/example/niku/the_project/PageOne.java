package com.example.niku.the_project;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class PageOne extends AppCompatActivity {
    EditText e1, e2;
    Button b1, b2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page_one);

        b1=(Button)findViewById(R.id.button);
        b2=(Button)findViewById(R.id.button2);
        e1=(EditText)findViewById(R.id.editText);
        e2=(EditText)findViewById(R.id.editText2);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1 = e1.getText().toString();
                String s2 = e2.getText().toString();
                if (s1.equals("")||s2.equals(""))
                {
                    Toast.makeText(PageOne.this, "Fill All", Toast.LENGTH_SHORT).show();
                } else
                {
                    SQLiteDatabase data = openOrCreateDatabase("ipec", MODE_PRIVATE, null);
                    data.execSQL("create table if not exists student (name varchar, password varchar, email varchar)");
                    String s3 = "select * from student where (name='" + s1 + "' and password='" + s2 + "')";
                    Cursor cursor = data.rawQuery(s3, null);
                    if (cursor.getCount() > 0)
                    {
                        Intent i = new Intent(PageOne.this, PageThree.class);
                        startActivity(i);
                        finish();
                    }
                    else
                    {
                        Toast.makeText(PageOne.this, "User Don't Exist", Toast.LENGTH_SHORT).show();
                    }
                }
            }

        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i2=new Intent(PageOne.this, PageTwo.class);
                startActivity(i2);
                finish();
            }
        });
    }
}
