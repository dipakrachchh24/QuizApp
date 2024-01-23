package com.example.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;

public class HomeScreenActivity extends AppCompatActivity {

    TextView title;
    EditText name;
    Button start,about;
    String strname;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);

        title=(TextView) findViewById(R.id.title);
        name=(EditText) findViewById(R.id.name);
        start=(Button) findViewById(R.id.btnstart);
        about=(Button) findViewById(R.id.btnabout);

        about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i= new Intent(getApplicationContext(),AboutScreenActivity.class);
                startActivity(i);
            }
        });

        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                strname = name.getText().toString();
                if(strname==null || strname=="" || strname.length()==0){
                    Toast.makeText(getApplicationContext(),"First Enter Your Name to Start a Quiz", Toast.LENGTH_SHORT).show();
                }
                else{
                    Intent i3= new Intent(getApplicationContext(),QuestionScreenActivity.class);
                    i3.putExtra("str",strname);
                    startActivity(i3);
                }
            }
        });
    }
}