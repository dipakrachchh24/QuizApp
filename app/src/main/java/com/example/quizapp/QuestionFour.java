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


public class QuestionFour extends Fragment {

    int y4;
    TextView que4;
    RadioGroup ans4;
    RadioButton op1,op2,op3,op4;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_question_four, container, false);
    }
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        que4=(TextView) view.findViewById(R.id.que4);
        ans4=(RadioGroup) view.findViewById(R.id.ans4);
        op1=(RadioButton) view.findViewById(R.id.q4o1);
        op2=(RadioButton) view.findViewById(R.id.q4o2);
        op3=(RadioButton) view.findViewById(R.id.q4o3);
        op4=(RadioButton) view.findViewById(R.id.q4o4);

        DataHolder.getInstance().setData(y4);

        op1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                send();
                //logic for send answer to activity
                //Toast.makeText(getActivity(),"Answer"+Integer.toString(y4),Toast.LENGTH_SHORT).show();
                DataHolder.getInstance().setData(y4);
            }
        });
        op2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                send();
                //logic for send answer to activity
                //Toast.makeText(getActivity(),"Answer"+Integer.toString(y4),Toast.LENGTH_SHORT).show();
                DataHolder.getInstance().setData(y4);
            }
        });
        op3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                send();
                //logic for send answer to activity
                //Toast.makeText(getActivity(),"Answer"+Integer.toString(y4),Toast.LENGTH_SHORT).show();
                DataHolder.getInstance().setData(y4);
            }
        });
        op4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                send();
                //logic for send answer to activity
                //Toast.makeText(getActivity(),"Answer"+Integer.toString(y4),Toast.LENGTH_SHORT).show();
                DataHolder.getInstance().setData(y4);
            }
        });

    }

    private void send() {
        if(op2.getId()==ans4.getCheckedRadioButtonId()){
            y4=1;
        }
        else if(op1.getId()==ans4.getCheckedRadioButtonId() || op3.getId()==ans4.getCheckedRadioButtonId() || op4.getId()==ans4.getCheckedRadioButtonId()){
            y4=-1;
        }
        else{
            y4=0;
        }
    }
}