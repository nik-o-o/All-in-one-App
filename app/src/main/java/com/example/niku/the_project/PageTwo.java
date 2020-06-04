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

public class PageTwo extends AppCompatActivity {
    EditText e1, e2, e3, e4, e5;
    Button b1, b2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page_two);

        b1 = (Button)findViewById(R.id.button3);
        b2 = (Button)findViewById(R.id.button4);
        e1 = (EditText)findViewById(R.id.editText3);
        e2 = (EditText)findViewById(R.id.editText4);
        e3 = (EditText)findViewById(R.id.editText5);
        e4 = (EditText)findViewById(R.id.editText6);
        e5 = (EditText)findViewById(R.id.editText7);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(PageTwo.this, PageOne.class);
                startActivity(i);
                finish();
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1 = e1.getText().toString();
                String s2 = e2.getText().toString();
                String s3 = e3.getText().toString();
                String s4 = e4.getText().toString();
                String s5 = e5.getText().toString();

                if(s1.equals("")||s2.equals("")||s3.equals("")||s4.equals("")||s5.equals(""))
                {
                    Toast.makeText(PageTwo.this, "Fill All!", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    SQLiteDatabase data=openOrCreateDatabase("ipec",MODE_PRIVATE,null);
                    data.execSQL("create table if not exists student (name varchar, password varchar, email varchar, city varchar, phone varchar)");
                    String s6="select * from student where (name='"+s1+"' and password='"+s2+"')";
                    Cursor cursor=data.rawQuery(s6, null);
                    if(cursor.getCount()>0)
                    {
                        Toast.makeText(PageTwo.this, "User Exists", Toast.LENGTH_SHORT).show();
                    }
                    else
                    {
                        data.execSQL("insert into student values('"+s1+"', '"+s2+"', '"+s3+"', '"+s4+"', '"+s5+"')");
                        Toast.makeText(PageTwo.this, "Database updated", Toast.LENGTH_SHORT).show();
                    }

                }
            }
        });
    }
}
