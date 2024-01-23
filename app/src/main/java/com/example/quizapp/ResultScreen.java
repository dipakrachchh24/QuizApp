package com.example.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ResultScreen extends AppCompatActivity {

    int[] array;
    TextView c,i,f;
    Button restart;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result_screen);

        c=(TextView) findViewById(R.id.correct);
        i=(TextView) findViewById(R.id.wrong);
        f=(TextView) findViewById(R.id.total);
        restart=(Button) findViewById((R.id.restart));

        Intent intent = getIntent();
        array=intent.getIntArrayExtra("result");

        c.setText("Correct Answer : "+ array[0]);
        i.setText("Wrong Answer : "+ array[1]);
        f.setText("Final Score : "+array[2]);

        restart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(getApplicationContext(),HomeScreenActivity.class);
                startActivity(intent1);
            }
        });
    }
}