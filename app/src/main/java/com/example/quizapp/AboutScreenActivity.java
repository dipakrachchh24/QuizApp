package com.example.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class AboutScreenActivity extends AppCompatActivity {

    Button back;
    TextView devlopers,dummy1,dummy2,email1,email2;
    ImageView profile1,profile2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_screen);

        back=(Button) findViewById(R.id.btnback);
        devlopers=(TextView) findViewById(R.id.devlopers);
        dummy1=(TextView) findViewById(R.id.dummy1);
        dummy2=(TextView) findViewById(R.id.dummy2);
        email1=(TextView) findViewById(R.id.email1);
        email2=(TextView) findViewById(R.id.email2);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i2= new Intent(getApplicationContext(),HomeScreenActivity.class);
                startActivity(i2);
            }
        });
    }
}