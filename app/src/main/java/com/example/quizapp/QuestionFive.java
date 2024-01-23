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


public class QuestionFive extends Fragment {

    int y5;
    TextView que5;
    RadioButton op1,op2,op3,op4;
    RadioGroup ans5;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_question_five, container, false);
    }
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        que5=(TextView) view.findViewById(R.id.que5);
        ans5=(RadioGroup) view.findViewById(R.id.ans5);
        op1=(RadioButton) view.findViewById(R.id.q5o1);
        op2=(RadioButton) view.findViewById(R.id.q5o2);
        op3=(RadioButton) view.findViewById(R.id.q5o3);
        op4=(RadioButton) view.findViewById(R.id.q5o4);

        DataHolder.getInstance().setData(y5);

        op1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                send();
                //logic for send answer to activity
                //Toast.makeText(getActivity(),"Answer"+Integer.toString(y5),Toast.LENGTH_SHORT).show();
                DataHolder.getInstance().setData(y5);
            }
        });
        op2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                send();
                //logic for send answer to activity
                //Toast.makeText(getActivity(),"Answer"+Integer.toString(y5),Toast.LENGTH_SHORT).show();
                DataHolder.getInstance().setData(y5);
            }
        });
        op3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                send();
                //logic for send answer to activity
                //Toast.makeText(getActivity(),"Answer"+Integer.toString(y5),Toast.LENGTH_SHORT).show();
                DataHolder.getInstance().setData(y5);
            }
        });
        op4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                send();
                //logic for send answer to activity
                //Toast.makeText(getActivity(),"Answer"+Integer.toString(y5),Toast.LENGTH_SHORT).show();
                DataHolder.getInstance().setData(y5);
            }
        });

    }

    private void send() {
        if(op4.getId()==ans5.getCheckedRadioButtonId()){
            y5=1;
        }
        else if(op1.getId()==ans5.getCheckedRadioButtonId() || op2.getId()==ans5.getCheckedRadioButtonId() || op3.getId()==ans5.getCheckedRadioButtonId()){
            y5=-1;
        }
        else{
            y5=0;
        }
    }
}
