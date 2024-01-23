package com.example.quizapp;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;


public class QuestionOne extends Fragment {

    int y1;
    TextView que1;
    RadioGroup ans1;
    RadioButton op1,op2,op3,op4;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_question_one, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        que1=(TextView) view.findViewById(R.id.que1);
        ans1=(RadioGroup) view.findViewById(R.id.ans1);
        op1=(RadioButton) view.findViewById(R.id.q1o1);
        op2=(RadioButton) view.findViewById(R.id.q1o2);
        op3=(RadioButton) view.findViewById(R.id.q1o3);
        op4=(RadioButton) view.findViewById(R.id.q1o4);

        DataHolder.getInstance().setData(y1);

        op1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                send();
                //logic for send answer to activity
                //Toast.makeText(getActivity(),"Answer"+Integer.toString(y1),Toast.LENGTH_SHORT).show();
                DataHolder.getInstance().setData(y1);

            }
        });
        op2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                send();
                //logic for send answer to activity
                //Toast.makeText(getActivity(),"Answer"+Integer.toString(y1),Toast.LENGTH_SHORT).show();
                DataHolder.getInstance().setData(y1);
            }
        });
        op3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                send();
                //logic for send answer to activity
                //Toast.makeText(getActivity(),"Answer"+Integer.toString(y1),Toast.LENGTH_SHORT).show();
                DataHolder.getInstance().setData(y1);
            }
        });
        op4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                send();
                //logic for send answer to activity
                //Toast.makeText(getActivity(),"Answer"+Integer.toString(y1),Toast.LENGTH_SHORT).show();
                DataHolder.getInstance().setData(y1);
            }
        });

    }

    private void send() {
        if(op2.getId()==ans1.getCheckedRadioButtonId()){
            y1=1;
        }
        else if(op1.getId()==ans1.getCheckedRadioButtonId() || op3.getId()==ans1.getCheckedRadioButtonId() || op4.getId()==ans1.getCheckedRadioButtonId()){
            y1=-1;
        }
        else{
            y1=0;
        }
    }


}