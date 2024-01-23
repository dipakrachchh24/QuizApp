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


public class QuestionThree extends Fragment {

    int y3;
    TextView que3;
    RadioGroup ans3;
    RadioButton op1,op2,op3,op4;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_question_three, container, false);
    }
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        que3=(TextView) view.findViewById(R.id.que3);
        ans3=(RadioGroup) view.findViewById(R.id.ans3);
        op1=(RadioButton) view.findViewById(R.id.q3o1);
        op2=(RadioButton) view.findViewById(R.id.q3o2);
        op3=(RadioButton) view.findViewById(R.id.q3o3);
        op4=(RadioButton) view.findViewById(R.id.q3o4);

        DataHolder.getInstance().setData(y3);

        op1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                send();
                //logic for send answer to activity
                //Toast.makeText(getActivity(),"Answer"+Integer.toString(y3),Toast.LENGTH_SHORT).show();
                DataHolder.getInstance().setData(y3);
            }
        });
        op2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                send();
                //logic for send answer to activity
                //Toast.makeText(getActivity(),"Answer"+Integer.toString(y3),Toast.LENGTH_SHORT).show();
                DataHolder.getInstance().setData(y3);
            }
        });
        op3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                send();
                //logic for send answer to activity
                //Toast.makeText(getActivity(),"Answer"+Integer.toString(y3),Toast.LENGTH_SHORT).show();
                DataHolder.getInstance().setData(y3);
            }
        });
        op4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                send();
                //logic for send answer to activity
                //Toast.makeText(getActivity(),"Answer"+Integer.toString(y3),Toast.LENGTH_SHORT).show();
                DataHolder.getInstance().setData(y3);
            }
        });

    }

    private void send() {
        if(op1.getId()==ans3.getCheckedRadioButtonId()){
            y3=1;
        }
        else if(op2.getId()==ans3.getCheckedRadioButtonId() || op3.getId()==ans3.getCheckedRadioButtonId() || op4.getId()==ans3.getCheckedRadioButtonId()){
            y3=-1;
        }
        else{
            y3=0;
        }
    }
}