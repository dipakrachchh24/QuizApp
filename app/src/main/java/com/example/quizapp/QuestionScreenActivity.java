package com.example.quizapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class QuestionScreenActivity extends AppCompatActivity {

    int correct=0,wrong=0;
    int answer;
    String strname;
    TextView hello,count;
    Button next,quit;
    //Calculation cal = new Calculation();
    int x=1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question_screen);

        hello=(TextView) findViewById(R.id.hello);
        next=(Button) findViewById(R.id.btnnext);
        quit=(Button) findViewById(R.id.btnquit);
        count=(TextView) findViewById(R.id.count);

        Intent i4= getIntent();
        strname=i4.getStringExtra("str");
        hello.setText("Hello "+strname);

        LoadFragment(new QuestionOne());

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                x++;
                if(x<6) {
                    switch (x) {
                        case 1:
                            LoadFragment(new QuestionOne());
//                            Intent intent1 = getIntent();
//                            answer = intent1.getIntExtra("answer1");
//                            calculate(answer);
                            break;
                        case 2:
                            LoadFragment(new QuestionTwo());
                            answer=DataHolder.getInstance().getData();
                            calc(answer);
                            break;
                        case 3:
                            LoadFragment(new QuestionThree());
                            answer=DataHolder.getInstance().getData();
                            calc(answer);
                            break;
                        case 4:
                            LoadFragment(new QuestionFour());
                            answer=DataHolder.getInstance().getData();
                            calc(answer);
                             break;
                        case 5:
                            LoadFragment(new QuestionFive());
                            answer=DataHolder.getInstance().getData();
                            calc(answer);
                            break;
                    }
                }
                else{
                    answer=DataHolder.getInstance().getData();
                    calc(answer);
                    int[] array = {correct,wrong,correct};
                    Intent intent = new Intent(getApplicationContext(),ResultScreen.class);
                    intent.putExtra("result",array);
                    startActivity(intent);
                }

            }
        });

        quit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int[] array = {correct,wrong,correct};
                Intent intent = new Intent(getApplicationContext(),ResultScreen.class);
                intent.putExtra("result",array);
                startActivity(intent);
            }
        });
    }

    private void LoadFragment(Fragment fragment) {

        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fm.beginTransaction();
        fragmentTransaction.replace(R.id.fragment_container,fragment);
        fragmentTransaction.commit();
    }

    private void calc(int z){
        if(z>0){
            correct=correct+1;
            Toast.makeText(getApplicationContext(),"Correct",Toast.LENGTH_SHORT).show();
        } else if (z<0) {
            wrong=wrong+1;
            Toast.makeText(getApplicationContext(),"Wrong",Toast.LENGTH_SHORT).show();
        }
        else{

        }
        count.setText(Integer.toString(correct));
    }
}